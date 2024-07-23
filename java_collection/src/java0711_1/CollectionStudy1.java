package java0711_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionStudy1 {

	public static void main(String[] args) {
		
		//ArrayList의 데이터타입을 넣어줄 때
		//기본 데이터타입이 아닌 클래스 타입을 넣어줘야함
		//Byte - byte
		//Short - short
		//Integer - int
		//Long - long
		//Float - float
		//Double - double
		//Character - char
		//Boolean - boolean
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(89);
		list1.add(230);
		list1.add(4542);
		list1.add(3434);
		list1.add(2);
		
		System.out.println(list1);
		
		//인덱스
		System.out.println(list1.get(0));
		
		//배열의 크기
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		//indexOf 사용가능
		System.out.println(list1.indexOf(230));
		//맨 마지막에서부터 찾기
		System.out.println(list1.lastIndexOf(230));
		System.out.println(list1.contains(3434));
		
		//데이터 제거
		list1.remove(3);
		System.out.println(list1);
		
		//Integer 타입 데이터 제거
		list1.remove(Integer.valueOf(89));
		System.out.println(list1);
		
		//배열의 크기가 0이면 true 아니면 false
		System.out.println(list1.isEmpty());
		
		//인덱스 위치 지정해서 데이터 추가
		list1.add(1,450);
		System.out.println(list1);
		
		list1.forEach(n -> System.out.println(n));
		//forEach에 아래와 같은 for문이 들어가있다.
		for(Integer n : list1) {
			System.out.println(n);
		}
		
		//데이터 변경
		list1.set(3, 15);
		System.out.println(list1);
		
		//동적배열에서 정적배열로 변경
		Integer[] number = list1.toArray(new Integer[list1.size()]);
		
		Integer[] aa = new Integer[3];
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		//정적배열에서 동적배열로 변경
		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(aa));
		
		//정렬
		Collections.sort(list1);
		System.out.println(list1);
		
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("김춘추");
		names.add("장영실");
		System.out.println(names);
		
		ArrayList<String> names2 = new ArrayList<>(Arrays.asList(new String[] {"김춘추", "장영실", "이성계", "정몽주", "정도전", "김정호"}));
		
		for(String name : names2) System.out.println(name);
		
		if(names2.indexOf("이순신") == -1) {
			names2.add("이순신");
			System.out.println(names2);
		}
		
	}

}

/*
	자바 컬렉션 프레임워크
	
	데이터를 저장, 관리하기 위한 자료구조 와 데이터를 가공처리하는 알고리즘이 구현 되어있는 클래스들의 집합체
	
	Collection, Map 인터페이스
	
	Collection 인터페이스
		- List 인터페이스
			ArrayList 클래스
			vector
			LinkedList
			Stack
			Queue
		- Set 인터페이스
			HashSet
			TreeSet
			LinkedHashSet
	
	Map 인터페이스
		- HashMap
		- TreeMap
		- LinkedHashMap
		


*/
