package java0718_3;

public class Money {
	private int myMoney = 10000;
	public int getMymoney() {
		return myMoney;
	}
	// withdraw 메서드를 임계영역으로 설정
	// 하나의 스레드가 이 메서드를 사용하면 잠기면서 다른 쓰레드들은 대기
	public synchronized boolean widthdraw(int money) {
		if(myMoney >= money) {
		//현재 보유 금액보다 출금금액이 작거나 같다면 출금
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			//출금
			myMoney -= money;
			return true;
		}
		return false;
		
	}
}
