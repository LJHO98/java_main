package java0703_1;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		//���� �ΰ� �Է� �޾� ���� ����ϱ�
		Calc calc = new Calc(); //Ŭ���� ���� calc�� ���ο� �ν��Ͻ��� ������ش�.
//		calc.sum();
//		calc.sum(40,10);
		
		//�� ������ ����
		int kor = 89, eng=74, mat=43;
		calc.scoreTotal(kor, eng, mat);
		
		//�޼��� ȣ���Ͽ� '�޼��� dog����~'��� ���;
		calc.dog();
		calc.view();
		
		//�޼��带 ȣ���Ͽ� �̸��� ���� ���
		//�Ű����� x, Ű���� �Է� x
		calc.info(); //calc �ν��Ͻ��� �ִ� info() �ν��Ͻ� �޼��带 ����
		
		//�޼��带 ȣ���Ͽ� �Ʒ��� �����͸� ����ϼ���
		String animal="��帮Ʈ����";
		String ������ = "2024-07-01";
		
		TestMethod test = new TestMethod();
		test.dog(animal, ������);
		
		String examDate = "2024-08-13";
//		test.extract(examDate);
		test.datePrint(examDate);
		
		// �� ����� ���� ��� ���� ���Ͽ� ����ϼ���
		// ��հ��� �����Դϴ�.
		int ���=31, ����=23, ����=28, ���=37;
		test.ageAvg(���, ����, ����, ���);
	}
	
}
class TestMethod{
	
	void dog(String name, String date) {
		System.out.printf("�� : %s, ������ : %s\n", name, date);
	}
	
//	void extract(String date) {
//			String month = date.substring(5,7);
//			String day = date.substring(8,10);
//			System.out.printf("%s�� %s��", month,day);
//	}
	
	void datePrint(String date) {
		String[] current = date.split("-");
		System.out.println(current[1] + " " + current[2]);
	}
	
	void ageAvg(int p1, int p2, int p3, int p4) {
		int avg = (p1 + p2 + p3 + p4) / 4;
		System.out.println("�� ����� ���� ��� �� : " + avg);
	}
}

class Calc{
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int number1 = scan.nextInt();
		System.out.print("�ι�° ���� : ");
		int number2 = scan.nextInt();
		scan.close();
		
		int result = number1 + number2;
		System.out.println("�� ������ ���� : " + result);
	}
	
	void sum(int number1, int number2) {
		int result = number1 + number2;
		System.out.println("�� ������ ���� : " + result);
	}
	
	void scoreTotal(int kor, int eng, int mat) {
		int result = kor + eng + mat;
		System.out.println("�������� ���� : " + result);
	}
	
	void dog() {
		System.out.println("�޼��� dog����~");
	}
	void view() {
		int a=10, b=20;
		System.out.printf("���� a : %d , ���� b : %d\n", a, b);
	}
	void info() {
		int age = 20;
		String name = "�ƹ���";
		
		System.out.printf("�̸� : %s, ���� : %d\n", name, age);
	}
}


