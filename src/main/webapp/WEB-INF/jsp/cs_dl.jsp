<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="../resources/css/pageStyle.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list}" var="list" varStatus="st">
		<div class="items">
			<div class="item_img"></div>
			<div class="c1">
				<p>${list.name}</p>
				<p>${list.intro}</p>
			</div>
			<div class="c2"></div>
		</div>
	</c:forEach>
</body>
</html>