package test_template;

public class Coffee extends Beverage{

	@Override
	protected void ingredients() {
		System.out.println("커피 가루 추가");
	}
	@Override
	protected void add() {
		System.out.println("우유 추가");
	}
}
