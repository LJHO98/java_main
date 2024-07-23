package service;

import java.util.Scanner;

import dto.Coffe;
import dto.Tea;

public class Order implements Kiosk{
	private Coffe orderCoffe;
	private Tea orderTea;
	
	public Order(Coffe orderCoffe) {
		this.orderCoffe = orderCoffe;
	}
	public Order(Tea orderTea) {
		this.orderTea = orderTea;
	}
	
	@Override
	public void action() {
		// 주문 확인 및 결제 진행하기
		System.out.println("주문 메뉴 확인");
		System.out.println(orderCoffe!=null ? orderCoffe : orderTea);
		System.out.println("=== 결제 ===");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.결제 2.닫기 : ");
		if(sc.nextInt() == 2) return;
		Kiosk payment = new Payment(orderCoffe!=null ? orderCoffe : orderTea);
		payment.action();
		
	}
}
