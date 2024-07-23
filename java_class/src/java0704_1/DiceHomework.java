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
		System.out.print("�ֻ��� ���� �����ο� : ");
		int cnt = sc.nextInt();
		this.names = new String[cnt];
		this.diceNum = new int[cnt];
		sc.nextLine(); // ���ڸ� �Է��ϰ� Enter Ű�� �������, ���ڸ� �о���� ������ ���๮��("\n")�� �Է¹��ۿ� ���ܵ�. ���� nexLine() �޼��带 ȣ���ϸ�
					   // ���ۿ� �����ִ� ���๮��("\n")�� �о �� ���ڿ��� �ν��ϰ� �Ǽ� ����ڰ� ���ڿ��� �Է����� ����. �׷��� nexLine() �Է¹��۸� ����ش�.
		for(int i=0; i<names.length; i++) {
			System.out.println("������ �̸� : ");
			names[i] = sc.nextLine();
		}
	}
	
	void diceThrow() { // �ֻ��� ������
		for(int i=0; i<names.length; i++) {
			this.diceNum[i] = (int)(Math.random()*6)+1;
			System.out.println(this.names[i]+" �ֻ��� : " + this.diceNum[i]);
		}
	}
	
	void result() { // �ֻ��� ��� - �ֻ��� ���� ũ�� �̱��.
		int max = 0;
		for(int num : diceNum) {
			if( max < num ) max = num;
		}
		// ��� �����ڵ��� �ֻ��� ���� ���ٸ�
		boolean isSame = true;
		for(int num : diceNum) {
			if(num != max) isSame=false;
		}
		if(isSame) {
			System.out.println("��� ������ �ֻ��� ���� ���� - ���");
			return;
		}
		
		//���� ū �ֻ��� �� ������ �ִ� ������� �̱��.
		for(int i=0; i<diceNum.length; i++) {
			if( this.diceNum[i] == max) {
				System.out.println(names[i] + " �� ");
			}
		}
	}
}








//public class DiceHomework {
//
//	public static void main(String[] args) {
//		Dice game = new Dice();
//		int ���� = game.getDice("����");
//		int ���� = game.getDice("����");
//		game.result(����, ����);
//	}
//
//}
//
//class Dice{
//	int getDice(String name) {
//		int num = (int)(Math.random()*6) + 1;
//		System.out.println(name + "�ֻ��� : " + num);
//		return num;
//	}
//	
//	void result(int player1, int player2) {
//		if(player1 > player2) {
//			System.out.println("���� ��, ���� ��");
//		}else if(player1 < player2) {
//			System.out.println("���� ��, ���� ��");
//		}else
//			System.out.println("���");
//	}
//}