package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class UpdateService implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		//게시글 수정 - 상세페이지와 새 게시글 작성 두 가지를 합쳐놓은 것
		
		if(request.getParameter("method") !=null ) {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			int bid = Integer.parseInt(request.getParameter("boardId"));
			
			
			BoardDTO dto = new BoardDTO(bid, title, null, content, 0);
			BoardDAO dao = new BoardDAO();
			dao.update(dto);
			
			try {
				response.sendRedirect("/boardView.do?id="+bid);
			}catch(Exception e) {
				
			}
			
			
			return null;
		}else {
			
			int bid = Integer.parseInt(request.getParameter("id"));
			BoardDAO dao = new BoardDAO();
			
			BoardDTO dto = dao.findById(bid);
			
			request.setAttribute("board", dto);
			
		}
		
		
		
		
		return "board/update.jsp";
	}

}
