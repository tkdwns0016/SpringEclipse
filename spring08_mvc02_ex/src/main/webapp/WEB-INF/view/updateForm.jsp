<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateForm.jsp</title>
</head>
<body>
	<form action="/marvel/update" method="post">
		마블ID No.<input type="number" name="marvelId" value="${marvel.marvelId}" readonly="readonly"><br>
		한글 제목 	:<input type="text" name="title" placeholder="한글제목을 입력해 주세요" value="${marvel.title }"><br>
		영문 제목 	:<input type="text" name="titleEng" placeholder="영문제목을 입력해 주세요" value="${marvel.titleEng }"><br>
		개봉일	:<input type="date" name="releaseDate" max="<%=LocalDate.now() %>" min="1951-01-01" value="${marvel.releaseDate}"><br>
		월드박스오피스:<input type="number" name="worldBoxOffice" placeholder="월드박스오피스 값을 입력해 주세요" value="${marvel.worldBoxOffice }"><br>
		<input type="datetime-local" value="${marvel.writeDate }" readonly="readonly"><br>
		<input type="submit" value="영화 수정">
	</form>
</body>
</html>