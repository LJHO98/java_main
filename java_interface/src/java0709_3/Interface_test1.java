package java0709_3;

interface RestCustomer{ //식당에 찾아 오는 손님
	
	public void setCustomer(String customer);
	public String food();
}

class ReservCustomerA implements RestCustomer{
	String customer; // 예약 손님

	@Override
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String food() {
		return customer+" 청국장 준다.";
	}
	
}//예약손님 A
class ReservCustomerB implements RestCustomer{
	String customer; // 예약 손님

	@Override
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String food() {
		return customer+" 돈까스 준다.";
	}
}//예약손님 B

class Owner{ //사장
	void food( RestCustomer cus) {
		System.out.println(cus.food());
	}
	
}

public class Interface_test1 {

	public static void main(String[] args) {
		Owner ow = new Owner();
		ReservCustomerA a = new ReservCustomerA();
		ReservCustomerB b = new ReservCustomerB();
		a.setCustomer("A-이순신");
		b.setCustomer("B-장보고");
		
		ow.food(a);
		ow.food(b);

	}

}



// 사용자 요청 처리 클래스 - 컨트롤 클래스
// 사용자 요청에 필요한 데이터 가공및 수집, 실행클래스 - 서비스 클래스
// 데이터만 저장하는 클래스 - 사용자에게 제공할 데이터 클래스 - VO,DTO
//                   - 데이터베이스에 저장할 데이터 클래스 - Entity
// 데이터베이스 처리 인터페이스 - repository
// 
