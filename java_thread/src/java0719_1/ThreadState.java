package java0719_1;

import java.lang.Thread.State;

public class ThreadState {
	private static Thread thread;
	private static Thread stateThread;
	
	public static void main(String[] args) {
		stateThread = new Thread(() -> { // 익명 클래스 객체 생성
			while(true) {
				State state = thread.getState(); //쓰레드 객체의 상태
				System.out.println(thread.getName() +" - 쓰레드...상태 : "+state);
				if(state == State.NEW) {
					System.out.println("쓰레드 실행 준비 단계");
					thread.start();
				}
				if(state == State.WAITING) {
					System.out.println("쓰레드 대기 단계");
					thread.interrupt(); //대기상태인 쓰레드면 다시 동작시킨다.
				}
				if(state == State.TERMINATED) {
					System.out.println(thread.getName()+" - 쓰레드... 상태 : "+state);
					break; // terminated 상태라면 쓰레드가 종료된 상태
				}
				
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		thread = new My(" 쓰레드1번 ", stateThread );
		stateThread.start();

	}

}
