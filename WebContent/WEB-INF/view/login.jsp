<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="logout" method="get">
		<p>${result.id}님</p>
		<p>접속하셨습니다.</p>
		<input type="submit" value='로그아웃' />
	</form>
<!-- 	<form action="update" method="get"><input type= -->
	<a href="<c:url value='/update'/>">회원정보수정</a>
	<a href="delete.html">회원탈퇴</a>
</body>
</html>