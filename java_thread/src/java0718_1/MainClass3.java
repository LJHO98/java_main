package java0718_1;

public class MainClass3 {

	public static void main(String[] args) {
		MeThread th1 = new MeThread(2000, "이천");
		MeThread th2 = new MeThread(3000, "삼천");
		
		// 순차적으로 쓰레드 실행
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
		
//		while(true) {
//			System.out.print("");
//			int num = MeThread.num;
//			if( num == 15) {
//				th1.stop();
//				th2.stop();
//				break;
//			}
//		}
	}

}
