package java0702_2;

import java.util.Arrays;

public class ClassObject {

	public static void main(String[] args) {
		
//		System.out.println(Car.제조사 );
//		
//		Car car1; //클래스 타입에 변수만 만들어짐
//		
//		car1.연료 = "휘발유"; //car1 변수에는 아직 아무것도 들어가있지 않아서 사용불가
//		
//		car1 = new Car();// new 연산자를 통해 메모리 할당 -> carName, 배기량, 연료 변수 생성
//		car1.carName = "소나타";
//		car1.제조사 = "기아";
//		System.out.println(Car.제조사);
//		
//		Car car2 = new Car("그랜져",3000,"휘발유");
		
//		WebNovel subs = new WebNovel(); 오버로딩을 사용하면 기본 생성자 메서드를 쓸 수 없다. 쓸려면 직접 작성해줘야 한다. 
		WebNovel subs1 = new WebNovel("김건우", 4580, 4.3);
		WebNovel subs2 = new WebNovel("김경제", 3485, 4.1);
		WebNovel subs3 = new WebNovel("박재범", 90930, 2.7);
		WebNovel subs4 = new WebNovel("서석완", 19200, 3.1);
		
		System.out.println(subs1);
		System.out.println(subs2);
		System.out.println(subs3);
		System.out.println(subs4);
		
	}

}

//클래스 내부에 선언되는 변수(또는 배열)는 두가지가 있다.
//클래스 변수, 인스턴스변수
//인스턴스변수는 클래스 객체 생성시 메모리 할당이 된다.
//클래스 객체 생성은 new 연산자를 통한다.
//클래스 변수는 프로그램 실행할 때 메모리에 로드하면서 생성된다.
//클래스 객체 생성을 아무리 많이 해도 생성한만큼 늘어나는 인스턴스변수와 달리 클래스변수는 클래스 내부 선언한 갯수에서 변하지않는다.

//생성자 메서드 - 객체(인스턴스) 공간을 생성할때 공간 초기화 해주는 메서드(공간 생성은 new 연산자가 초기화는 생성자 메서드가)
//			- return이 존재하지 않는다. 매개변수만 가능
//			- return을 하면 안되는 이유는 생성자메서드에는 return 타입 지정이 안되기 때문에
//
//오버로딩 - 오버로딩 구현 조건
//		1. 동일 클래스에서만 가능하다.
//		2. 메서드의 이름은 같아야 한다.
//		3. 매개변수의 타입은 다르게 선언되어야 한다.
//		4. 매개변수의 갯수가 달라야 한다.

class Car{
	static String 제조사 = "현대"; // 클래스 변수, static(정적변수, 정적 메서드) - 제어자
	
	String carName; // 인스턴스 변수
	int 배기량; // 인스턴스 변수
	String 연료; // 인스턴스 변수
	
	// 생성자 메서드
	Car(){
		//생성자 메서드의 내용 - 인스턴스변수의 초기값 지정
//		연료="휘발유"; //new 연산자에 의해 객체 생성시 연료변수에 휘발유 저장된다.
	}
	Car(String 연료){
		this.연료 = 연료;
	}
	
	//매개변수가 있는 생성자 메서드 - 모든 변수의 매개변수를 받을 필요없다. 필요한것만 써도됨.
	Car(String carName, int cc, String fuel){
		this.carName = carName;
		배기량 = cc;
		this.연료 = fuel;
	}
	//여러개의 생성자 메서드를 같은 이름으로 만드는 오버로딩이 가능함.
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
	
	public String toString() { //생성자 메서드 아님. 주소대신 문자열을 출력할 수 있게 해주는 메서드.
		return name+" "+point+"점  "+rating;
	}
}

