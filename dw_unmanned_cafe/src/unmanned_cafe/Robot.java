package unmanned_cafe;

public class Robot {
	private boolean loadedDrink;
	
	public void makeDrink(Drink drink) {
		this.loadedDrink = true;
		System.out.println(drink.getName()+"를 로봇에 담았습니다.");
	}
	
	public void deliverDrink(Table table) {
		if(this.loadedDrink == true) {
			System.out.println(table.getTableNum()+"번 테이블로 음료를 배달 완료했습니다.");
		}else {
			System.out.println("배달할 음료가 없습니다.");
		}
	}
}
