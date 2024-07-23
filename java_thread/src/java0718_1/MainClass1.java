package java0718_1;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		MyThread th = new MyThread(); //������ ��ü ����
		th.start(); // ������ ����	
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�����Է� : ");
//		int num = sc.nextInt();
//		System.out.println(num);
		
		for(int i=1; i<=10; i++) {
			System.out.println(" ���� main "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("�� �������!" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
		}
	}
}
/*
	���μ��� - cpu�� ���� �޸�(ram)�� �ε� �Ǿ��ִ� ���α׷��� ���Ѵ�.
			��, �������� ���α׷����� ���μ����̴�.
			�������� ���μ��� Ȯ�� ���
			1. �۾������� ���μ���
			2. ���������Ʈâ
				tasklist - ���μ��� ����Ʈ
				taskkill /pid[pid��] - �������� 
				
	������ - ���μ����ȿ��� ���� ������ �����ϴ� ����
		   �����带 �߰� �ϸ� ���ÿ� ���� ���� ������ ���� �� �� �ִ�.
		   
	�ڹ� ������
	������ ������
	Thread() : ���ο� ������ ��ü �Ҵ�
	Thread("�̸�") : ���ο� ������ ��ÿ�� �Ҵ��ϸ鼭 �̸��ο�
	
*/
