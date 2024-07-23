package homeProduct;

public class MainClass {

	public static void main(String[] args) {
		Tv tv = new Tv("삼성", 100000);
		System.out.printf("%s, %d\n", tv.brand, tv.price);
		tv.power();
		tv.power();
		tv.channelUp();
		tv.channel++;
		tv.setVol(10);
		
		Aircon air = new Aircon();
		air.brand="LG휘센";
		System.out.println(air.brand);
		air.power();
		air.power();
		air.windControl();
		
		System.out.println(" 다형성 ");
		House tv2 = new Tv("LG", 150000);
		tv2.power();
		House item = new Tv("삼성", 1750000);
		item.power();
		item = new Aircon("휘센", 1030000);
		//item.windControl(); //부모클래스 타입으로 만들어진 item은 자식클래스인 Aircon에 
		//					  필드나 메서드를 사용할 수 없다.
	}

}
// 클래스의 관계 - 상속 관계
// 상속 관계에 놓여있는 클래스들은 부모 클래스와 자식클래스로 나뉜다.
// 부모 클래스의 필드(변수), 메서드를 하위클래스(자식클래스)에서 사용가능하다.
// 1. 상속은 재사용을 위해 사용한다. - 여러 클래스들간의 중복코드를
// 	  하나의 클래스로 통합시켜 사용
// 2. 상위클래스(부모클래스)의 필드(변수), 메서드를 모두 하위(자식)클래스
//	  에서 사용하지는 못한다. - 제어자에 따라, 패키지에 따라 제한적이다.
// 3. 하위(자식)클래스에서 부모를 지칭하는 예약어는 super이다.
// 

// 클래스 상속
// 상속 하려면 자식클래스이름 뒤에 extends 부모클래스이름
// extends - 확장, 연장....
// Tv extends House -> Tv클래스가 자식이고 House가 부모클래스이다.
// 상속을 하는 가장 큰 이유 - 다형성 
// 부모클래스의 인스턴스변수, 인스턴스메서드, 클래스변수,
//			클래스메서드 사용가능하다.
//단, 부모클래스의 모든걸 사용하지는 못한다.
// 일부 제어 걸려있는 변수나 메서드는 사용 불가
//
// 생성자메서드를 통해 인스턴스변수들의 초기화는
// 자식클래스가 가지고있는 변수는 자식클래스 생성자메서드에서 초기화
// 부모클래스가 가지고있는 변수는 부모클래스 생성자메서드에서 초기화
