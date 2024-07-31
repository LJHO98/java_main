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
		ResourceBundle rb = ResourceBundle.getBundle("class_bundle/mainProp"); //properties ���� ������ �����ͼ� ��ü ����
		Enumeration key = rb.getKeys(); // Ű���� key ��ü�� ����
		while(key.hasMoreElements()) { // Ű�� ���� ���� k, value ������ ����
			String k = (String)key.nextElement(); // signUp.do, signIn.do .... (Ű)
			String value = rb.getString(k); // service.MemberJoin, .... (��)
			
			try {
				Class<?> hcl = Class.forName(value); //���ڿ��� ǥ���� Ŭ������ �޸𸮿� �ε�
				MainActive his = (MainActive)hcl.newInstance(); // ��ü ����
				map.put(k, his);
				
				
			}catch(Exception e){
				System.out.println("mainProp ���� Map��ȯ ����");
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
		request.setCharacterEncoding("UTF-8"); // ��û �� �Է� ���� ���� ���ڵ�
		
		String uri = request.getRequestURI(); // ����ڰ� ��û�� �ּ�
		// uri : http://localhost/signUp.do
		String cmd = uri.substring(uri.lastIndexOf("/")+1);
		
		String view="/"; // ����ڰ� ���� ��������
		
		MainActive target = map.get(cmd); // ��û �ּҿ� �´� Ŭ���� ��ü ��������
		view = target.action(request, response);
		
		if(view != null) { //view�� action �޼��忡 return ���� null�� �ƴ� �ּҰ� ���ִٸ� ����
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
		}
		
	}

}

/*
	if( cmd.equals("signUp.do")) { //ȸ������
			if(request.getMethod().equals("POST")) { //request.getMethod() : ����� ��û���
				MemberJoin save = new MemberJoin();
				save.join(request, response);
			}else {
				view = "Member/signUp.html";
			}
		}else if(cmd.equals("signIn.do")) {// �α���
			view = "Member/signIn.jsp";
		}
*/
