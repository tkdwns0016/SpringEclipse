<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>showMoreThan.jsp</title>
</head>
<body>
id : ${movie.id }<br>
장르 : ${movie.genre }<br>
감독 : ${movie.director}<br>
시나리오 : ${movie.scenario}<br>
제목 : ${movie.title }<br>
제작 : ${movie.producer }<br>
배우 : ${movie.actor}<br>
음악감독 : ${movie.music }<br>
촬영 기간 : ${movie.beginFilming } ~ ${movie.endFilming}<br>
개봉일 : ${movie.releaseDate}<br>
런닝타임 : ${movie.runningTime}<br>
제작비 : ${movie.productionCost }<br>
북미박스오피스 : ${movie.northAmericaBoxOffice }<br>
월드박스오피스 : ${movie.worldBoxOffice }<br>
국내박스오피스 : ${movie.koreanNumberOfAudience }<br>
국내 등급 : ${movie.rate }<br>
작성일 : ${movie.wDate }<br>
수정일 : ${movie.uDate }<br>
<br>
<a href="/marvel/movieList">돌아가기</a>
</body>
</html>