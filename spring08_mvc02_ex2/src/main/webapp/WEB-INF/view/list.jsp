<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
	<h1>마블 영화 리스트</h1>
	<table>
		<tr>
			<th>영화 No.</th>
			<th>Title</th>
		</tr>
		<c:forEach begin="1" end="2">
		<tr>
			<td>${marvelList.marvelId }</td>
			
		</tr>
		</c:forEach>
	</table>
	<a href="/marvel/insert">영화 추가하기</a>
</body>
</html>