package java0718_3;

public class Money {
	private int myMoney = 10000;
	public int getMymoney() {
		return myMoney;
	}
	// withdraw �޼��带 �Ӱ迵������ ����
	// �ϳ��� �����尡 �� �޼��带 ����ϸ� ���鼭 �ٸ� ��������� ���
	public synchronized boolean widthdraw(int money) {
		if(myMoney >= money) {
		//���� ���� �ݾ׺��� ��ݱݾ��� �۰ų� ���ٸ� ���
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			//���
			myMoney -= money;
			return true;
		}
		return false;
		
	}
}
