package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		
		try {
			String name = null;
			name.length();
			System.out.println(10/0);
		}catch(NullPointerException e1){
			e1.printStackTrace(); // �����޼��� Ȯ�� - �׽�Ʈ��
			System.out.println(e1.getMessage());
			System.out.println(e1.getClass());
			System.out.println("���ڿ� �Է�!");
		}catch(Exception e2) {
			System.out.println("0���� ������ �ϸ� �ȵ�");
		}
			
		
	}
}

/*
	����ó��
	 - ���α׷� �����߿� ���� �߻��ϸ� ��� ���α׷� ����ȴ�.
	   ����ó���� ���ָ� ������ �߻��ص� ���α׷��� ���� ���� �ʴ´�.
	 - ����ڰ� �߸��Ȱ��� �Է��ϴ� ���� �˷��� �� �ִ�.
	 - ������ ������ �ذ��ϴ� ����� �ƴϰ�, ȸ���ϴ� ����̴�.

*/
