<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
	<h1>마블 영화 리스트</h1>
	<a href="/marvel/insert">영화 추가하기</a>
	<a href="/marvel/movieList">마블 영화 리스트로 가기</a>
	<c:forEach items="${marvelList }" var="marvel">
	<div>
	영화 번호 : ${marvel.marvelId }<br>
	한글 제목 : ${marvel.title }  영문 제목 : ${marvel.titleEng }<br>
	개봉일 : ${marvel.releaseDate }<br>
	박스오피스 : ${marvel.worldBoxOffice }<br>
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
	<a href="/marvel/update?marvelId=${marvel.marvelId }">수정</a>
	<a href="/marvel/delete?marvelId=${marvel.marvelId }">삭제</a>
	<hr>
	</div>
	</c:forEach>
		
	<c:forEach var="num" begin="1" end="${ showByPage}">
		<a href="/marvel/list?page=${num }">${num}</a>
	</c:forEach>
</body>
</html>