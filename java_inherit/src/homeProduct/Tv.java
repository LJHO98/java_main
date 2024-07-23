package homeProduct;

public class Tv extends House {
	private int channel = 10; //채널
	private int vol = 5; //소리
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	public int getVol() {
		return vol;
	}


	public void setVol(int vol) {
		this.vol = vol;
	}


	public int getChannel() {
		return channel;
	}


	protected Tv(){
		super();
	}
	//매개변수 있는 생성자 메서드
	public Tv(String brand, int price){
		super(brand, price); // 부모클래스 생성자메서드 호출
	}
	
	public void channelUp() {
		this.channel++;
	}
	
	void channelDw() {
		this.channel--;
	}
	
	@Override
	protected void power() {
		super.onOff = !super.onOff;
		System.out.println("TV 전원" + super.onOff);
	}
}
// 오버로딩 - 새로운 메서드를 정의하는것
// 오버라이딩 - 기존의 메서드를 재정의 하는것 

// 오버라이딩 조건
// 부모클래스에 해당 메서드가 존재해야한다.
// 오버라이딩 메서드는 반드시 반환타입, 메서드 이름, 매개변수 모두 똑같이 작성해야한다.
// 메서드의 {} 내용은 달라도 된다.
