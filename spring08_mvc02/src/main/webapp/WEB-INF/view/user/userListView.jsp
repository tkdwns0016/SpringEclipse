<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>유저 화면 리스트</h1>
	<c:forEach var="user" items="${userList }">
		<section>
			id : ${user.id }<br>
			유저아이디 : ${user.userId }<br>
			비밀번호 : ${user.password }<br>
			생일 : ${user.birthDate }<br>
			휴대폰 번호 : ${user.phone }<br>
			주소 : ${user.address }<br>
			가입날 : ${user.joinedDate }<br>
		</section>
		<hr>
	</c:forEach>

</body>
</html>