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
		System.out.println("�ſ� ���� ������.");
	}

	private void boildWater() {
		System.out.println("���� ���δ�.");
	}
	
	private void stir() {
		System.out.println("���� �ϼ�");
	}
}

