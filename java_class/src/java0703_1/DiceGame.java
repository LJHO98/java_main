package java0703_1;

public class DiceGame {

	public static void main(String[] args) {
		Game diceGame = new Game();
		String[] player = { "j����","s����"};
		int[] dice = new int[2];
		
		for(int i=0; i<dice.length; i++) {
			dice[i] = diceGame.rollDice();
		}
		
		diceGame.result(player[0], player[1], dice[0], dice[1]);
	}

}

class Game{
	int rollDice() {
		int dice = (int)(Math.random()*6) + 1;
		return dice;
	}
	
	void result(String name1, String name2, int dice1 , int dice2) {
		if(dice1 > dice2) {
			System.out.printf("%s �ֻ��� : %d , %s �ֻ��� : %d\n", name1, dice1, name2, dice2);
			System.out.printf("���ڴ� %s�Դϴ�!", name1);
		}else if(dice1 < dice2){
			System.out.printf("%s �ֻ��� : %d , %s �ֻ��� : %d\n", name1, dice1, name2, dice2);
			System.out.printf("���ڴ� %s�Դϴ�!", name2);
		}else {
			System.out.println("���º�");
		}
	}
	
}
