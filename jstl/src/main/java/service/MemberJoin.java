package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;
import DTO.MemberDTO;

public class MemberJoin implements MainActive{
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("userId");
		String pw = request.getParameter("userPassword");
		String email = request.getParameter("userEmail");
		String name = request.getParameter("userName");
		
		//데이터베이스 저장하기
		MemberDTO dto = new MemberDTO(id,pw,email,name);
		MemberDAO dao = new MemberDAO();
		dao.save(dto);
		
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
}
