package controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MainActive;
import service.MemberJoin;

/**
 * Servlet implementation class Maincontrol
 */
@WebServlet("/MainControl")
public class MainControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String , MainActive> map = new HashMap<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		ResourceBundle rb = ResourceBundle.getBundle("class_bundle/mainProp"); //properties 파일 데이터 가져와서 객체 생성
		Enumeration key = rb.getKeys(); // 키값만 key 객체에 저장
		while(key.hasMoreElements()) { // 키와 값을 각각 k, value 변수에 저장
			String k = (String)key.nextElement(); // signUp.do, signIn.do .... (키)
			String value = rb.getString(k); // service.MemberJoin, .... (값)
			
			try {
				Class<?> hcl = Class.forName(value); //문자열로 표현한 클래스를 메모리에 로드
				MainActive his = (MainActive)hcl.newInstance(); // 객체 생성
				map.put(k, his);
				
				
			}catch(Exception e){
				System.out.println("mainProp 파일 Map변환 실패");
			}
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doMethod(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doMethod(request, response);
	}
	protected void doMethod(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 요청 시 입력 값에 대한 인코딩
		
		String uri = request.getRequestURI(); // 사용자가 요청한 주소
		// uri : http://localhost/signUp.do
		String cmd = uri.substring(uri.lastIndexOf("/")+1);
		
		String view="/"; // 사용자가 보는 뷰페이지
		
		MainActive target = map.get(cmd); // 요청 주소에 맞는 클래스 객체 가져오기
		view = target.action(request, response);
		
		if(view != null) { //view에 action 메서드에 return 값이 null이 아닌 주소가 들어가있다면 실행
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
		}
		
	}

}

/*
	if( cmd.equals("signUp.do")) { //회원가입
			if(request.getMethod().equals("POST")) { //request.getMethod() : 사용자 요청방식
				MemberJoin save = new MemberJoin();
				save.join(request, response);
			}else {
				view = "Member/signUp.html";
			}
		}else if(cmd.equals("signIn.do")) {// 로그인
			view = "Member/signIn.jsp";
		}
*/
