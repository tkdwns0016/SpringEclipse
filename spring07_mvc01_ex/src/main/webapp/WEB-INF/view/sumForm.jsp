<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/calcul/sum" method="post">
		<input type="number" name="num1" placeholder="숫자 1"> 
		<input type="number" name="num2" placeholder="숫자 2"> 
		<input type="submit" value="더하기" >
	</form>
	
</body>
</html>