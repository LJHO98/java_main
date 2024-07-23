package java0711_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcptionQuestion {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name = null;
		int age = 0;
		String userInfo = null;
		boolean is = true;
		
		do {
			try {
				System.out.print("�̸� : ");
				name = scan.nextLine();
				if(name.matches("\\d"))
					throw new InputMismatchException("���ڸ� �Է��ϼ���");
				is=false;
			}catch(InputMismatchException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
		}while(is);
		
		try {
			System.out.print("���� : ");
			age = scan.nextInt();
			scan.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}
		try {
			if(age>=20) {
				System.out.print("�ڱ�Ұ� : " );
				userInfo = scan.nextLine();
			}
			if(userInfo.length()<10) {
				throw new StringIndexOutOfBoundsException("10�ڸ� �̻� �Է�");
			}
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(age+"�� "+name+"���� ");
		System.out.println(userInfo.substring(0,10));
		
		
	}

}
