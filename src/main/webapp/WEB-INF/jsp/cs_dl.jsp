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
	href="../resources/css/pageStyle.css">

<link rel="stylesheet" type="text/css"
	href="../resources/css/navStyle.css">

<link rel="stylesheet" type="text/css"
	href="../resources/css/footerStyle.css">
<title>CSDL</title>
</head>
<body>
	<%@include file="../nav.html"%>
	<p>${sessionScope.user.name}</p>
	<div>
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
					<div class="btn-group">
						<button class="btn btn1" type="button">
							<img src="../resources/images/windows.png"><strong>WINDOWS版</strong>
						</button>
						<button type="button"
							class="btn dropdown-toggle dropdown-toggle-split btn_select"
							data-toggle="dropdown">
							<strong>x86</strong>
						</button>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="#">x86</a> <a
								class="dropdown-item" href="#">x64</a>
						</div>
					</div>
					<button class="btn2">
						<img src="../resources/images/mac.png"><strong>MAC版</strong>
					</button>
				</div>
			</div>
		</c:forEach>
	</div>
	<div style="text-align: center">
		<a href="?start=0">首 页</a> <a href="?start=${page.start-page.count}">上一页</a>
		<a href="?start=${page.start+page.count}">下一页</a> <a
			href="?start=${page.last}">末 页</a>
	</div>

	<%@include file="../footer.html"%>
</body>
</html>