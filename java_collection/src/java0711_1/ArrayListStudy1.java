package java0711_1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("이순신",34,"19900405"));
		list.add(new Member("김춘추", 25, "19991208"));
		list.add(new Member("장보고", 28, "19960812"));
		list.add(new Member("한석봉", 31, "19930120"));
		list.add(new Member("김광식", 39, "19851010"));
		
		System.out.println(list);
		
		for(Member m : list) {
			if(m.getAge()>30)
			System.out.println(m);
		}
		
		System.out.println("=======1995년 이후에 태어난 사람들=========");
		
		for(Member m : list) {
			String temp = m.getBirth().substring(0,4);
			int year = Integer.parseInt(temp);
			if(year > 1995) {
				System.out.println(m);
			}
		}
		
		// 8월, 9월, 10월, 11월에 태어난 사람만 출력
		System.out.println("===8월, 9월, 10월, 11월에 태어난 사람만 출력===");
		
		for(Member m : list) {
			String temp = m.getBirth().substring(4,6);
			int month = Integer.parseInt(temp);
			if(month>=8 && month<=11)
				System.out.println(m);
		}
		
		list.add(2, new Member("장영실", 34 ,""));
		System.out.println(list);
		
		for(Member m : list) {
			if(m.getBirth().isBlank()) {
				int year = 2024 - m.getAge();
				m.setBirth(year+"0000");
			}
		}
		System.out.println(list);
		
		//개발자가 정의한 클래스를 컬렉션에 사용하는 경우
		//컬렉션의 메서드들을 온전히 사용하려면 필요한 메서드를
		//클래스에 구현해야 한다.
		//필요한 메서드는 최상위 부모 클래스인 Object가 가지고 있다.
		//추가로 컬렉션에 관련된 인터페이스를 implements 하기도 해야한다.
		
		Member t = new Member("장보고", 28, "19960812");
//		
//		System.out.println(list.indexOf(t)); // Member클래스객체를 indexOf에 넣어 찾기
//		System.out.println(list.contains(t));
//		
		list.remove(t); // 많은 메소드들이 equals 메소드로 작동됨.
//		System.out.println(list);
//		
//		Member[] mem = list.toArray(new Member[list.size()]);//정적배열 -> 동적배열
//		
//		for(Member mm : mem) {
//			System.out.println(mm);
//		}
		System.out.println("=====정렬=====");
		// 정렬
		Collections.sort(list);
		
		list.forEach( m-> System.out.println(m));
		
		
	}

}
