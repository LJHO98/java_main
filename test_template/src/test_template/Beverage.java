package test_template;

abstract class Beverage {
	public final void recipe(){
		boildWater();
		pourInCup();
		ingredients();
		add();
		stir();
	}
	
	abstract protected void ingredients();
	abstract protected void add();

	private void pourInCup() {
		System.out.println("컵에 물을 따른다.");
	}

	private void boildWater() {
		System.out.println("물을 끓인다.");
	}
	
	private void stir() {
		System.out.println("음료 완성");
	}
}

