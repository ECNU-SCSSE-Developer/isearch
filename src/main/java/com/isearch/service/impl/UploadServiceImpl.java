package com.isearch.service.impl;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.isearch.entity.UploadedImageFile;
import com.isearch.service.UploadService;

@Service
public class UploadServiceImpl implements UploadService {

	private static Logger logger = Logger.getLogger(UploadServiceImpl.class);
	
	
	/*上传图片资源至ftp服务器*/
	public boolean uploadFile(UploadedImageFile file) {
		//读取properties文件内内容
		Properties prop = new Properties();
		logger.info(System.getProperty("user.dir"));
        try {
			prop.load(this.getClass().getResourceAsStream("ftp.properties"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}     ///加载属性列表
        
        
		boolean result = false;
		FTPClient ftp = new FTPClient();
		// 传输的字符编码(防乱码)
		ftp.setControlEncoding("UTF-8");

		String name = file.getImage().getOriginalFilename();
		File newFile = new File(name);

		try {
			file.getImage().transferTo(newFile);
			int reply;
			ftp.connect(prop.getProperty("host"));// 连接FTP服务器
			ftp.login(prop.getProperty("username"),prop.getProperty("password"));// 登录
			reply = ftp.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				logger.error("连接服务器失败");
				ftp.disconnect();
				return result;
			}
			logger.info("FTP登录成功，FTP IP:" + ftp.getRemoteAddress());

			logger.info("当前工作目录为：" + ftp.printWorkingDirectory());
			// 设置工作目录
			//ftp.changeWorkingDirectory("mysql-images/isearch");
			System.out.println("设置工作目录为：" + ftp.printWorkingDirectory());

			// 为了加大上传文件速度，将InputStream转成BufferInputStream
			FileInputStream fileInputStream = new FileInputStream(newFile);
			BufferedInputStream in = new BufferedInputStream(fileInputStream);

			// 加大缓存区
			ftp.setBufferSize(1024 * 1024);

			// 设置上传文件的类型为二进制类型
			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			
			
			// 上传文件
			if (!ftp.storeFile(name, fileInputStream)) {
				logger.info("上传失败");
				return result;
			}

			logger.info("上传成功!");
			in.close();
			ftp.logout();
			result = true;

		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ftp.isConnected()) {
				try {
					ftp.disconnect();
				} catch (IOException ioe) {
				}
			}
		}
		return result;

	}

}
