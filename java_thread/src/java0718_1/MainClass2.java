package java0718_1;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) throws InterruptedException {
		Th1 th = new Th1(); //일반 클래스 객체 생성
		new Thread(th).start(); // 쓰레드 객체 생성
		
		for(int i=1; i<=5; i++) {
			System.out.println("엄" + i);
			Thread.sleep(2000);
		}

	}

}
class Th1 implements Runnable{

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println("입력 숫자 : " + num);
		
		
	}
	
}
