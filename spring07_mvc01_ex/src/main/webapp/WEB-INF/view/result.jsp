<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
<h1>결과 : ${result }</h1>
<form action="${pageContext.request.contextPath}/calcul/sum" method="get"><input type="submit" value="덧셈으로 돌아가기"></form>
<form action="${pageContext.request.contextPath}/calcul/sub" method="get"><input type="submit" value="뺄셈으로 돌아가기"></form>
<form action="${pageContext.request.contextPath}/calcul/mul" method="get"><input type="submit" value="곱셈으로 돌아가기"></form>
<form action="${pageContext.request.contextPath}/calcul/div" method="get"><input type="submit" value="나눗셈으로 돌아가기">
 <button><a href=""/></button></form>
</body>
</html>