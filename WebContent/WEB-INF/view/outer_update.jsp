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
				<td>분류번호</td>
				<td>상세분류번호</td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		
			<form method="POST" action="product_update">
			<tr>
				<td><input type="text" name="category_id" value="${result.category_id}"></td>
				<td><input type="text" name="item_id" value="${result.item_id}"></td>
				<td><input type="text" name="product_id" value="${result.product_id}" readonly></td>
				<td><input type="text" name="image_address" value="${result.image_address}"></td>
				<td><input type="text" name="product_name" value="${result.product_name}"></td>
				<td><input type="text" name="description" value="${result.description}"></td>
				<td><input type="text" name="price" value="${result.price}"></td>
				<td><input type="text" name="size" value="${result.size}"></td>
				<td><input type="text" name="color" value="${result.color}"></td>
			<tr>
			<tr><td><button type="submit">수정</button></td></tr>
			</form>
		
		</table>
</body>
</html>