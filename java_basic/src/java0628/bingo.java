package java0628;

//import java.util.Arrays;
import java.util.Scanner;


public class bingo {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int [][] bingo = new int[5][5];
		int random = 0;
		boolean check;
		int endCount = 0;
		int end = 0;
		int row = 0;
		int col = 0;
		int diag1 = 0;
		int diag2 = 0;
		int tmp = 0;
		
		for(int i=0; i<bingo.length; i++) {
			for(int k=0; k<bingo[i].length; k++) {
				do {
					random = (int)(Math.random()*100)+1;
					check = false;
					
					for(int m=0; m<bingo.length; m++) {
						for(int n=0; n<bingo[m].length; n++) {
							if(bingo[m][n] == random) {
								check = true;
								break;
							}
						}
						if(check) {
							break;
						}
					}
				} while (check);
				
			bingo[i][k]=random;
			}
		}
		 
	
		while(true){
			end = 0;
			diag1 = 0;
			diag2 = 0;
			check = false;
			
			//빙고 출력
			for(int i=0; i<bingo.length; i++) {
				 for(int k=0; k<bingo.length; k++) {
					 System.out.print(bingo[i][k] + "\t");
				 }
				 System.out.println();
			 }
			System.out.print("숫자를 입력하세요 : ");
			tmp = scan.nextInt();
			if(tmp == -1) break;
			
			//검색하고 tmp가 있으면 0으로
			for(int m=0; m<bingo.length; m++) {
				for(int n=0; n<bingo[m].length; n++) {
					if(bingo[m][n] == tmp) {
						check = true;
						bingo[m][n]=0;
						break;
					}
				}
				if(check) {
					break;
				}
			}
			
			//0인 부분 찾기
			for( int i=0; i<5; i++){ 
				row=0;
			    col=0;
		        for( int k=0; k<5; k++){
		            if(bingo[i][k]==0) row++;
		            if(bingo[k][i]==0) col++;
		        }
	
		        if(bingo[i][i]==0) diag1++;
		        if(bingo[i][4-i]==0) diag2++;
		        if(row==5) end++;
		        if(col==5) end++;
		        if(diag1==5) end++;
		        if(diag2==5) end++;
		    
		    }
			endCount = end;
			System.out.println("빙고 : " + endCount);
			System.out.println();
			if(endCount==5 || endCount>5) break;
		}
	
	System.out.println("빙고끝!");
	
	}
}






