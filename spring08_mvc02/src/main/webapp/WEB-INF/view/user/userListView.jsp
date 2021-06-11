<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userListView.jsp</title>
<!-- resource를 설정해놓고 href의 위치로 지정하여 실행하면 맵핑되어있는 주소로 안내하여 찾을 수 있게 해준다. -->
<link rel="stylesheet" type="text/css" href="/resources/css/userList.css">
</head>
<body>
	<h1>유저 화면 리스트</h1>
	<div class="container">
		<c:forEach var="user" items="${userList }">
			<section>
				id : ${user.id }<br> 유저아이디 : ${user.userId }<br> 비밀번호 :
				${user.password }<br> 생일 : ${user.birthDate }<br> 휴대폰 번호 :
				${user.phone }<br> 주소 : ${user.address }<br>
				<fmt:parseDate var="parsedDateTime" value="${user.joinedDate }"
					pattern="yyyy-MM-dd'T'HH:mm" />
				<fmt:formatDate var="jd" value="${parsedDateTime }"
					pattern="yyyy-MM-dd HH:mm" />
				가입날 : ${jd }<br> <a href="/user/update?id=${user.id}">수정</a> <a
					href="/user/delete?id=${user.id}">삭제</a>
			</section>
			<hr>
		</c:forEach>
	</div>
</body>
</html>