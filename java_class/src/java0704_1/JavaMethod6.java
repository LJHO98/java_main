package java0704_1;

import java.util.Scanner;

public class JavaMethod6 {

	public static void main(String[] args) {
		//��ǻ�Ϳ� ���������� �ϱ�
		//��ǻ���� ���������� ���� comInput �޼��带 ����Ѵ�.
		//������ ������������ �ѱ۷� �Է��Ѵ�.
		//��,��,�� �� ���� ����Ѵ�.
		//�޼��� - ���� ���������� �Է��ϰ� �����ϴ� �޼���
		//	   - ��ǻ�Ϳ� ���Ͽ� ��� ����ϴ� �޼���
		//Game Ŭ������ �ʿ��� ������ �޼��� �ۼ�
		//main�޼��忡���� Game Ŭ���� ��ü�� �޼���鸸 ����
		Game game = new Game();
		game.play();
	}

}

class Game{ //rock-scissors-paper ����
	String com;
	String user;
	String[] rcp = {"����", "����", "��"};
	
	void comInput() {
		int temp = (int)(Math.random()*3);
		switch(temp) {
			case 0: this.com="����";break;
			case 1: this.com="����";break;
			case 2: this.com="��";break;
		}
	}
	void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �� �߿� �ϳ��� �Է��ϼ��� : ");
		this.user = sc.nextLine();
	}
	void play() {
		comInput();
		userInput();
		result();
	}
	
	void result() {
//		if(user.equals("����")) {
//			if(com.equals("����")) {
//				System.out.println("��");
//			}else if(com.equals("��")) {
//				System.out.println("��");
//			}else
//				System.out.println("��");
//		}
//		
//		if(user.equals("����")) {
//			if(com.equals("����")) {
//				System.out.println("��");
//			}else if(com.equals("��")) {
//				System.out.println("��");
//			}else
//				System.out.println("��");
//		}
//		
//		if(user.equals("��")) {
//			if(com.equals("����")) {
//				System.out.println("��");
//			}else if(com.equals("����")) {
//				System.out.println("��");
//			}else
//				System.out.println("��");
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
//		//0 - ��     2,-1 - ��    -2, 1 - ��
//		switch(compare) {
//			case 0: System.out.println("��"); break;
//			case 1: System.out.println("��"); break;
//			case -2: System.out.println("��"); break;
//			case -1: System.out.println("��"); break;
//			case 2: System.out.println("��"); break;
//		}
//		
//		System.out.println("��ǻ�� : " + this.com);
		
		if(user.equals(com)) {
			System.out.println("���");
		}else if( (user.equals("����") && com.equals("��")) ||
				  (user.equals("����") && com.equals("����")) ||
				  (user.equals("��") && com.equals("����")) ) {
			System.out.println("������, ��ǻ�� ��");
		}else {
			System.out.println("������, ��ǻ�� ��");
		}
		System.out.println("��ǻ�� : " + this.com);
	}
}
