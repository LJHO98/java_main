package java0710_2;

interface Runnable{
	public void run();
}

class BankAccount{
	private int balance; //잔액
	private static String bankName = "계림Bank";
	public BankAccount(int balance) { //생성자 메서드
		this.balance=balance;
	}
	public void showBalance() { // 잔액 확인 메서드
		System.out.println("계좌 잔액 : "+balance);
	}
	
	//인스턴스 내부 클래스
	class Transaction{ //거래 - 입금, 출금
		void deposit(int amount ) {
			balance = balance + amount;
			System.out.println("입금 금액 : "+amount);
		}
		void withdraw(int amount) {
			if(balance >= amount ) {
				balance = balance - amount;
				System.out.println("출금 금액 : "+amount);
			}else {
				//출금액이 부족하다면
				System.out.println("잔액 부족! 출금 불가");
			}
		}
			
	}
	
	//정적 내부 클래스
	static class BankInfo{
		void showBankName() {
			System.out.println("은행 이름 : " + bankName);
		}
	}
	
	//지역 내부 클래스
	public void applyLoan(int amount) { //대출 신청
		class Loan{ // 지역 내부클래스 - 대출
			void progress() {
				System.out.println("대출 신청 금액 : " + amount);
			}
		}
		Loan loan = new Loan();
		loan.progress();
	}
	
	// 익명 내부 클래스
	public void interestCalc() {
		Runnable interest = new Runnable() {
			@Override
			public void run() {
				int interestMoney = (int)(balance*0.03);
				balance += interestMoney;
				System.out.println("이자 지급 : " + interestMoney);
				
			}
		};
		interest.run();
	}
	
}


public class InnerClass2 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(3000000);
		account.showBalance();
		
		//인스턴스 내부 클래스 객체 생성
		BankAccount.Transaction tran = account.new Transaction();
		tran.deposit(50000);
		account.showBalance();
		tran.withdraw(200000);
		account.showBalance();
		
		//정적 내부클래스 객체 생성 //질문 - 정적내부클래스는 static 제어자가 붙어있어서 BankAccount 클래스가 정의될때 같이 정의되므로 객체를 만들어주지 않아도 되는건가?
		BankAccount.BankInfo info = new BankAccount.BankInfo();
		info.showBankName();
		
		account.applyLoan(4000000);
		account.interestCalc();

	}

}
/*

	클래스 : BankAccount;
	BankAccount 내부클래스 -> 
		인스턴스 내부 클래스 : Transaction (거래)
		정적 내부클래스 : BankInfo(은행정보)
		지역 내부 클래스 : Loan (대출)
		익명 내부 클래스 : Runnable(이자계싼)



*/
