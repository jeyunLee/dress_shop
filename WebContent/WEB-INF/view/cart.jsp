<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>이미지</td>
		<td>상풍명</td>
		<td>가격</td>
		<td>수량</td>
		<td></td>
	</tr>
	<c:forEach var="result" items="${result}">
		<tr>
			<td>${result.image_address}</td>
			<td>${result.product_name}</td>
			<td>${result.price}</td>
			<td><input type="text" name="qty" value="${result.qty}" /></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>