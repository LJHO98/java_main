package java0704_1;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {
		
		// 두 개의 정수를 반환 하기
		MethodUtil util = new MethodUtil();
//		int[] num = util.twoNum();
//		System.out.println(Arrays.toString(num));
//		
//		// 사각형의 너비와 높이를 설정하고 넓이를 출력하세요.
//		// 넓이는 main메서드에서 출력되게 하세요.
//		System.out.println("사각형의 넓이 : " + util.square());
		
		// 로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea
		// login 메서드를 실행하여 로그인 여부를 출력하세요.
		// 아이디 비밀번호가 일치하면 로그인 성공 출력
		// 하나라도 불일치면 로그인 실패 출력
		// 로그인 여부 출력은 main에서
//		boolean isFail = util.login();
//		if(isFail) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
		// 정수 세개를 키보드를 통해 입력 받으세요.
		// 입력한 세 정수의 합이 100을 넘으면
		// (100 - 합)의 결과를 출력하고
		// 100을 넘지 않으면 세정수의 합을 출력하세요.
		// main 메서드에서 출력
		int result = util.sum();
		System.out.println(result);
	}

}

class MethodUtil{
//	int[] twoNum() {
//		int num1 = 20, num2 = 50;
////		int temp = new int[] {num1,num2};
//		return new int[] {num1, num2};
//		//return으로 반활 시킬수 있는 값은 단일 값이다.
//	}
//	int square() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("너비 : ");
//		int width = sc.nextInt();
//		System.out.print("높이 : ");
//		int height = sc.nextInt();
//		sc.close();
//		return width * height;
//	}
	
	boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		boolean check;
		if(id.equals("skyblue") && password.equals("1234sea")) {
			check = true;
		}else {
			check = false;}
		return check;
	}
	
	int sum() {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		int sumNumber = 0;
		for(int i=0; i<numbers.length; i++) {
			System.out.print(i+1 + "번 숫자를 입력해주세요 : ");
			numbers[i] = sc.nextInt();
			sumNumber += numbers[i];
		}
		if(sumNumber > 100) {
			return 100-sumNumber;
		}else {
			return sumNumber;
		}
	}
	
	
}
