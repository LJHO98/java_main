package caculator;

import java.util.Scanner;

public class Input { //사용자 입력 클래스
	Scanner scan = new Scanner(System.in);
	private double num1, num2; 
	
	public Input() { //생성자 메서드
		System.out.print("계산할 첫번째 숫자 : ");
		num1 = scan.nextDouble();
		System.out.print("두번째 숫자 : ");
		num2 = scan.nextDouble();
		System.out.print("계산 방법을 선택해주세요(1.더하기, 2.빼기, 3.곱하기, 4.나누기) : ");
		int select = scan.nextInt();
		selectFunction(select, num1, num2);
	}
	
	private void selectFunction(int select, double num1, double num2) { //선택한 계산 방법에 따라 객체 생성
		switch(select) {
			case 1: 
				Caculator plus = new PlusCal(); // 부모 추상클래스 타입으로 PlusCal 클래스에 객체 생성
				plus.caculate(num1, num2); //PlusCal에서 Override한 추상 메서드 caculate를 사용
				break;
			case 2:
				Caculator minus = new MinusCal();
				minus.caculate(num1, num2);
				break;
			case 3:
				Caculator multi = new MultipleCal();
				multi.caculate(num1, num2);
				break;
			case 4: 
				Caculator div = new DivCal();
				div.caculate(num1, num2);
				break;
		}
	}
}
