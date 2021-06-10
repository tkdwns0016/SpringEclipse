<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateForm.jsp</title>
</head>
<body>
	<h1>수정화면</h1>
	
	<c:if test="${empty user }">
		<b>수정 할 데이터가 없습니다.</b>
		<a href="/user/list">목록으로 돌아가기</a>
	</c:if>
	
	
	<c:if test="${not empty user }">
	<form action="/user/update" method="post">
		<input type="text" name="id" readonly="readonly" value="${user.id } "><br>
		<input type="text" name="userId" placeholder="아이디를 입력하세요" value="${user.userId }"><br>
		<input type="password" name="password" placeholder="비밀번호를 입력하세요" value="${user.password }"><br>
		생년월일 : <input type="date" name="birthDate" max="2021-06-10" value="${user.birthDate }"><br>
		<input type="tel" name="phone" placeholder="전화번호를 입력하세요" pattern="[01]{3}-[0-9]{4}-[0-9]{4}" value="${user.phone }"><br>
		<input type="text" name="address" placeholder="주소를 입력해주세요" value="${user.address }"><br>
		가입일 : <input type="datetime-local" name="joinedDate" value="${user.joinedDate }"><br>
		<input type="submit" value="수정">
	</form>
	</c:if>
</body>
</html>