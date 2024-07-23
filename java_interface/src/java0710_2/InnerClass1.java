package java0710_2;

public class InnerClass1 {

	public static void main(String[] args) {
		Out out = new Out();
//		out.obj.age=34;
//		
//		//외부클래스 객체를 먼저 만들어줘야지 내부클래스 객체를 만들 수 있음.
//		Out.인스턴스내부클래스 in = out.new 인스턴스내부클래스();
//		in.age=20;
		Out.정적클래스 in = new Out.정적클래스();
		
		
	}

}

// static으로 선언 및 정의한 변수와 메서드는
// 인스턴스 메서드에서 사용가능
// 인스턴스 변수, 메서드는
// static 메서드에서 사용 불가(static이 먼저 만들어지므로 만들어지는 시점이 불분명한 인스턴스 변수, 메서드는 사용불가)

class Out{
	static int count; //클래스 변수
	int num; //인스턴스 변수
	private String job; //인스턴스 변수
	인스턴스내부클래스 obj = new 인스턴스내부클래스();
	
	interface Car{ //내부 인터페이스
		void make();
	}
	void makeCar() {
		Car c = new Car() {
			@Override
			public void make() {
				System.out.println("익명 클래스를 통해 만들기");
			}
		};
		c.make();
	}
	
	void buyComputer() {
		//지역클래스는 메서드가 실행되어야지 사용가능하므로 제어자를 사용하는 의미가 없기때문에 제어자 사용불가
		//클래스의 인스턴스 변수, 메서드에도 마찬가지로 static같은 제어가 사용 X
		class 지역클래스{ //메서드 내부에서 사용 가능한 클래스
			int weight;
			void del() {
				
			}
		}
		지역클래스 ob = new 지역클래스();
	}
	
	
	static class 정적클래스{ //Out 클래스 객체에 속하지 않는다.
		int tall;
		static int birth;
		static void update() {
			
		}
	}
	
	//보통 내부클래스는 내부에서만 사용할 목적으로 만들기 때문에 private을 붙이고 내부에서만 사용하는것이 맞다.
	private class 인스턴스내부클래스{ //static 변수, 메서드 불가
		public int age;
		private String name;
		void setName(String name) {
			this.name = name;
		}
//		static void create() { 내부클래스가 인스턴스내부클래스이기때문에 static 사용불가
//			count = 10;
//		}
	}
}

/* 내부클래스 - 클래스 내부에서만 사용 가능한 클래스
           - 포함관계인 클래스들 중에 포함되는 쪽에 클래스가 오직 
             포함관계인 클래스에서만 사용한다면 내부 클래스로 사용하는것이 좋다.
	1.인스턴스 내부 클래스
	2. 정적 내부 클래스
	3. 지역 내부 클래스
	4. 익명 내부 클래스
 */
