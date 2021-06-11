<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result.jsp</title>
</head>
<body>
	<c:if test="${empty marvel }">
		<h1>영화 입력 실패!</h1>
	</c:if>
	<c:if test="${not empty marvel }">
		<div>
			마블ID No.${marvel.marvelId }<br>
			한글 제목 : ${marvel.title }<span>　　　</span>영문 제목 : ${marvel.titleEng }<br>
			개봉일 : ${marvel.releaseDate }<br>
			월드 박스 오피스 : ${marvel.worldBoxOffice }<br>
			<fmt:parseDate var="writeDate" value="${marvel.writeDate }" pattern="yyyy-MM-dd'T'HH:mm:ss"/>
			<fmt:formatDate var="wd" value="${writeDate }" pattern="yyyy-MM-dd HH:mm:ss"/>
			<fmt:parseDate var="updateDate" value="${marvel.updateDate }" pattern="yyyy-MM-dd'T'HH:mm:ss"/>
			<fmt:formatDate var="ud" value="${updateDate }" pattern="yyyy-MM-dd HH:mm:ss"/>
			<c:if test="${marvel.writeDate==marvel.updateDate }">
			작성일 : ${wd }<br>
			</c:if>
			<c:if test="${marvel.writeDate!=marvel.updateDate }">
			작성일 : ${wd }   수정일 : ${ud }<br>
			</c:if>
		</div>
	</c:if>
	<a href="/marvel/list">돌아가기</a>
</body>
</html>