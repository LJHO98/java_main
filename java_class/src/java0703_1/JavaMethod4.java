package java0703_1;

public class JavaMethod4 {

	public static void main(String[] args) {
		// 메서드를 통해서 숫자 10을 받아 출력하기
		
		ReturnMth rm = new ReturnMth();
		int num = rm.get();
		System.out.println(num);
		
		//메서드로부터 두정수의 더하기 결과 받아서 출력하기
		int sum = rm.sum();
		System.out.println(sum);
		
		String userName = rm.getName();
		int age=34;
		System.out.println(userName + " " + age);
		
		//국어, 영어, 수학 세 과목의 총점을 구하는 메서드
		// 세과목의 평균을 구하는 메서드
		// 총점과 평균을 출력하세요
		
		int 총점 = rm.totalScore();
		int 평균 = rm.avgScore(총점);
		System.out.printf("총점 : %d , 평균 : %d", 총점, 평균);
	}

}
/*
  주사위 게임
  j형준 과 s석완이가 주사위 게임을 한다.
  주사위는 하나, 육면이다.
  주사위의 값이 큰 사람이 이긴다.
  
  주사위 값 구하는 메서드 (랜덤으로 주사위 돌리는 메서드, 매개변수 필요 없음, 반환값 필요함)
  
  주사위 값 비교하여 누가 이겼는지 출력하는 메서드(형준과 석완이의 주사위 값을 받을 매개변수 필요함, 누가 이겼는지 출력, 반환값 필요없음)
 */

class ReturnMth{
	int totalScore() {
		int kor=89, eng=78, math=50;
		int result = kor + eng + math;
		return result;
		
	}
	
	int avgScore(int total) {
		int avg = total / 3;
		return avg;
	}
	
	
	
	String getName() {
		String name = "이순신";
		return name;
	}
	
	
	int get() {
		return 10;
	}
	
	int sum() {
		int num1=30, num2=45;
		int result = num1 + num2;
		return result; 
	}
}
