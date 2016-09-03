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
		<c:forEach var="result" items="${result}">
			<tr>

				<td>${result.image_address}</td>
				<td>${result.product_name}</td>
				<td>${result.description}</td>
				<td>${result.price}</td>
			</tr>
		</c:forEach>
		</table>
</body>
</html>