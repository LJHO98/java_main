package java0718_2;

public class DaemonTh extends Thread{
	public DaemonTh() {
		
	}
	
	@Override
	public void run() {
		System.out.println("���� ������ ����");
		
		while(true) {
			System.out.println("�ڵ�����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
/*
	���� ������
	�� �����带 �����ϴ� ������
	�� �����尡 ����Ǹ� ���� �����嵵 ����ȴ�.
	
	�� ������� ���� ��� �ؾ� ������
	���� ������� �� �������� ������ �ޱ� ������
	������ ��� ���� �ʾƵ� �ȴ�.


*/
