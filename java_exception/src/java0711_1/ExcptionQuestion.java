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
				System.out.print("이름 : ");
				name = scan.nextLine();
				if(name.matches("\\d"))
					throw new InputMismatchException("문자만 입력하세요");
				is=false;
			}catch(InputMismatchException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
		}while(is);
		
		try {
			System.out.print("나이 : ");
			age = scan.nextInt();
			scan.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
		}
		try {
			if(age>=20) {
				System.out.print("자기소개 : " );
				userInfo = scan.nextLine();
			}
			if(userInfo.length()<10) {
				throw new StringIndexOutOfBoundsException("10자리 이상 입력");
			}
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(age+"살 "+name+"님은 ");
		System.out.println(userInfo.substring(0,10));
		
		
	}

}
