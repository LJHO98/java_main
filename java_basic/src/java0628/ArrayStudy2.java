package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStudy2 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//과자 가격 입력받고 총합, 평균 출력
//		int[] 과자 = new int[5];
//		int sum = 0;
//		int avg = 0;
//		
//		for(int i=0; i<과자.length; i++) {
//			System.out.print((i+1) + "번째 과자 가격 입력 : ");
//			과자[i] = scan.nextInt();
//			sum += 과자[i];
//		}
//		avg = sum / 과자.length;
//		
//		System.out.println("과자 가격 총합 : " + sum + ", 평균 : " + avg);
		
		
		// 키 175미만을 출력하세요.
//		float[] tall = new float[] {173.4f, 175.1f,
//				169.5f, 181.4f, 178.8f, 185.3f};
//		for(int i=0; i<tall.length; i++) {
//			if(tall[i] < 175) {
//				System.out.println("키 175 미만 : " + tall[i]);
//			}
//		}
		
		String[] name = new String[] {
			"이순신","김유신","장보고","이성계","문익점","정도전",
			"최영","양만춘"
		};
		
		String[] 선발대 = new String[4];
		
		System.arraycopy(name, 3, 선발대, 0, 선발대.length);
		for(int i=0; i<선발대.length; i++) {
			System.out.println("선발대" + i + " : " + 선발대[i]);
		}
		
		System.out.println(Arrays.toString(선발대));
		
//		//객체에는 indexOf가 존재
//		String word = "i like banana";
//		
//		// 문자열에서 특정 문자나 문자열의 위치찾기
//		System.out.println(word.indexOf("like"));
//		
//		// 문자열에서 특정 문자나 문자열의 존재유무 - true,false
//		System.out.println(word.contains("ba"));
//		
//		String[] a = new String[] {"banana", "orange"};
		
//		String[] name = new String[] {
//			"김유신","한석봉","양만춘","김춘추","정도전",
//			"정약용","이순신","이사부","이사람","한가인"
//		};
//		
//		System.out.print("이름검색 : ");
//		String search = scan.nextLine();
//		for(int i=0; i<name.length; i++) {
//			//문자열이 저장되어있는 배열의 인덱스를 넣어야 contains나 indexOf를 사용할 수 있다.
//			if(name[i].contains(search)) {
//				System.out.println("검색 결과 : " + name[i]);
//				
//			}
//		}
		
//		String[] 카페 = new String[] {
//			"아메리카노 : 2000원","화이트 아메리카노 : 2800원","카페라떼 : 3000원",
//			"돌체라떼 : 3800원","카페모카 : 3800원","수박주스 : 4000원",
//			"써머아이스티 : 2900원","복숭아아이스티 : 2800원","자두아이스티 : 2800원",
//			"유자에이드 : 3500원","레몬에이드 : 3500원","청포도에이드 : 3500원"
//		};
//		System.out.print("메뉴 검색 : ");
//		
//		boolean isDrink = true;
////		int count = 0;
//		String search = scan.nextLine();
//		for(int i=0; i<카페.length; i++) {
//			if(카페[i].contains(search)) {
//				System.out.println("메뉴와 가격 - " + 카페[i]);
//				isDrink = false;
////				count++;
//			}else { isDrink = true;}
//		}
//		if(isDrink) {
//			System.out.print("죄송합니다. 준비중입니다.");
//		}
		
//		if(count == 0) {
//			System.out.print("죄송합니다. 준비중입니다.");
//		}
		
	}

}
