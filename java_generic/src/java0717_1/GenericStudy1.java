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
		
		Apple apple = appleBox.getFruit(); //���׸� ���� ����ȯ ������ �ʾƵ���.
		//���׸��� ������� ������ - Apple apple = (Apple)appleBox.getFruit();
		
		//Fruit �θ� Ŭ������ ���� �ڽ�Ŭ���� Ÿ�Ե鸸 ��밡��
		//FruitBox<Toy> toyBox = new FruitBox<>();
		//toyBox.setFruit(new Toy());
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		fruitBox.setFruit(new Apple());
		
		Juice j = new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
		
		
		
		
		
//		A<String> a = new A<>();
//		//A<String> -> AŬ������ ���׸�Ÿ�� T�� String���� �����ȴ�.
//		//item������ String item���� ���ȴ�.
//		a.item = "�̼���";
//		
//		A<Integer> b = new A<>();
//		b.item=233;

	}

}

/*
	generic
	- Ŭ���� ������ Ÿ���� �����ϴ� ���
	
	���׸� Ÿ�� ǥ��
	 T - type
	 E - element
	 K - key
	 V - value
	 N - number
	 
	 - Ŭ������ ���׸� ǥ�� ���
	 	class A<T>
	 - ���׸� Ÿ���� Ŭ���� Ÿ�Ը� ������ �� �ִ�.
	 	A<Tea> a = new A<Tea>();
	 - ���� ���� Ŭ������� ��� �����ϴ�.
	 - ���׸�Ÿ������ ��� ������ Ŭ���� ������ �δ� ���
	 	class A<T extends Parent>
	 	-> Parent Ŭ������ �ڽ� Ŭ������ ParentŬ������
	 	   ���׸����� Ÿ�� ������ �����ϴ�.
	 	   �̿� �ٸ� Ŭ�������� �Ұ�
	    -> ���� Ÿ������ ������ ������ �� �ִ�.
	    -> �������̽��� ���� Ÿ�� ���� ����, Ŭ������ �ȵ�.
	 
	 - ���׸� ���ϵ� ī�� <?>
	 	���׸� Ÿ���� �Ѱ踦 �����ϱ� ���� ����ϴ� ���
	 	�޼����� �Ű�����Ÿ������ ���׸� Ÿ�� ǥ���Ǵ� Ŭ������ ����Ѵٸ�
	 	Ŭ������ ǥ���� ���׸��� ����� ǥ������ �ʱ� ������ �ٽ��ѹ�
	 	���׸� �����ؾ� �Ѵ�.
	 	�̶� ���Ǵ� ���� ���� ����Ѵٶ�� �ؼ� ? �� ǥ��
	 
	 - ���ϵ� ī���� ����
	 	<? extends T> : T Ŭ������ �� �ڽı��� ����
	 	<? super T> : TŬ������ �� ������� ����(�ڽľȵ�)
*/

//���׸� ����
class A<T> {
	T item;
//	T[] arr = new T[3]; new������ ���Ұ�
	ArrayList<T> list = new ArrayList<>(); //�����迭�� ��밡��
	
// Ÿ���� �����Ǿ���� �󸶸�ŭ�� ������ �ʿ����� �˰� �� ũ�⸸ŭ heap ������ ������ ������ִµ� ���� Ÿ���� ���������ʾұ� ������ �Ұ�
// ������ �迭�� �����ϴ� �� �� ������ �ƴ� �����̳� ������ ������ �����ϴ°Ŷ� �������. ������ ũ�Ⱑ �ʿ��Ѱ��� �� ����.
	
	void setItem(T item) {
		this.item=item;
	}
}

//���׸� ��� ���ҽ�
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
