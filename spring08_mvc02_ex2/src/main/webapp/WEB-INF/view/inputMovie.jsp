<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inputMovie.jsp</title>
</head>
<body>
	<form action="/marvel/insert" method="post">
		<input type="text" name="title" placeholder="한글제목을 입력해 주세요"><br>
		<input type="text" name="titleEng" placeholder="영문제목을 입력해 주세요"><br>
		<input type="date" name="releaseDate" max="<%=LocalDate.now() %>" required="required" min="1951-01-01"><br>
		<input type="number" name="worldBoxOffice" placeholder="월드박스오피스 값을 입력해 주세요"><br>
		<input type="submit" value="만들기!">
	</form>
</body>
</html>