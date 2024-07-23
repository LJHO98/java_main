package java0717_1;

import java.util.ArrayList;

public class GenericStudy1 {

	public static void main(String[] args) {
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		
		appleBox.setFruit(new Apple());
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		
		bananaBox.setFruit(new Banana());
		
		FruitBox<Grape> grapeBox = new FruitBox<>();
		grapeBox.setFruit(new Grape());
		
		Apple apple = appleBox.getFruit(); //제네릭 사용시 형변환 해주지 않아도됨.
		//제네릭을 사용하지 않을시 - Apple apple = (Apple)appleBox.getFruit();
		
		//Fruit 부모 클래스의 속한 자식클래스 타입들만 사용가능
		//FruitBox<Toy> toyBox = new FruitBox<>();
		//toyBox.setFruit(new Toy());
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		fruitBox.setFruit(new Apple());
		
		Juice j = new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
		
		
		
		
		
//		A<String> a = new A<>();
//		//A<String> -> A클래스의 제네릭타입 T에 String으로 지정된다.
//		//item변수는 String item으로 사용된다.
//		a.item = "이순신";
//		
//		A<Integer> b = new A<>();
//		b.item=233;

	}

}

/*
	generic
	- 클래스 내부의 타입을 지정하는 방법
	
	제네릭 타입 표현
	 T - type
	 E - element
	 K - key
	 V - value
	 N - number
	 
	 - 클래스에 제네릭 표현 방법
	 	class A<T>
	 - 제네릭 타입은 클래스 타입만 지정할 수 있다.
	 	A<Tea> a = new A<Tea>();
	 - 제한 없는 클래스라면 모두 가능하다.
	 - 제네릭타입으로 사용 가능한 클래스 제한을 두는 방법
	 	class A<T extends Parent>
	 	-> Parent 클래스의 자식 클래스와 Parent클래스만
	 	   제네릭으로 타입 지정이 가능하다.
	 	   이외 다른 클래스들은 불가
	    -> 다중 타입으로 제한을 설정할 수 있다.
	    -> 인터페이스만 다중 타입 설정 가능, 클래스는 안됨.
	 
	 - 제네릭 와일드 카드 <?>
	 	제네릭 타입의 한계를 보완하기 위해 사용하는 방법
	 	메서드의 매개변수타입으로 제네릭 타입 표현되는 클래스를 사용한다면
	 	클래스에 표현된 제네릭이 제대로 표현되지 않기 때문에 다시한번
	 	제네릭 지정해야 한다.
	 	이때 사용되는 예외 없이 허용한다라고 해서 ? 로 표현
	 
	 - 와일드 카드의 제한
	 	<? extends T> : T 클래스와 그 자식까지 가능
	 	<? super T> : T클래스와 그 조상까지 가능(자식안됨)
*/

//제네릭 사용시
class A<T> {
	T item;
//	T[] arr = new T[3]; new연산자 사용불가
	ArrayList<T> list = new ArrayList<>(); //동적배열은 사용가능
	
// 타입이 지정되어야지 얼마만큼의 공간이 필요한지 알고 그 크기만큼 heap 영역의 공간을 만들어주는데 아직 타입이 지정되지않았기 때문에 불가
// 변수나 배열을 선언하는 건 힙 영역이 아닌 스택이나 데이터 영역에 선언하는거라 상관없다. 공간의 크기가 필요한것은 힙 영역.
	
	void setItem(T item) {
		this.item=item;
	}
}

//제네릭 사용 안할시
class B{
	int item1;
	String item2;
	//....
	
	void setItem(int item) {
		this.item1=item;
	}
	void setItem(String item) {
		this.item2=item;
	}
	
	//....
}
