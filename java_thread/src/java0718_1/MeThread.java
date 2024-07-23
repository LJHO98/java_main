package java0718_1;

public class MeThread extends Thread{
	public static int num=10; // Ŭ���� ����
	private int time; //sleep�� ������ �ð�
	public MeThread(int time, String name) {
		super(name);
		this.time=time;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1; i<=5; i++) {
			System.out.println("������� : "+name+ " Ƚ�� : "+"����num : "+ num);
			num++;
			if(num==18) break;
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		while(true){
//			System.out.println("������� : "+name+ " Ƚ�� : "+"����num : "+ num);
//			num++;
//			if(num==15) break;
//			
//			
//			try {
//				Thread.sleep(time);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}

/*
	sleep(�и�������) - ������ �ð���ŭ ���
	start() - ������ ����, run �޼��� ȣ��
	join() - �ش� �����尡 ���������� ���� ������ ���
	run() - �����尡 �����ϴ� �Լ�
	stop() - �����带 �ߴ� (����� �������� ����)
	interrupt() - ������ �ߴ�
	setPriority(������) - �������� �켱����
	getPriority() - ������ ������ �켱������
	isAlive() - ���� �����尡 ����ִٸ� true, ����Ǿ��ٸ� false
	
	suspend() - �����带 �Ͻ� ���� ��Ų��. (����� �������� ����)
	resume() - �Ͻ������� �����带 ���� (����� �������� ����)
	
	yield() - �ٸ� �����忡�� ���� ���¸� �纸�ϰ� ���
	notify() - ��� ���¿� �ִ� �����带 ���� ���� ��ȯ
			   �����⿡ �ִ� ������� ���� ���·� ��ȯ�ȴ�.
	
 */

