<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<td>상품명</td>
				<td>상품설명</td>
				<td>가격</td>
			</tr>
		<c:forEach var="result" items="${result}">
			<tr>
				
				<td><input type="text" name="image_address" value="${result.image_address}" readonly></td>
				<td><input type="text" name="product_name" value="${result.product_name}" readonly></td>
				<td><input type="text" name="description" value="${result.description}" readonly></td>
				<td><input type="text" name="price" value="${result.price}" readonly></td>
				<td><a href="product_delete?product_id=${result.product_id}">삭제</a></td>
				<td><a href="product_list?product_id=${result.product_id}">수정</a></td>
				<td><a href="cart_product?product_id=${result.product_id}">장바구니담기</a></td>
				<td></td>
			</tr>
		</c:forEach>
			<tr><td><a href="add_product.html">등록</a></td></tr>
</table>
</body>
</html>