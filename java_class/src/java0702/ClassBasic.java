package java0702;

public class ClassBasic {

	public static void main(String[] args) {
		//class �̸� ù���ڴ� �빮��, ����Ŭ������ó��(String, Scanner, Arrays ...)
		
		//���ǵ� Ŭ���� Ÿ���� ������ �����Ѵ�.
		//������ ������ �����͸� �����Ѵ�.
		//Ŭ���� Ÿ������ ������ ������ ��ü �Ǵ� �ν��Ͻ���� �Ѵ�.
		
		//new �����ڷ� ������ ������ ��������.
		//Ŭ���� �ν��Ͻ� ���� - ������ �޼���
		Member member1 = new Member();
		Member member2 = new Member();
		
		
		member1.age = 15;
		member1.name = "�̼���";
		
		System.out.println(member1.age);
		
		member2.name = "������";
		member2.age = 34;
		
		System.out.println(member2.name);
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.totPage =495;
		
		book2.title = "�޸�����ȭ���";
		book2.totPage = 893;
		
		System.out.println(book1.title);
		System.out.println(book1.totPage);
		
		SmartPhone phone1 = new SmartPhone();
		SmartPhone phone2 = new SmartPhone();
		SmartPhone phone3 = new SmartPhone();
		
		phone1.productName = "S24";
		phone1.os = "�ȵ���̵�14";
		phone1.ram = 8;
		
		phone2.productName = "S24P";
		phone2.os = "�ȵ���̵�14";
		phone2.ram = 12;
		
		phone3.productName = "S24U";
		phone3.os = "�ȵ���̵�14";
		phone3.ram = 12;
		
		System.out.printf("%s %s %d\n", phone1.productName ,phone1.os, phone1.ram);
		System.out.printf("%s %s %d\n", phone2.productName ,phone2.os, phone2.ram);
		System.out.printf("%s %s %d\n", phone2.productName ,phone2.os, phone2.ram);
		
	}

}

//Ŭ������ - ���赵, ��ü - ��ǰ

//Ŭ������ ����� ���� ������ Ÿ���̶�� �Ѵ�.
class Member{
	//�ؿ� �������� �������, �ν��Ͻ� ������� �Ѵ�.
	String name;
	int age;
			
	//������ �޼���� �����Ǿ�����
//	Member(){
//		
//	}
}

//å ����� ������������ �����ϱ� ���� Ŭ���� ����
class Book{
	String title;
	int totPage;
}

class SmartPhone{
	String productName;
	String os;
	int ram;
}

