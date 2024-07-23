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
		System.out.println("성큼성큼 이동한다.");
	}
}

class cat implements move{
	public void moving() {
		System.out.println("사뿐 싸뿐 이동한다.");
	}
}

interface move{
	static int a = 10;
	public void moving();
}



/*
	인터페이스 - 추상클래스의 한 종류
	 - 추상메서드만 가능
	 - 인스턴스변수 불가
	 - static 변수, static 메서드 선언 가능
	 - 객체 생성불가
	 - 클래스들에 연결되어 사용된다.
	 - 다형성 구현을 위해 사용한다.
	 - 프로그램의 기본틀을 구축할 수 있다.
	 
	 서버에서 클라이언트에게 페이지를 제공한다.
	 클라이언트의 요청을 받아 주는 메서드
	 클라이언트가 원하는 페이지를 제공하는 메서드
	 
	기능을 가진 메소드를 가지고 있지않고 데이터만을 다루는 클래스는 
	상속보다 인터페이스를 사용하는것이 좋다.



 */