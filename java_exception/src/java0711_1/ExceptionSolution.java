package java0711_1;

import java.util.InputMismatchException;
import java.util.Scanner;

class NameValueException extends Exception{
	public NameValueException(String name) {
		super(name);
	}
	
}

public class ExceptionSolution {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String name = null;
		int age = 0;
		String userInfo = null;
		boolean is = true;
		
		
			try {
				System.out.print("�̸� : ");
				name = scan.nextLine();
				//isEmpty() - ���ڿ����̰� 0�� ��� true
				//isBlank() - ���ڿ��� ����ְų� ������� ��� true
				if(name.isBlank())
					throw new NameValueException("�̸��� �Է��ϼ���");
			}catch(NameValueException n) {
				System.out.println(n.getMessage());
			}
	
		try {
			System.out.print("���� : ");
			age = scan.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}finally {
			scan.nextLine();
		}
		
		
		
		if(age>=20) {
			System.out.print("�ڱ�Ұ� : " );
			userInfo = scan.nextLine();
		}
	
		System.out.println(age+"�� "+name+"���� ");
		try {
			System.out.println(userInfo.substring(0,10));
		}catch(StringIndexOutOfBoundsException e1) {
			System.out.println("�ڱ�Ұ��� 10�� �̻� �ۼ����ּ���");
		}catch(NullPointerException e2) {
			System.out.println("������ �Ǹ� �Ͷ�!");
		}
	
	}

}