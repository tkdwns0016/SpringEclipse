<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>더하기 입력창</h1>
	<form action="${pageContext.request.contextPath }/calcul/sum"
		method="post">
		<input type="number" name="num1" placeholder="숫자 1"> 
		<input type="number" name="num2" placeholder="숫자 2"> 
		<input type="submit" value="더하기!">
	</form>
</body>
</html>