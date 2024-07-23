package java0702_2;

import java.util.Arrays;

public class ClassObject {

	public static void main(String[] args) {
		
//		System.out.println(Car.������ );
//		
//		Car car1; //Ŭ���� Ÿ�Կ� ������ �������
//		
//		car1.���� = "�ֹ���"; //car1 �������� ���� �ƹ��͵� ������ �ʾƼ� ���Ұ�
//		
//		car1 = new Car();// new �����ڸ� ���� �޸� �Ҵ� -> carName, ��ⷮ, ���� ���� ����
//		car1.carName = "�ҳ�Ÿ";
//		car1.������ = "���";
//		System.out.println(Car.������);
//		
//		Car car2 = new Car("�׷���",3000,"�ֹ���");
		
//		WebNovel subs = new WebNovel(); �����ε��� ����ϸ� �⺻ ������ �޼��带 �� �� ����. ������ ���� �ۼ������ �Ѵ�. 
		WebNovel subs1 = new WebNovel("��ǿ�", 4580, 4.3);
		WebNovel subs2 = new WebNovel("�����", 3485, 4.1);
		WebNovel subs3 = new WebNovel("�����", 90930, 2.7);
		WebNovel subs4 = new WebNovel("������", 19200, 3.1);
		
		System.out.println(subs1);
		System.out.println(subs2);
		System.out.println(subs3);
		System.out.println(subs4);
		
	}

}

//Ŭ���� ���ο� ����Ǵ� ����(�Ǵ� �迭)�� �ΰ����� �ִ�.
//Ŭ���� ����, �ν��Ͻ�����
//�ν��Ͻ������� Ŭ���� ��ü ������ �޸� �Ҵ��� �ȴ�.
//Ŭ���� ��ü ������ new �����ڸ� ���Ѵ�.
//Ŭ���� ������ ���α׷� ������ �� �޸𸮿� �ε��ϸ鼭 �����ȴ�.
//Ŭ���� ��ü ������ �ƹ��� ���� �ص� �����Ѹ�ŭ �þ�� �ν��Ͻ������� �޸� Ŭ���������� Ŭ���� ���� ������ �������� �������ʴ´�.

//������ �޼��� - ��ü(�ν��Ͻ�) ������ �����Ҷ� ���� �ʱ�ȭ ���ִ� �޼���(���� ������ new �����ڰ� �ʱ�ȭ�� ������ �޼��尡)
//			- return�� �������� �ʴ´�. �Ű������� ����
//			- return�� �ϸ� �ȵǴ� ������ �����ڸ޼��忡�� return Ÿ�� ������ �ȵǱ� ������
//
//�����ε� - �����ε� ���� ����
//		1. ���� Ŭ���������� �����ϴ�.
//		2. �޼����� �̸��� ���ƾ� �Ѵ�.
//		3. �Ű������� Ÿ���� �ٸ��� ����Ǿ�� �Ѵ�.
//		4. �Ű������� ������ �޶�� �Ѵ�.

class Car{
	static String ������ = "����"; // Ŭ���� ����, static(��������, ���� �޼���) - ������
	
	String carName; // �ν��Ͻ� ����
	int ��ⷮ; // �ν��Ͻ� ����
	String ����; // �ν��Ͻ� ����
	
	// ������ �޼���
	Car(){
		//������ �޼����� ���� - �ν��Ͻ������� �ʱⰪ ����
//		����="�ֹ���"; //new �����ڿ� ���� ��ü ������ ���ắ���� �ֹ��� ����ȴ�.
	}
	Car(String ����){
		this.���� = ����;
	}
	
	//�Ű������� �ִ� ������ �޼��� - ��� ������ �Ű������� ���� �ʿ����. �ʿ��Ѱ͸� �ᵵ��.
	Car(String carName, int cc, String fuel){
		this.carName = carName;
		��ⷮ = cc;
		this.���� = fuel;
	}
	//�������� ������ �޼��带 ���� �̸����� ����� �����ε��� ������.
}

class WebNovel{
	String name;
	int point;
	double rating;
	
	WebNovel(){
		
	}
	
	WebNovel(String name, int point, double rating){
		this.name = name;
		this.point = point;
		this.rating = rating;
//		System.out.print(this.name + " , " + this.point + " , " + this.rating);
//		System.out.println();
	}
	
	WebNovel(String name){
		this.name = name;
	}
	
	public String toString() { //������ �޼��� �ƴ�. �ּҴ�� ���ڿ��� ����� �� �ְ� ���ִ� �޼���.
		return name+" "+point+"��  "+rating;
	}
}

