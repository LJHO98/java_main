package java0704_1;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) {
		//컴퓨터와 가위바위보 하기
		//컴퓨터의 가위바위보 값은 comInput 메서드를 사용한다.
		//유저의 가위바위보는 한글로 입력한다.
		//승,무,패 에 대해 출력한다.
		//메서드 - 유저 가위바위보 입력하고 저장하는 메서드
		//	   - 컴퓨터와 비교하여 결과 출력하는 메서드
		//Game 클래스에 필요한 변수나 메서드 작성
		//main메서드에서는 Game 클래스 객체로 메서드들만 실행
		Game game = new Game();
		game.play();
	}

}

class Game{ //rock-scissors-paper 게임
	String com;
	String user;
	String[] rcp = {"가위", "바위", "보"};
	
	void comInput() {
		int temp = (int)(Math.random()*3);
		switch(temp) {
			case 0: this.com="가위";break;
			case 1: this.com="바위";break;
			case 2: this.com="보";break;
		}
	}
	void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위 바위 보 중에 하나를 입력하세요 : ");
		this.user = sc.nextLine();
	}
	void play() {
		comInput();
		userInput();
		result();
	}
	
	void result() {
//		if(user.equals("가위")) {
//			if(com.equals("바위")) {
//				System.out.println("패");
//			}else if(com.equals("보")) {
//				System.out.println("승");
//			}else
//				System.out.println("무");
//		}
//		
//		if(user.equals("바위")) {
//			if(com.equals("가위")) {
//				System.out.println("승");
//			}else if(com.equals("보")) {
//				System.out.println("패");
//			}else
//				System.out.println("무");
//		}
//		
//		if(user.equals("보")) {
//			if(com.equals("가위")) {
//				System.out.println("패");
//			}else if(com.equals("바위")) {
//				System.out.println("승");
//			}else
//				System.out.println("무");
//		}
//		
//		int userIndex=0, comIndex=0, compare=0;
//		for(int i=0;i<this.rcp.length;i++) {
//			if(rcp[i].equals(this.user)) {
//				userIndex = i;
//				System.out.println(userIndex);
//			}
//			if(rcp[i].equals(this.com)) {
//				comIndex = i;
//				System.out.println(comIndex);
//			}
//		}
//		compare = userIndex - comIndex;
//		//0 - 무     2,-1 - 패    -2, 1 - 승
//		switch(compare) {
//			case 0: System.out.println("무"); break;
//			case 1: System.out.println("승"); break;
//			case -2: System.out.println("승"); break;
//			case -1: System.out.println("패"); break;
//			case 2: System.out.println("패"); break;
//		}
//		
//		System.out.println("컴퓨터 : " + this.com);
		
		if(user.equals(com)) {
			System.out.println("비김");
		}else if( (user.equals("가위") && com.equals("보")) ||
				  (user.equals("바위") && com.equals("가위")) ||
				  (user.equals("보") && com.equals("바위")) ) {
			System.out.println("유저승, 컴퓨터 패");
		}else {
			System.out.println("유저패, 컴퓨터 승");
		}
		System.out.println("컴퓨터 : " + this.com);
	}
}
