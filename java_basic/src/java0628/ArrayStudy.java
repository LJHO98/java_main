package java0628;

import java.util.Arrays;

public class ArrayStudy {

	public static void main(String[] args) {
		// 배열 - 같은 데이터타입 데이터가 저장되는 공간이 연속적으로 되어있는 구조
//		int[] a = {10,20,30};
//		System.out.println(a[0] + " " + a[1]);
//		
//		int b[] = {30,40,50};
//		
//		System.out.println( Arrays.toString(a) );
//		
//		int[] arr = new int[10];
//		// 배열의 공간 10개 생성
//		int[] brr = new int[] {10,20,30,40};
//		
//		// int[] arr2 = new int[]; 공간의 크기를 지정해줘야한다. 이렇게 하면 안됨.
//		
//		int size = 15;
//		int[] arr2 = new int[size];
		
		// 배열 생성 방법
		// 데이터타입[] 배열이름 = new 데이터타입[배열크기];
		
//		int[] money = new int[5]; // 5개의 int 타입 공간을 가진 배열
//		money[0] = 5000;
//		money[1] = 12000;
//		money[2] = 4000;
//		money[3] = 43000;
//		money[4] = 50000;
//		
//		for(int i=0; i<money.length; i++) {
//			if(money[i] >= 10000)
//				System.out.println(money[i]);
//		}
		
		int[] A반 = new int[3];
		A반[0] = 89; A반[1] = 78; A반[2] = 93;
		
		int[] B반 = new int[3];
		B반[0] = 56; B반[1] = 84;
		B반[2] = 72;
		
		System.out.println("A반 성적 : " + Arrays.toString(A반));
		System.out.println("B반 성적 : " + Arrays.toString(B반));
		
		// 80점 이상만 출력
		for(int i=0; i<A반.length;i++) {
			if(A반[i] >= 80) {
				System.out.println("A반 : " + A반[i]);
			}
			if(B반[i] >= 80) {
				System.out.println("B반 : " + B반[i]);
			}
		}
		
		
		int [] 일학년 = new int[A반.length + B반.length];
		
		// 복사할 배열, 복사시작인덱스, 저장할배열, 저장위치인덱스, 몇개?
		System.arraycopy(A반, 0, 일학년, 0, A반.length);
		System.arraycopy(B반, 0, 일학년, 3, B반.length);
		
		for(int i=0; i<일학년.length; i++) {
			if( 일학년[i] >= 80)
				System.out.println(일학년[i]);
		}
		
		Arrays.sort( 일학년 );
		System.out.println(Arrays.toString(일학년));
		
		boolean same = Arrays.equals(A반, B반);
		System.out.println("A반 B반 배열이 같은가? " + same);	
//		
//		for(int i=0; i<A반.length; i++) {
//			일학년[i] = A반[i];
//			일학년[i+3] = B반[i];
//		}
//		System.out.println(Arrays.toString(일학년));
		
//		for(int i=0; i<일학년.length; i++) {
//			if(i < 3) {
//				일학년[i] = A반[i]	;		
//			}
//			else {
//				일학년[i] = B반[i%3];
//			}
//		}
//		System.out.println(Arrays.toString(일학년));
		
	}
}