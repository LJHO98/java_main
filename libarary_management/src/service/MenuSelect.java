package service;

import java.util.Scanner;

public class MenuSelect {
	private Scanner sc = new Scanner(System.in);
	
	public void select() {
		System.out.println("메뉴");
		System.out.print("1. 도서 대여 및 반납 	2. 관리자 : ");
		int select = sc.nextInt();
		boolean flag = true;
		while(flag) {
			switch(select) {
				case 1:
					
					
				case 2:
					
					
				default:
					System.out.println("잘못된 숫자 입력");
					break;
			}
		}
	}
}
