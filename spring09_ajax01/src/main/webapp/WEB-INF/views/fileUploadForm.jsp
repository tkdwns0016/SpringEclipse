<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/user/fileUpload" method="post" enctype="multipart/form-data">
	<!-- enctype 은 파일을 저장하기 위한 타입 지정 -->
		<input type="text" name="name" placeholder="이름">
		<input type="file" name="uploadFile" multiple>
		<input type="submit" value="파일 보내기">
	
	
	
	</form>
</body>
</html>