package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardWrite implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		String method = request.getParameter("method");
		if(method != null) { //게시글 작성할 경우
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String writer = (String)request.getSession().getAttribute("user");
			
			BoardDTO dto = new BoardDTO(title,writer,content);
			BoardDAO dao = new BoardDAO();
			dao.save(dto);
			
			try {
				response.sendRedirect("/board.do");
			}catch(Exception e) {
				
			}
			
			return null;
		}else { // 게시글 작성페이지 요청한 경우
			return "board/boardWrite.jsp";
		}
		
	}

}
