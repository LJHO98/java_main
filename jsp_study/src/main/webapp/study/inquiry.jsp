<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.*"%>

<%-- inquiry.jsp    문의 페이지에 스타일 적용하려면 inquiry.css  --%>


<div id="inquiryWrap">
	<h2>문의</h2>
	<div class="writeBt">
		<% if( session.getAttribute("user") !=null  ) {%>
			<a href="?part=inquiryWrite">문의하기</a>
		<% } %>
		
	</div>
	<div id="inquiryBox">
		<ul id="inquiryList">
			<li>
				<span class="title">제목</span>
				<span class="writer">작성자</span>
				<span class="isAnswer">답변</span>
			</li>
			
			<% 
				for( int i=0; i<0; i++){
			%>
			<li class='list'>
				<span class="title"></span>
				<span class="writer"></span>
				<span class="isAnswer"></span>
			</li>
			<%
				}
			%>
		</ul>
	</div>
</div>



