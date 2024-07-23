package java0718_1;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		MyThread th = new MyThread(); //쓰레드 객체 생성
		th.start(); // 쓰레드 실행	
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 : ");
//		int num = sc.nextInt();
//		System.out.println(num);
		
		for(int i=1; i<=10; i++) {
			System.out.println(" 나는 main "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("나 쓰레드야!" + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
		}
	}
}
/*
	프로세스 - cpu에 의해 메모리(ram)에 로드 되어있는 프로그램을 말한다.
			즉, 실행중인 프로그램들이 프로세스이다.
			실행중인 프로세스 확인 방법
			1. 작업관리자 프로세스
			2. 명령프롬프트창
				tasklist - 프로세스 리스트
				taskkill /pid[pid값] - 강제종료 
				
	쓰레드 - 프로세스안에서 실제 동작을 수행하는 단위
		   쓰레드를 추가 하면 동시에 여러 개의 동작을 수행 할 수 있다.
		   
	자바 쓰레드
	쓰레드 생성자
	Thread() : 새로운 쓰레드 객체 할당
	Thread("이름") : 새로운 쓰레드 객첼를 할당하면서 이름부여
	
*/
