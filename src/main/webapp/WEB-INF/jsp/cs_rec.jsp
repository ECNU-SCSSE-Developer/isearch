<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<!-- popper.min.js 用于弹窗、提示、下拉菜单 -->
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<!-- 最新的 Bootstrap4 核心 JavaScript 文件 -->
<script
	src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<!-- 自己的css一定要在bootstrap之后引入才能覆盖bootstrap中的样式 -->
<link rel="stylesheet" type="text/css"
	href="../resources/css/recPageStyle.css">
<title>CSREC</title>
</head>
<body>
	<c:forEach items="${list}" var="list" varStatus="st">
		<div class="items">
			<div class="item_img">
				<img src="../resources/images/git.png">
			</div>
			<div class="c1">
				<p>
					<strong>${list.name}</strong>
				</p>
				<p class="intro">${list.intro}</p>
			</div>
			<div class="c2">
				<a href="${list.ow}" target="_blank">
					<button class="btn2">
						<strong>进入官网</strong>
					</button>
				</a>
			</div>
		</div>
	</c:forEach>

	<div style="text-align: center">
		<a href="?start=0">首 页</a> <a href="?start=${page.start-page.count}">上一页</a>
		<a href="?start=${page.start+page.count}">下一页</a> <a
			href="?start=${page.last}">末 页</a>
	</div>
</body>
</html>