package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {
		Out out = new Out();
//		out.obj.age=34;
//		
//		//�ܺ�Ŭ���� ��ü�� ���� ���������� ����Ŭ���� ��ü�� ���� �� ����.
//		Out.�ν��Ͻ�����Ŭ���� in = out.new �ν��Ͻ�����Ŭ����();
//		in.age=20;
		Out.����Ŭ���� in = new Out.����Ŭ����();
		
		
	}

}

// static���� ���� �� ������ ������ �޼����
// �ν��Ͻ� �޼��忡�� ��밡��
// �ν��Ͻ� ����, �޼����
// static �޼��忡�� ��� �Ұ�(static�� ���� ��������Ƿ� ��������� ������ �Һи��� �ν��Ͻ� ����, �޼���� ���Ұ�)

class Out{
	static int count; //Ŭ���� ����
	int num; //�ν��Ͻ� ����
	private String job; //�ν��Ͻ� ����
	�ν��Ͻ�����Ŭ���� obj = new �ν��Ͻ�����Ŭ����();
	
	interface Car{ //���� �������̽�
		void make();
	}
	void makeCar() {
		Car c = new Car() {
			@Override
			public void make() {
				System.out.println("�͸� Ŭ������ ���� �����");
			}
		};
		c.make();
	}
	
	void buyComputer() {
		//����Ŭ������ �޼��尡 ����Ǿ���� ��밡���ϹǷ� �����ڸ� ����ϴ� �ǹ̰� ���⶧���� ������ ���Ұ�
		//Ŭ������ �ν��Ͻ� ����, �޼��忡�� ���������� static���� ��� ��� X
		class ����Ŭ����{ //�޼��� ���ο��� ��� ������ Ŭ����
			int weight;
			void del() {
				
			}
		}
		����Ŭ���� ob = new ����Ŭ����();
	}
	
	
	static class ����Ŭ����{ //Out Ŭ���� ��ü�� ������ �ʴ´�.
		int tall;
		static int birth;
		static void update() {
			
		}
	}
	
	//���� ����Ŭ������ ���ο����� ����� �������� ����� ������ private�� ���̰� ���ο����� ����ϴ°��� �´�.
	private class �ν��Ͻ�����Ŭ����{ //static ����, �޼��� �Ұ�
		public int age;
		private String name;
		void setName(String name) {
			this.name = name;
		}
//		static void create() { ����Ŭ������ �ν��Ͻ�����Ŭ�����̱⶧���� static ���Ұ�
//			count = 10;
//		}
	}
}

/* ����Ŭ���� - Ŭ���� ���ο����� ��� ������ Ŭ����
           - ���԰����� Ŭ������ �߿� ���ԵǴ� �ʿ� Ŭ������ ���� 
             ���԰����� Ŭ���������� ����Ѵٸ� ���� Ŭ������ ����ϴ°��� ����.
	1.�ν��Ͻ� ���� Ŭ����
	2. ���� ���� Ŭ����
	3. ���� ���� Ŭ����
	4. �͸� ���� Ŭ����
 */
