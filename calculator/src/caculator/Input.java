package caculator;

import java.util.Scanner;

public class Input { //����� �Է� Ŭ����
	Scanner scan = new Scanner(System.in);
	private double num1, num2; 
	
	public Input() { //������ �޼���
		System.out.print("����� ù��° ���� : ");
		num1 = scan.nextDouble();
		System.out.print("�ι�° ���� : ");
		num2 = scan.nextDouble();
		System.out.print("��� ����� �������ּ���(1.���ϱ�, 2.����, 3.���ϱ�, 4.������) : ");
		int select = scan.nextInt();
		selectFunction(select, num1, num2);
	}
	
	private void selectFunction(int select, double num1, double num2) { //������ ��� ����� ���� ��ü ����
		switch(select) {
			case 1: 
				Caculator plus = new PlusCal(); // �θ� �߻�Ŭ���� Ÿ������ PlusCal Ŭ������ ��ü ����
				plus.caculate(num1, num2); //PlusCal���� Override�� �߻� �޼��� caculate�� ���
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
