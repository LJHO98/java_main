<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- signin.jsp --%>

<div id="signinBox">
	<form id="signFm" method="post" action="signCheck.jsp">
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
		<button type="button" id="loginBt">로그인</button>
	</form>
	<div class="sign"><a href="findUser.jsp">아이디/비밀번호찾기</a></div>
	<div class="sign"><a href="/jsp_study/study/?part=signup">회원 가입</a></div>

</div>

<style>
	.error{ color:red; font-size:14px; }
</style>


<script>
	let bt = document.getElementById("loginBt");
	bt.addEventListener("click", function(){ //로그인 버튼의 클릭 이벤트 등록 및 실행 함수정의
		let id = document.getElementById("userId");
		let pw = document.getElementById("userPassword");
		if(id.value==''){ //아이디 입력 하지않은 경우
			document.getElementsByClassName("error")[0].innerText="아이디를 입력하세요";
		}else if(pw.value==''){ //비밀번호 입력하지 않은 경우
			document.getElementsByClassName("error")[1].innerText="비밀번호를 입력하세요";
		}else{//아이디, 비밀번호 입력했다면 로그인 처리페이지로 전송및 이동
			document.getElementById("signFm").submit();
		}
	});


</script>



<%--
	전송방식 : post
	전송 url : signCheck.jsp
	아이디 파라미터 : userId
	비밀번호 파라미터 : userPassword
	아이디/비밀번호 찾기 url : findUser.jsp
	회원 가입 url : signup.jsp
	
--%>