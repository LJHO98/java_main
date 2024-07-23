package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean is=true;
		do {
			try {
				System.out.print("정수 입력 : ");
				num = scan.nextInt();
				is = false;
				if(is) break;
			}catch(InputMismatchException e){
				System.out.println("정수만 입력하세요");
			}finally { //try,catch부분 어느쪽이 실행되더라도 마지막에 무조건 실행됨.
				scan.nextLine();
			}
			
		}while(is);
		
		System.out.println(num+100);
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.println(name);
	}

}
