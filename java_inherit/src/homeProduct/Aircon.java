package homeProduct;

public class Aircon extends House {
	static final String[] windText = {"미", "약", "강"}; //final = const
	int wind=0;
	int temperature=24;
	
	
	Aircon(){}
	Aircon(String brand, int price){
		super(brand,price);
	}
	
	//변수들의 값이 변하는것에의해 메서드의 코드를 바뀌는것은 지양해야한다.
	void windControl() {
		wind++;
		if(wind == windText.length )  wind = 0;
		System.out.println("현재 바람세기 : " + windText[wind]);
		
	}
	
	void tempUp() {
		this.temperature++;
	}
	
	void tempDown() {
		this.temperature--;
	}
	
	@Override
	protected void power() {
		super.onOff = !super.onOff;
		System.out.println("Aircon 전원" + super.onOff);
	}
}
