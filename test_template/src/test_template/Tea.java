package test_template;

public class Tea extends Beverage{
	@Override
	protected void ingredients() {
		System.out.println("티백 추가");
	}
	@Override
	protected void add() {
		System.out.println("설탕 추가");
	}
	
}
