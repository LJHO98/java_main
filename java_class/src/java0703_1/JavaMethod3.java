package java0703_1;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		//정수 두개 입력 받아 합을 출력하기
		Calc calc = new Calc(); //클래스 변수 calc에 새로운 인스턴스를 만들어준다.
//		calc.sum();
//		calc.sum(40,10);
		
		//세 과목의 총점
		int kor = 89, eng=74, mat=43;
		calc.scoreTotal(kor, eng, mat);
		
		//메서도 호출하여 '메서드 dog쉽네~'라고 출력;
		calc.dog();
		calc.view();
		
		//메서드를 호출하여 이름과 나이 출력
		//매개변수 x, 키보드 입력 x
		calc.info(); //calc 인스턴스에 있는 info() 인스턴스 메서드를 실행
		
		//메서드를 호출하여 아래의 데이터를 출력하세요
		String animal="골드리트리버";
		String 공고일 = "2024-07-01";
		
		TestMethod test = new TestMethod();
		test.dog(animal, 공고일);
		
		String examDate = "2024-08-13";
//		test.extract(examDate);
		test.datePrint(examDate);
		
		// 네 사람의 나이 평균 값을 구하여 출력하세요
		// 평균값은 정수입니다.
		int 흥민=31, 강인=23, 희찬=28, 재범=37;
		test.ageAvg(흥민, 강인, 희찬, 재범);
	}
	
}
class TestMethod{
	
	void dog(String name, String date) {
		System.out.printf("종 : %s, 공고일 : %s\n", name, date);
	}
	
//	void extract(String date) {
//			String month = date.substring(5,7);
//			String day = date.substring(8,10);
//			System.out.printf("%s월 %s일", month,day);
//	}
	
	void datePrint(String date) {
		String[] current = date.split("-");
		System.out.println(current[1] + " " + current[2]);
	}
	
	void ageAvg(int p1, int p2, int p3, int p4) {
		int avg = (p1 + p2 + p3 + p4) / 4;
		System.out.println("네 사람의 나이 평균 값 : " + avg);
	}
}

class Calc{
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int number1 = scan.nextInt();
		System.out.print("두번째 정수 : ");
		int number2 = scan.nextInt();
		scan.close();
		
		int result = number1 + number2;
		System.out.println("두 정수의 합은 : " + result);
	}
	
	void sum(int number1, int number2) {
		int result = number1 + number2;
		System.out.println("두 정수의 합은 : " + result);
	}
	
	void scoreTotal(int kor, int eng, int mat) {
		int result = kor + eng + mat;
		System.out.println("세과목의 총점 : " + result);
	}
	
	void dog() {
		System.out.println("메서드 dog쉽네~");
	}
	void view() {
		int a=10, b=20;
		System.out.printf("변수 a : %d , 변수 b : %d\n", a, b);
	}
	void info() {
		int age = 20;
		String name = "아무개";
		
		System.out.printf("이름 : %s, 나이 : %d\n", name, age);
	}
}


