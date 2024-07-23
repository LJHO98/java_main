package java0712_2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		int[] 일등 = new int[] {8,12,23,29,35,41};
		
		ArrayList<Lotto> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("자동 몇장? : ");
		int howMany = scan.nextInt();
		
		for(int i=1; i<=howMany; i++) {
			int[] temp = new int[6];
			for(int k=0; k<temp.length;k++) {
				temp[k] = (int)(Math.random()*45)+1;
				for(int j=0; j<k; j++) {
					if(temp[k] == temp[j]) {
						k--; break;
					}
				}
			}
			list.add(new Lotto(temp));
		}
		list.forEach(lt -> System.out.println(lt));
		
// 내가 구매한 로또 번호들중에 3등과 4등은 몇개 인가?
//		int count = 0;
//		int third = 0;
//		int fourth =0;
//		
//		for(Lotto lt : list) {
//			count = 0;
//			for(int i=0; i<일등.length;i++) {
//				for(int j=0; j<일등.length;j++) {
//					if(lt.getNum()[i] == 일등[j]) count++;
//				}
//			}
//			if(count==5)
//				third++;
//			if(count==4)
//				fourth++;
//		}
//		
//		System.out.println("3등 : "+third+"개"+", " + "4등 : "+fourth+"개");
		int 삼등 = 0, 사등 = 0;
		for(Lotto lotto : list) {
			int[] temp = lotto.getNum();
			int cnt=0;
			for(int i : temp) {
				for(int k : 일등) {
					if(i==k) 
						cnt++;
				}
				
			}
			if(cnt==5) 삼등++;
			if(cnt==4) 사등++;
			if(cnt==6)System.out.println("1등");
		}
		System.out.println("3등 " + 삼등+"개");
		System.out.println("4등 " + 사등+"개");
	}

}
