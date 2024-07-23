package homeProduct;

public class Aircon extends House {
	static final String[] windText = {"��", "��", "��"}; //final = const
	int wind=0;
	int temperature=24;
	
	
	Aircon(){}
	Aircon(String brand, int price){
		super(brand,price);
	}
	
	//�������� ���� ���ϴ°Ϳ����� �޼����� �ڵ带 �ٲ�°��� �����ؾ��Ѵ�.
	void windControl() {
		wind++;
		if(wind == windText.length )  wind = 0;
		System.out.println("���� �ٶ����� : " + windText[wind]);
		
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
		System.out.println("Aircon ����" + super.onOff);
	}
}
