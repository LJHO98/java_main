package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberJoin{
	
	
	
	public void join(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("userId");
		String pw = request.getParameter("userPassword");
		String email = request.getParameter("userEmail");
		String name = request.getParameter("userName");
		
		//데이터베이스 저장하기
		
		
	}
}
