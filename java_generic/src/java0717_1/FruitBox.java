package java0717_1;

public class FruitBox<T extends Fruit> {
	private T fruit;
	
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
	public T getFruit() {
		return this.fruit;
	}
	
}
