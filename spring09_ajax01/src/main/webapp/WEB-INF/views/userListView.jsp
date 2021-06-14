<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>userListView.jsp</title>
</head>
<body>
	<h1>유저 리스트 페이지</h1>
	<c:forEach var="user" items="${userList }">
		유저번호 : ${user.id }<br>
		유저 아이디 : ${user.userId }<br>
		비밀번호 : ${user.password }<br>
		생년월일 : ${user.birthDate }<br>
		폰번호 : ${user.phone }<br>
		주소 : ${user.address }<br>
		<fmt:parseDate var="jd" pattern="yyyy-MM-dd'T'HH:mm" value="${user.joinedDate }"/>
		<fmt:formatDate value="${jd }" pattern="yyyy-MM-dd HH:mm" var="joinedDate"></fmt:formatDate>
		가입일 : ${joinedDate }<br>
		<hr>
	</c:forEach>
</body>
</html>