<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- board.jsp --%>

<div id="boardWrap">
	<h2>게시판</h2>
	<div id="boardBox">
		<div id="boardListBox">
			<table id="boardList">
				<tr>
					<th class="num">번호</th>
					<th class="title">제목</th>
					<th class="writer">작성자</th>
					<th class="hit">조회수</th>
				</tr>
				<%
					for(int i=0; i<=0; i++){
				%>
				<tr>
					<td class="num"></td>
					<td class="title"></td>
					<td class="writer"></td>
					<td class="num"></td>
				</tr>
				<% } %>
			</table>
		</div>
		<div id="boardSearchBox">
			<form method="get" action="?part=board">
				<div class="boardSearch">
					<input type="search" name="word" id="word">
					<button>검색</button>
				</div>
			</form>
		</div>
		<div id="boardWriteBox">
			<a id="wrBt">글작성</a>
		</div>
	
	</div>
</div>

<%
	int level = 0;
	if(session.getAttribute("user") != null){
		level = ((study.Member)session.getAttribute("user")).getLevel();
	}

%>


<script>
	//글 작성을 클릭할때 로그인 회원중에 권한이 있는 사람만 작성 가능
	//자바에 있는 데이터를 자바스크립트로 옮기려면 문자열로 옮겨줘야함
	let lv = '<%=level%>';
	$("#wrBt").on("click", function(){
		if( lv == 3){
			location.href="?part=boardWrite"; //권한이 3이면 글작성이동
		}else{
			alert("글 작성 권한이 없습니다.");
		}
	});
</script>