package javapractice1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		ArrayList<Grade> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int scoreTemp;
		String nameTemp;
		
		while(true) {
			System.out.print("�л� �̸��� �Է����ּ��� : ");
			nameTemp = scan.nextLine();
			if(nameTemp.equals("��")) break;
			System.out.print("���� ������ �Է����ּ��� : ");
			scoreTemp = scan.nextInt();
			scan.nextLine();
			list.add(new Grade(nameTemp, scoreTemp));
			
		}
		

	}

}
