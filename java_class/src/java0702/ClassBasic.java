package java0702;

public class ClassBasic {

	public static void main(String[] args) {
		//class 이름 첫글자는 대문자, 내장클래스들처럼(String, Scanner, Arrays ...)
		
		//정의된 클래스 타입의 공간을 생성한다.
		//생성된 공간에 데이터를 저장한다.
		//클래스 타입으로 생성된 공간을 객체 또는 인스턴스라고 한다.
		
		//new 연산자로 생성된 변수는 참조변수.
		//클래스 인스턴스 생성 - 생성자 메서드
		Member member1 = new Member();
		Member member2 = new Member();
		
		
		member1.age = 15;
		member1.name = "이순신";
		
		System.out.println(member1.age);
		
		member2.name = "김유신";
		member2.age = 34;
		
		System.out.println(member2.name);
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.totPage =495;
		
		book2.title = "메모리최적화기법";
		book2.totPage = 893;
		
		System.out.println(book1.title);
		System.out.println(book1.totPage);
		
		SmartPhone phone1 = new SmartPhone();
		SmartPhone phone2 = new SmartPhone();
		SmartPhone phone3 = new SmartPhone();
		
		phone1.productName = "S24";
		phone1.os = "안드로이드14";
		phone1.ram = 8;
		
		phone2.productName = "S24P";
		phone2.os = "안드로이드14";
		phone2.ram = 12;
		
		phone3.productName = "S24U";
		phone3.os = "안드로이드14";
		phone3.ram = 12;
		
		System.out.printf("%s %s %d\n", phone1.productName ,phone1.os, phone1.ram);
		System.out.printf("%s %s %d\n", phone2.productName ,phone2.os, phone2.ram);
		System.out.printf("%s %s %d\n", phone2.productName ,phone2.os, phone2.ram);
		
	}

}

//클래스는 - 설계도, 객체 - 제품

//클래스는 사용자 정의 데이터 타입이라고 한다.
class Member{
	//밑에 변수들은 멤버변수, 인스턴스 변수라고 한다.
	String name;
	int age;
			
	//생성자 메서드는 생략되어있음
//	Member(){
//		
//	}
}

//책 제목과 총페이지수를 저장하기 위한 클래스 정의
class Book{
	String title;
	int totPage;
}

class SmartPhone{
	String productName;
	String os;
	int ram;
}

