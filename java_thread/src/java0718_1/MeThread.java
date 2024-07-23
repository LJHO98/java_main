package java0718_1;

public class MeThread extends Thread{
	public static int num=10; // 클래스 변수
	private int time; //sleep에 적용할 시간
	public MeThread(int time, String name) {
		super(name);
		this.time=time;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=1; i<=5; i++) {
			System.out.println("쓰레드명 : "+name+ " 횟수 : "+"공유num : "+ num);
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
//			System.out.println("쓰레드명 : "+name+ " 횟수 : "+"공유num : "+ num);
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
	sleep(밀리세컨드) - 지정된 시간만큼 대기
	start() - 쓰레드 시작, run 메서드 호출
	join() - 해당 쓰레드가 끝날때까지 다음 쓰레드 대기
	run() - 쓰레드가 실행하는 함수
	stop() - 쓰레드를 중단 (사용을 권장하지 않음)
	interrupt() - 쓰레드 중단
	setPriority(정수값) - 쓰레드의 우선순위
	getPriority() - 설정된 쓰레드 우선순위값
	isAlive() - 현재 쓰레드가 살아있다면 true, 종료되었다면 false
	
	suspend() - 쓰레드를 일시 정지 시킨다. (사용을 권장하지 않음)
	resume() - 일시정지된 쓰레드를 실행 (사용을 권장하지 않음)
	
	yield() - 다른 쓰레드에게 실행 상태를 양보하고 대기
	notify() - 대기 상태에 있는 쓰레드를 실행 대기로 변환
			   실행대기에 있는 쓰레드는 실행 상태로 변환된다.
	
 */

