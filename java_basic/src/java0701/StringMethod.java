package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		//자바에서 문자열을 사용하려면 String 클래스를 사용해야 한다.
		// String 클래스는 내부적으로 char 기본데이터타입의 배열이 생성되도록 되어있다.
		// char 타입으로 생성된 배열은 동적 배열의 동작을 한다.
		// 프로그램에서 사용되는 데이터중 70%정도는 문자열 데이터이다.
		// ★문자열 관련 메서드는 필히 꼭 반드시 익혀야한다.
		
		// 문자열 데이터를 저장하는 방법
		//word는 데이터변수가 아닌 참조 변수이다. 배열을 선언할때 썼던 변수처럼 주소를 가지고 있다.
		String word = "i like banana";
		
		//문자열 비교 - 같은문자열인가?
		//equals
		System.out.println("equals : " +(word.equals("i like banana")));
		
		//문자열 포함여부
		//contains
		System.out.println("contains : " +(word.contains("d")));
		//indexOf
		System.out.println("indexOf : " +word.indexOf("orange"));
		
		//문자열 합치기
		System.out.println(word + " 합치기");
		System.out.println(word.concat(" 합치기"));
		
		//특정 문자 또는 문자열 위치 찾기
		System.out.println(word.indexOf('b'));
		System.out.println(word.lastIndexOf('a'));
		
		//문자열에서 특정 문자 추출
		System.out.println(word.charAt(0));
		
		Scanner sc = new Scanner(System.in);
		
		//키보드로 문자입력 받기
//		System.out.print("알파벳 하나 입력 : ");
//		char alp = sc.nextLine().charAt(0);
//		System.out.println(alp);
		
		//문자코드중에서 기본 문자코드는 아스키코드이다.
		//아스키코드표는 총 128개 문자
		//아스키코드에서 65는 대문자 A, 97은 소문자 a
		char ch = 'A';
		System.out.println(ch+4);
		
		//문자열의 길이
		System.out.println("문자열 클자수 : "+word.length());
		
		//대문자 소문자 변환
		String 대문자 = word.toUpperCase();
		String 소문자 = word.toLowerCase();
		
		System.out.println(대문자);
		System.out.println(소문자);
		
		//공백 제거 앞뒤만 가운데는 불가능
		String word2 = " i hate java ";
		System.out.println(word2);
		System.out.println(word2.trim());
		
		// 위 메서드 중 가장 많이 사용되는것들
		// equals, contains
		
		//문자열 분할 - 특정 문자를 기준으로 문자열을 분할해서 배열에 저장
		System.out.println(Arrays.toString(word.split(" ")));
		String name = "이순신@김유신@강감찬@";
		
		String[] names = name.split("@");
		System.out.println(Arrays.toString(names));
		
		//문자열 자르기(추출) - 입력된 인덱스를 기준으로 추출
		System.out.println(word.substring(2));
		System.out.println(word.substring(7));
		System.out.println(word.substring(2,6));
		
		//문자열 변환
		String 뽀뽀뽀 = "아빠가 출근할 때 뽀뽀뽀 엄마가 안아줘도"
				+ "뽀뽀뽀 만나면 반갑다고 뽀뽀뽀";
		String 변경 = 뽀뽀뽀.replace("뽀뽀뽀", "뿡뿡뿡");
		System.out.println(변경);
		
		변경  = 변경.replaceAll("뿡뿡뿡","뿌우웅");
		System.out.println( 변경);
		
		//JAVA에서는 replaceAll에서만 정규표현식 사용가능
		/*
		 	정규표현식
		 	^ - 문자열의 시작
		 	$ - 문자열의 종료
		 	. - 임의의 한 문자
		 	* - 앞 문자가 있거나 없거나 ( *가 -> 가로 끝나는 단어)
		 	+ - 앞 문자가 하나 이상
		 	? - 앞 문자가 없거나 하나있음
		 	[] - 문자의 집합이나 범위를 나타냄
		 	{} - 횟수 또는 범위
		 	() - 소괄호의 문자를 하나의 문자로 인식
		 	| - 패턴 안에서 or 연산 수행
		 	\s - 공백문자
		 	\S - 공백문자가 아닌 나머지 문자
		 	\w - 알파벳이나 숫자
		 	\W - 알파벳이나 숫자를 제외한 문자
		 	\d - 숫자
		 	\D - 숫자를 제외한 모든 문자
		 	
		 	문자열에서 숫자만 제거 - replaceAll("[0-9]","")
		 	연락처 - ^010-\d{4}-\d{4}$
		 	한글만 작성 확인 - ^[가-힕]
		 */
		String a = "abc73jd82kd74j";
		System.out.println(a.replaceAll("[0-9]", ""));
		System.out.println(a.replaceAll("[\\d]", ""));
		System.out.println(a.replaceAll("\\D", ""));
	}

}
