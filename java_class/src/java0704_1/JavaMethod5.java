package java0704_1;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {
		
		// �� ���� ������ ��ȯ �ϱ�
		MethodUtil util = new MethodUtil();
//		int[] num = util.twoNum();
//		System.out.println(Arrays.toString(num));
//		
//		// �簢���� �ʺ�� ���̸� �����ϰ� ���̸� ����ϼ���.
//		// ���̴� main�޼��忡�� ��µǰ� �ϼ���.
//		System.out.println("�簢���� ���� : " + util.square());
		
		// �α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
		// login �޼��带 �����Ͽ� �α��� ���θ� ����ϼ���.
		// ���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
		// �ϳ��� ����ġ�� �α��� ���� ���
		// �α��� ���� ����� main����
//		boolean isFail = util.login();
//		if(isFail) {
//			System.out.println("�α��� ����");
//		}else {
//			System.out.println("�α��� ����");
//		}
		
		// ���� ������ Ű���带 ���� �Է� ��������.
		// �Է��� �� ������ ���� 100�� ������
		// (100 - ��)�� ����� ����ϰ�
		// 100�� ���� ������ �������� ���� ����ϼ���.
		// main �޼��忡�� ���
		int result = util.sum();
		System.out.println(result);
	}

}

class MethodUtil{
//	int[] twoNum() {
//		int num1 = 20, num2 = 50;
////		int temp = new int[] {num1,num2};
//		return new int[] {num1, num2};
//		//return���� ��Ȱ ��ų�� �ִ� ���� ���� ���̴�.
//	}
//	int square() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�ʺ� : ");
//		int width = sc.nextInt();
//		System.out.print("���� : ");
//		int height = sc.nextInt();
//		sc.close();
//		return width * height;
//	}
	
	boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		boolean check;
		if(id.equals("skyblue") && password.equals("1234sea")) {
			check = true;
		}else {
			check = false;}
		return check;
	}
	
	int sum() {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		int sumNumber = 0;
		for(int i=0; i<numbers.length; i++) {
			System.out.print(i+1 + "�� ���ڸ� �Է����ּ��� : ");
			numbers[i] = sc.nextInt();
			sumNumber += numbers[i];
		}
		if(sumNumber > 100) {
			return 100-sumNumber;
		}else {
			return sumNumber;
		}
	}
	
	
}
