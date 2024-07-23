package java0628;

import java.util.Scanner;

public class loop {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		
		//11의 배수 전까지 랜덤값 출력
//		for(; true ;) {
//			int random = (int)Math.floor(Math.random() * 50) + 1;
//			//int random = (int)(Math.random()*50) + 1; 자바는 타입변환이 가능해서 Math.floor을 이용하지 않아도 됨.
//			if(random % 11 == 0) { 
//				System.out.println(random + " - 랜덤값이 11의 배수입니다.");
//				break; 
//			}
//			System.out.println("랜덤값 : " + random);
//		}
		
//		int user = 0;
//		int random = (int)Math.floor(Math.random() * 81) + 20;
//		for(; true ; ) {
//			System.out.println("숫자를 입력해주세요.");
//			user = sc.nextInt();
//			if(user > random) {
//				System.out.println("DOWN!");
//			}else if(user == random) {
//				System.out.println("정답!");
//				break;
//			}else{
//				System.out.println("UP!");
//			}
//		}
		
		// 이름이 있는 반복문
	
//		int sum = 0;
//		
//		
//		 더하기: for(int i=1; i<=10; i++) {
//			for(int k=1; k<=4; k++) {
//				if (sum + k >= 40) break 더하기;
//				sum = sum + k;
//				System.out.println("     " + k);
//			}
//			System.out.println(i);
//			sum =  sum + i;
//			
//		}
//				
//		if(sum < 40) {
//			System.out.println(sum);
//		}
		
		//베스킨라빈스 게임
		int num = 1;
		게임: for(;;) {	//while(true)
			System.out.print("숫자 몇개 : ");
			int user = sc.nextInt();
			System.out.print("나 : ");
			for( int u = 1; u<=user; u++) {
				System.out.print(num + " ");
				if(num == 31) break 게임;
				num++;
			}
			System.out.println();
			
			int com = (int)(Math.random() * 3) + 1;
			System.out.print("com : ");
			for (int c = 1; c<=com; c++) {
				System.out.print(num + " ");
				if(num == 31) break 게임;
				num++;
			}
			System.out.println();
		}

	}

}
