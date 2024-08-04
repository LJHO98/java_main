package service;

import java.util.Scanner;

import dao.BookDAO;
import dto.MangerDTO;

public class MemberActive implements ManagerActive {
	private Scanner sc = new Scanner(System.in);
	@Override
	public void action(int menu, String code, String member, MangerDTO manger) {
		
		BookDAO dao = new BookDAO();
		
		switch(menu) {
			case 1:
				dao.rental(code, member);
				break;
			case 2:
				dao.returnBook();
				break;
		}
		
	}

	

}
