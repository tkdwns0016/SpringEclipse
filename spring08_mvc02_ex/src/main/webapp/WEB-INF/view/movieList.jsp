<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>movieList.jsp</title>
<style>
table, th, td {
	text-align: center;
	border: 1px solid blue;
	border-collapse: collapse;
}

th {
	width: 150px;
}

body {
	margin-left: 50%;
	position: absolute;
	left:-306px
}
</style>
</head>
<body>
	<h1>영화 리스트</h1>
	<a href="/marvel/list">다른 영화 리스트로 돌아가기.</a>

	<div>
		<table>
			<tr>
				<th>영화 No.</th>
				<th>Title</th>
				<th>런닝 타임</th>
				<th>개봉일</th>
			</tr>
			<c:forEach var="movie" items="${movieList }">
				<tr>
					<td>No. ${movie.id }</td>
					<td class="title"><a
						href="/marvel/showMoreThan?id=${movie.id }">${movie.title }</a></td>
					<td>${movie.runningTime }분</td>
					<td>${movie.releaseDate }</td>
				</tr>
			</c:forEach>
		</table>
		<c:forEach var="num" begin="1" end="${showByPage }">
			<a href="/marvel/movieList?page=${num }">[${num }]</a>
		</c:forEach>
	</div>
</body>
</html>