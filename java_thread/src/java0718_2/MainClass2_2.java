package java0718_2;

public class MainClass2_2 {

	public static void main(String[] args) throws InterruptedException {
//		DaemonTh dm = new DaemonTh();
//		dm.setDaemon(true);
//		dm.start();
//		Thread.sleep(6000);
//		System.out.println("main ����");
		
		
		NormalTh nm = new NormalTh("�̸�");
		nm.start();
		
		Thread.sleep(6000);
		System.out.println("main ����");
		
	}

}
