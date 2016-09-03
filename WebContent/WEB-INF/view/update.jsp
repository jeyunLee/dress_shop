<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>개인정보수정</h1>
	<form method="post" action="modify_result">
		아이디 : <input type="text" name="id" value="${result.id}" readonly /><br /> 
		비밀번호 : <input type="password" name="password" value="${result.password}"  /><br />
		비밀번호확인 : <input type="password" value="${result.password}" /><br /> 
		이름 : <input type="text" name="name" value="${result.name}" readonly /><br /> 
		생년월일 : <input type="text" name="birth" value="${result.birth}" readonly /><input type="radio" name="gender" value="female" />여 <input type="radio" name="gender" value="male" />남<br />
		우편번호 : <input type="text" name="zipcode" value="${result.zipcode}" /><input type="button" value="우편번호찾기" /><br /> 
			주소 : <input type="text" name="address1" value="${result.address1}" /><br /> 
			<input type="text" name="address2" value="${result.address2}" /><br />
		자택전화번호 : <input type="text" name="telePhone" value="${result.telePhone}" /><br /> 
		휴대전화번호 : <input type="text" name="cellPhone" value="${result.cellPhone}" /><br /> 
		이메일 : <input type="email" name="email" value="${result.email}" /><input type="button" value="중복확인" /><br /> 
		<input type="submit" value="정보수정" /><input type="reset" value="다시쓰기" />
	</form>
</body>
</html>