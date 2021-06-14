<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax/main.jsp</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
$(function(){
	$("#getList").on("click",function(){
		$.ajax({
			url:"/user/ajax/list",
			type:"get",
			dataType:"json",
			success:function(result){
				for(user of result){
					var li = $("<li>");
					var article = $("<article>");
					var str = "id : "+user.id+"<br>";
					str += "유저아이디 : "+user.userId+"<br>";
					str += "비밀번호 : "+user.password+"<br>";
					str += "생년월일 : "+user.birthDate+"<br>";
					str += "전화번호 : "+user.phone+"<br>";
					str += "주소 : "+user.address+"<br>";
					str += "가입일 : ";
					for(d of user.joinedDate){
						str += d+" ";
					}
					article.html(str);					
					li.append(article);
					$("ul").append(li);
				}
			}
		});
	});
	
	//추가
	$("#userForm").on("submit",function(){
		//폼을 ajax로 보내기 위해서
		var formData = $("#userForm").serialize();
		console.log(formData);
		
		$.ajax({
			url:"/user/ajax/add",
			type:"post",
			data: formData,
			success : function(result){
				if(result == true){
					alert("유저를 추가하였습니다.");
				}else{
					alert("유저를 추가하지 못했습니다.")
				}
			},
			error : function(){
				console.log("error",e);
			}
		})
		return false;
	})
	
	
	
	
	
	
})
</script>
</head>
<body>
	<h1>ajax를 이용해보자</h1>
	<form id="userForm">
	<input type="text" name="userId" placeholder="아이디를 입력하세요"><br>
		<input type="password" name="password" placeholder="비밀번호를 입력하세요"><br>
		생년월일 : <input type="date" name="birthDate" max="2021-06-10"><br>
		<input type="tel" name="phone" placeholder="전화번호를 입력하세요" pattern="[01]{3}-[0-9]{4}-[0-9]{4}"><br>
		<input type="text" name="address" placeholder="주소를 입력해주세요"><br>
	<button id="addUserBtn">데이터 추가하기</button>
	</form>
	<button id="getList">리스트를 가져오기</button>
	<ul>

	</ul>
</body>
</html>