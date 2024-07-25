<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.*" %>
    

<div id="inquiryWrap">
	<h2> 문의 작성</h2>
	<form id="fm" name="fm" method="post" action="inquirySave.jsp">
		<div id="writeBox">
			<div class="writeInput">
				<label>제목</label>
				<input type="text" name="title" id="title">
			</div>
			<div class="writeInput">
				<label>문의내용</label>
				<textarea name="content" id="content"></textarea>
			</div>
			<div class="writeInput">
				<label>비밀번호</label>
				<input type="password" name="password" id="password">
			</div>
			<button type="button" onclick="ok()">작성</button>
		
		</div>
	</form>
</div>
<script>
	function ok(){
		if($("#title").val()==''){
			alert("문의글 제목 입력하세요");
			$("#title").focus();
		}else if($("#content").val()==''){
			alert("문의글 작성하세요");
			$("#content").focus();
		}else{
			$("#fm").submit();
		}
	}
</script>