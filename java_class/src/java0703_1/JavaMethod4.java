package java0703_1;

public class JavaMethod4 {

	public static void main(String[] args) {
		// �޼��带 ���ؼ� ���� 10�� �޾� ����ϱ�
		
		ReturnMth rm = new ReturnMth();
		int num = rm.get();
		System.out.println(num);
		
		//�޼���κ��� �������� ���ϱ� ��� �޾Ƽ� ����ϱ�
		int sum = rm.sum();
		System.out.println(sum);
		
		String userName = rm.getName();
		int age=34;
		System.out.println(userName + " " + age);
		
		//����, ����, ���� �� ������ ������ ���ϴ� �޼���
		// �������� ����� ���ϴ� �޼���
		// ������ ����� ����ϼ���
		
		int ���� = rm.totalScore();
		int ��� = rm.avgScore(����);
		System.out.printf("���� : %d , ��� : %d", ����, ���);
	}

}
/*
  �ֻ��� ����
  j���� �� s�����̰� �ֻ��� ������ �Ѵ�.
  �ֻ����� �ϳ�, �����̴�.
  �ֻ����� ���� ū ����� �̱��.
  
  �ֻ��� �� ���ϴ� �޼��� (�������� �ֻ��� ������ �޼���, �Ű����� �ʿ� ����, ��ȯ�� �ʿ���)
  
  �ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���(���ذ� �������� �ֻ��� ���� ���� �Ű����� �ʿ���, ���� �̰���� ���, ��ȯ�� �ʿ����)
 */

class ReturnMth{
	int totalScore() {
		int kor=89, eng=78, math=50;
		int result = kor + eng + math;
		return result;
		
	}
	
	int avgScore(int total) {
		int avg = total / 3;
		return avg;
	}
	
	
	
	String getName() {
		String name = "�̼���";
		return name;
	}
	
	
	int get() {
		return 10;
	}
	
	int sum() {
		int num1=30, num2=45;
		int result = num1 + num2;
		return result; 
	}
}
