<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<c:if test="${empty resultUser}">
			<h1>삽입에 실패했습니다.</h1>
	</c:if>
	<c:if test="${not empty resultUser }">
		<h1>삽입된 유저 정보</h1>
		<section>
			id : ${user.id }<br>
			유저아이디 : ${user.userId }<br>
			비밀번호 : ${user.password }<br>
			생일 : ${user.birthDate }<br>
			휴대폰 번호 : ${user.phone }<br>
			주소 : ${user.address }<br>
			가입날 : ${user.joinedDate }<br>
		</section>
	</c:if>
	<a href="/user/list"><h3>목록으로 돌아가기</h3></a>
</body>
</html>