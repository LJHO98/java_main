package java0704_1;

import java.util.Scanner;

public class DiceHomework {

	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.init();
		game.diceThrow();
		game.result();
	}
	
}

class DiceGame{
	String[] names;
	int[] diceNum;
	
	void init() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주사위 게임 참가인원 : ");
		int cnt = sc.nextInt();
		this.names = new String[cnt];
		this.diceNum = new int[cnt];
		sc.nextLine(); // 숫자를 입력하고 Enter 키를 누르고면, 숫자를 읽어오고 나머지 개행문자("\n")는 입력버퍼에 남겨둠. 이후 nexLine() 메서드를 호출하면
					   // 버퍼에 남아있는 개행문자("\n")를 읽어서 빈 문자열로 인식하게 되서 사용자가 문자열을 입력하지 못함. 그래서 nexLine() 입력버퍼를 비워준다.
		for(int i=0; i<names.length; i++) {
			System.out.println("참가자 이름 : ");
			names[i] = sc.nextLine();
		}
	}
	
	void diceThrow() { // 주사위 던지기
		for(int i=0; i<names.length; i++) {
			this.diceNum[i] = (int)(Math.random()*6)+1;
			System.out.println(this.names[i]+" 주사위 : " + this.diceNum[i]);
		}
	}
	
	void result() { // 주사위 결과 - 주사위 값이 크면 이긴다.
		int max = 0;
		for(int num : diceNum) {
			if( max < num ) max = num;
		}
		// 모든 참가자들의 주사위 값이 같다면
		boolean isSame = true;
		for(int num : diceNum) {
			if(num != max) isSame=false;
		}
		if(isSame) {
			System.out.println("모든 참가자 주사위 값이 값다 - 비김");
			return;
		}
		
		//가장 큰 주사위 값 가지고 있는 사람들이 이긴다.
		for(int i=0; i<diceNum.length; i++) {
			if( this.diceNum[i] == max) {
				System.out.println(names[i] + " 승 ");
			}
		}
	}
}








//public class DiceHomework {
//
//	public static void main(String[] args) {
//		Dice game = new Dice();
//		int 석완 = game.getDice("석완");
//		int 형준 = game.getDice("형준");
//		game.result(석완, 형준);
//	}
//
//}
//
//class Dice{
//	int getDice(String name) {
//		int num = (int)(Math.random()*6) + 1;
//		System.out.println(name + "주사위 : " + num);
//		return num;
//	}
//	
//	void result(int player1, int player2) {
//		if(player1 > player2) {
//			System.out.println("석완 승, 형준 패");
//		}else if(player1 < player2) {
//			System.out.println("형준 승, 석완 패");
//		}else
//			System.out.println("비김");
//	}
//}