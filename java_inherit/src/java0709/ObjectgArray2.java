package java0709;

import java.util.Scanner;

public class ObjectgArray2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Game[] game = new Game[7];
		
//		for(int i=0; i<game.length; i++) {
//			game[i] = new Game();
//			System.out.println(i+1 + "¹ø °ÔÀÓ ÀÔ·Â");
//			System.out.print("ÀÌ¸§ : ");
//			String title = sc.nextLine();
//			game[i].setTitle(title);
//			System.out.print("Àå¸£ : ");
//			String genre = sc.nextLine();
//			game[i].setTitle(genre);
//			System.out.print("ÇÃ·§Æû : ");
//			String platform = sc.nextLine();
//			game[i].setTitle(platform);
//		}
		game[0] = new Game("¿¤µç¸µ", "ARPG", "PC");
		game[1] = new Game("¿¤µç¸µ", "ARPG", "PC");
		game[2] = new Game("¿¤µç¸µ", "ARPG", "PC");
		game[3] = new Game("¿¤µç¸µ", "ARPG", "PC");
		game[4] = new Game("¿¤µç¸µ", "ARPG", "PC");
		game[5] = new Game("¿¤µç¸µ", "ARPG", "PC");
		game[6] = new Game("¿¤µç¸µ", "ARPG", "PC");
		
		
		for(Game gm : game) {
			System.out.println(gm);
		}
	}

}
