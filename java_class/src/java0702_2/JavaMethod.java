package java0702_2;

public class JavaMethod {

	public static void main(String[] args) {
		//Ŭ�����޼��忡���� ���� Ŭ���� ������ Ŭ���� �޼��常 ���� - �޸𸮿� �ε�(����)�Ǵ� ���� �ν��Ϻ��� ���� �̷������ ������
		//�ν��Ͻ������� �ν��Ͻ� �޼���� �ȵȴ�.
		int num = 300;
		output(num);
//		a.out();
		
	}
	
	static void output(int num) {
		System.out.println(num);
		System.out.println("���� �޼��� �Դϴ�. ");
	}

}

//class a{
//	int num=10;
//	
//	static void out() {
//		System.out.println(num);
//	}
//}

//�ڹ� �޼���
//��ȯŸ�� �޼����̸�(�Ű�����){  }

//��ȯŸ�� - int, short, float, double, char, boolean
//		  void, String
//		  �޼����� return ������
//  return 10; -> ��ȯŸ�� int, short, long
//return income; -> income ������ Ÿ���� ��ȯŸ������
//void Ÿ���� ��ȯ���� ���ٴ¶�� �ǹ�

/*
	�ֹε�Ϲ�ȣ�� �������� �������� ����
	String gender( String jumin){
		String gen = jumin.sbustring(7, 8);
		if(gen.equals("1" || gen.equals("3");{
			return "����";
		}else if(gen.equls("2") || gen.equals("4"){
		return "����";
	}
	return "ȥ��";
*/

//main �޼��� -> JVM