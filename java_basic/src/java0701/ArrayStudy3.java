package java0701;

import java.util.Scanner;

public class ArrayStudy3 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//20개의 랜덤숫자가 들어가있는 배열에 5의 배수 갯수 
//		int[] number = new int[20];
//		int count = 0;
//		for(int i=0; i<number.length; i++) {
//			 number[i] = (int)(Math.random()*30)+1;
//			 if(number[i] % 5 == 0) {
//				 count++;
//			 }
//			 System.out.print(number[i] + " ");
//		}
//		
//		System.out.println();
//		System.out.print("5의 배수 갯수 : " + count);
		
		//빙고
		
		//빙고 게임만들기
		//1. 25의 크기를 가지는 배열 선언
		//2. 배열에 랜덤 숫자 저장
		//3. 중복없이 저장
		//4. 25개 숫자를 화면에 출력
		//5. 게임 시작 - 숫자선택(입력)
		//6. 선택한 숫자 위치에 표시하기
		//7. 몇 줄 빙고인지 확인하기
		
		int[] bingo = new int[25];
		
		//중복 없이 랜덤값 저장
		//for문은 조건식이 만족하면 내용을 실행하고 증감식을 실행한다.
		//그걸 이용해서 내부 반복문을 통해 중복일 경우 i--를 해줘서
		//중복이였던 i를 다시 반복해 bingo[i]에 새로운 랜덤값 저장하고
		//중복이 아닐때까지 계속 반복
		for(int i=0; i<bingo.length; i++) {
			bingo[i] = (int)(Math.random() *50)+1;
			for(int k=0; k<i; k++) {
				if( bingo[k] == bingo[i]) {
					i--;
					break;
				}
			}
		}
		
		int input = 0;
		int row = 0;
		int col = 0;
		int end = 0;
		int diag1 = 0;
		int diag2 = 0;
		
		//입력
		while(true) {
			end = 0;
			diag1 = 0;
			diag2 = 0;
			
			//5줄 5칸 출력
			for(int i=0; i<bingo.length; i++) {
				if(i%5==0 && i !=0 )
					System.out.println();
				if(bingo[i]==0)
					System.out.printf(" %2c ", '■');
				else
					System.out.printf(" %2d ", bingo[i]);
			}
			//빙고 숫자 선택
			System.out.print("\n빙고숫자 입력 : ");
			input = scan.nextInt();
			
			//선택한 숫자 표시하기
			for(int i=0; i<bingo.length; i++) {
				if(bingo[i] == input) {
					bingo[i]=0; break;
				}
			}
			
			//빙고 몇줄인지 확인 5줄이면 빙고 종료
			for( int i=0; i<5; i++){ 
		        for( int k=0; k<5; k++){
		            if(bingo[i*5 + k]==0) row++;
		            if(bingo[k*5 + i]==0) col++;
		        }
	
		        if(bingo[i*6]==0) diag1++;
		        if(bingo[(i+1)*4]==0) diag2++;
		        
		        if(row==5) end++;
		        if(col==5) end++;
		        if(diag1==5) end++;
		        if(diag2==5) end++;
		        
		        row=0;
			    col=0;
		    }
			
			if(end == 5 || end > 5) {
				System.out.print("빙고끝!");
				break;
			}
				
			System.out.println();
		}

	}

}
