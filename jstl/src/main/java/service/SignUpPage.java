package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public class SignUpPage implements MainActive{
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		// 아이디 중복 가입을 방지하기 위해 현재 회원가입된 아이디를
		// 회원가입 페이지에 보내기
		MemberDAO dao = new MemberDAO();
		List<String> ids = dao.findAllUserId();
		
		request.setAttribute("idList", ids);
		
		return "Member/signUp.jsp";
	}
}