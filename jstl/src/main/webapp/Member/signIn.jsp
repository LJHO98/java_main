<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 화면</h2>
<div id="signinBox">
	<form id="signFm" method="post" action="/signInCheck.do">
		<input type="hidden" name="preURL" id="preURL">
		<div class="loginInput">
			<b>아이디</b>
			<input type="text" name="userId" id="userId">
			<p class="error"></p>
		</div>
			<div class="loginInput">
			<b>비밀번호</b>
			<input type="password" name="userPassword" id="userPassword"> 
			<p class="error"></p>
		</div>
		<button id="loginBt">로그인</button>
	</form>
	<div class="sign"><a href="findUser.jsp">아이디/비밀번호찾기</a></div>
	<div class="sign"><a href="/signUp.do">회원 가입</a></div>

</div>
</body>
</html>
<script>
	document.getElementById("preURL").value=document.referrer;

</script>