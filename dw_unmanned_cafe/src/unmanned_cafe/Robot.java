package unmanned_cafe;

public class Robot {
	private boolean loadedDrink;
	
	public void makeDrink(Drink drink) {
		this.loadedDrink = true;
		System.out.println(drink.getName()+"�� �κ��� ��ҽ��ϴ�.");
	}
	
	public void deliverDrink(Table table) {
		if(this.loadedDrink == true) {
			System.out.println(table.getTableNum()+"�� ���̺�� ���Ḧ ��� �Ϸ��߽��ϴ�.");
		}else {
			System.out.println("����� ���ᰡ �����ϴ�.");
		}
	}
}
