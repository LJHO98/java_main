package java0701;

import java.util.Arrays;

public class ArrayStudy4 {

	public static void main(String[] args) {
		
		//많은 양의 데이터를 다룰때는 배열을 사용한다.
		//상황에 따라서는 배열을 쓰면 안되는 경우도 있지만
		//보통은 배열의 구조에 데이터를 저장한다.
		//
		//동적 배열 만들기
		//기존의 배열 크기를 늘리거나 줄여서 사용하는 배열
		
//		int[] num = new int[] {10,20,30,40,50};
//		//데이터를 추가로 더 저장하려면 배열의 크기를 늘려줘야함.
//		int size = num.length; // 기존 배열의 크기
//		
//		int[] temp = new int[size+1];
//		for(int i=0; i<size; i++) {
//			temp[i] = num[i];
//			
//		}
//		num = temp;
//		num[5]=60;
//		System.out.println(Arrays.toString(num));
		
		// 문자열에서 같다 비교는 .equals() 로 한다.
		// 문자열에서 특정문자나 문자열 포함여부는 .contains()
		// 다음 주소중 선화동에 주소만 추출하여 배열에 저장하세요.
		// 배열에 잘 저장되었는지 확인 출력은 Arrays 이용하여 출력
//		String[] target = new String[1];
//		String tmp = "";
//		int size = 0;
//		String[] addr = new String[] {
//				"대전 중구 선화동 25", "대전 중구 선화동 92",
//				"대전 서구 둔산동 111", "대전 서구 둔산동 1023",
//				"대전 유성구 노은동 93", "대전 중구 대흥동 932",
//				"대전 동구 가양동 945", "대전 중구 선화동 1234",
//				"대전 중구 대흥동 23", "대전 중구 선화동 984"
//		};
//		
//		for(int i=0; i<addr.length; i++) {
//			size = target.length;
//			if(addr[i].contains("선화동")) {
//				tmp = addr[i];
//				for(int k=0; k<target.length;k++) {
//					if(target[k] == null) {
//						target[k]= tmp;
//						System.out.println(target[k]);
//						break;
//					}
//				}
//				String[] temp = new String[size+1];
//				for(int j=0; j<size; j++) {
//					temp[j] = target[j];
//					
//				}
//				target = temp;
//				
//			}
//			
//			
//		}
//		if(target[target.length - 1] == null) {
//			String[] temp = new String[target.length-1];
//			for(int j=0; j<size; j++) {
//				temp[j] = target[j];
//				
//			}
//			target = temp;
//		}
//		System.out.println(Arrays.toString(target));
		
		//수업
//		String[] 선화동 = new String[addr.length];
//		int index=0;
//		
//		for(int i=0; i<addr.length; i++) {
//			if( addr[i].contains("선화동")) {
//				선화동[index++] = addr[i];
//			}
//		}
		
		//2차원 배열
		//1차원 배열의 공간에 1차원 배열을 연결해놓은 구조
		
//		int[] a = new int[] {10,20,30,40,50,60,70,80,90,100};
//		
//		for(int data : a) { //forEach, each - 배열 전용 for문, 인덱스가 있어야만 사용가능
//			System.out.println(data);
//		}
		
		int[][] a = new int[][] {{1,2},{3,4,5}};
		
		for(int[] b : a) {
			for(int c : b) {
				System.out.print(c + "\t");
			}
			System.out.println();
		}
		
		
		
	}


}
