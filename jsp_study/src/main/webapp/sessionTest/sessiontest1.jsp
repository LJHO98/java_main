<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- sessiontest1.jsp --%>

<%

	//세션 - 웹서버에서 생성하고 서버에 저장하고 복사하여 클라이언트에게도 전달
	//	  - 클라이언트와 서버의 연결 유지를 위하여 사용된다.
	//	  tomcat에서 클라이언트가 최초 요청할때 session 객체를 생성한다.
	
	// 세션 값 생성
	session.setAttribute("testUser","12389");

	//세션 만료 시간 설정 - 클라이언트가 별도의 요청을 하지않으면 지정한 시간이후에 세션 제거
	session.setMaxInactiveInterval( 10*60 );
	
	//세션 값 삭제
	session.removeAttribute("testUser");
	//세션 전체 삭제
	session.invalidate();
	
	// 현재 접속한 클라이언트의 세션 값 가져오기
	// Iterator
	// Enumeration
	Enumeration attr = session.getAttributeNames();
	while(attr.hasMoreElements()){
		String name = (String)attr.nextElement();
		String value = (String)session.getAttribute(name);
		out.println(name+", "+value);
	}
%>