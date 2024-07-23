package service;

import dto.Coffe;
import dto.Tea;

public class Payment implements Kiosk{
	private Coffe orderCoffe;
	private Tea orderTea;
	
	public Payment(Object drink) {
		//instanceof - 자식클래스의 클래스타입을 확인하기(그래서 최상위 클래스인 Object drink를 사용)
		if(drink instanceof Coffe)
			this.orderCoffe=(Coffe)drink;
		if(drink instanceof Tea)
			this.orderTea = (Tea)drink;
	}
	
	
	@Override
	public void action() {
		System.out.println(" 결제 진행합니다. ");
		int price  = orderCoffe!=null ? orderCoffe.getPrice() : orderTea.getPrice();
		System.out.println("결제 금액 : " + price);
		
	}
}
