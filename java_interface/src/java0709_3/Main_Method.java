package java0709_3;

public class Main_Method {

	public static void main(String[] args) {

		move d = new dog();
		move c = new cat();
		c.moving();
		d.moving();
	}
}
		
class dog implements move{
	public void moving() {
		System.out.println("��ŭ��ŭ �̵��Ѵ�.");
	}
}

class cat implements move{
	public void moving() {
		System.out.println("��� �λ� �̵��Ѵ�.");
	}
}

interface move{
	static int a = 10;
	public void moving();
}



/*
	�������̽� - �߻�Ŭ������ �� ����
	 - �߻�޼��常 ����
	 - �ν��Ͻ����� �Ұ�
	 - static ����, static �޼��� ���� ����
	 - ��ü �����Ұ�
	 - Ŭ�����鿡 ����Ǿ� ���ȴ�.
	 - ������ ������ ���� ����Ѵ�.
	 - ���α׷��� �⺻Ʋ�� ������ �� �ִ�.
	 
	 �������� Ŭ���̾�Ʈ���� �������� �����Ѵ�.
	 Ŭ���̾�Ʈ�� ��û�� �޾� �ִ� �޼���
	 Ŭ���̾�Ʈ�� ���ϴ� �������� �����ϴ� �޼���
	 
	����� ���� �޼ҵ带 ������ �����ʰ� �����͸��� �ٷ�� Ŭ������ 
	��Ӻ��� �������̽��� ����ϴ°��� ����.



 */