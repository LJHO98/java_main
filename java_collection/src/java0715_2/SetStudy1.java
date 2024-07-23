package java0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
//		HashSet<String> 재학 = new HashSet<>();
//		HashSet<String> 상민 = new HashSet<>();
//		
//		재학.add("짜장면"); 재학.add("볶음밥");
//		재학.add("돈가스"); 재학.add("쭈구미볶음");
//		
//		상민.add("김치볶음밥"); 상민.add("떡볶이");
//		상민.add("짜장면"); 상민.add("돈가스");
//		
//		// 교집합 - 두 개 이상의 그룹에 공통적인 값의 집합
//		HashSet<String> 공통 = new HashSet<>();
//		
//		//컬렉션프레임워크에서 컬렉션에 저장되어있는 요소들을 읽을때 사용하는 인터페이스
//		//원본 데이터를 복사해서 사용
//		//일회용임. 다시 쓰려면 밑에 코드를 또 사용해야됨.
//		Iterator<String> it = 재학.iterator();
//		
//		while(it.hasNext()) {
//			String 재학food = it.next();
//			if(상민.contains(재학food)) {
//				공통.add(재학food);
//			}
//		}
//		
//		System.out.println(공통);
//		
//		//차집합 - A집합에서 B집합과의 교집합데이터를 제외한 데이터의집합
//		
//		it = 재학.iterator();
//		HashSet<String> 차집합 = new HashSet<>();
//		
//		while(it.hasNext()) {
//			String 재학food = it.next();
//			if(!상민.contains(재학food)) {
//				차집합.add(재학food);
//			}
//		}
//		System.out.println(차집합);
//		
//		//합집합 - A집합과 B집합의 합 (중복없이)
//		HashSet<String> 합집합 = new HashSet<>();
//		합집합 = (HashSet<String>)재학.clone(); //clone에 반환 타입이 HashSet이 아니라서 형변환 시켜줌.
//		합집합.addAll(상민);
//		System.out.println(합집합);
		
		//합집합 - addAll
		//교집합 - retainAll 재학.retainAll(상민)
		//차집합 - removeAll 재학.removeAll(상민)
		
		HashSet<Integer> num1 = new HashSet<>();
		HashSet<Integer> num2 = new HashSet<>();
		HashSet<Integer> num3 = new HashSet<>();
		HashSet<Integer> num4 = new HashSet<>(); //1,3 교집합
		HashSet<Integer> num5 = new HashSet<>(); //1,2 차집합
		HashSet<Integer> num6 = new HashSet<>(); //2,3 교집합
		HashSet<Integer> 합집합  = new HashSet<>();
		
		
		
		while(num1.size()<14) {
			num1.add(Integer.valueOf((int)(Math.random()*50)+1));
		}
		
		while(num2.size()<14) {
			num2.add(Integer.valueOf((int)(Math.random()*50)+1));
		}
		
		while(num3.size()<14) {
			num3.add(Integer.valueOf((int)(Math.random()*50)+1));
		}
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println();
		
		num4 = (HashSet<Integer>)num1.clone();
		num4.retainAll(num3);
		System.out.println("num1,num3의 교집합 : " + num4);
	
		num5 = (HashSet<Integer>)num1.clone();
        num5.removeAll(num2);
        System.out.println("num1,num2의 차집합 : " + num5);
		
		num6 = (HashSet<Integer>)num2.clone();
		num6.retainAll(num3);
		System.out.println("num2,num3의 교집합 : " + num6);
		
		합집합.addAll(num1);
		합집합.addAll(num2);
		합집합.addAll(num3);
		
		System.out.println("합집합 : " + 합집합);
		
		
		
		
		
		
		
		
		
		
		
//		HashSet<String> hash = new HashSet<>();
//		
//		hash.add("짜장면");
//		hash.add("짬뽕");
//		hash.add("순대국밥");
//		hash.add("들깨국수");
//		hash.add("맑은곰탕");
//		hash.add("짜장면"); //이미 있는 데이터를 추가하면 기존에 있던 데이터에 덮어쓰기한다.
//		
//		System.out.println(hash);
//		
//		hash.remove("짬뽕");
//		System.out.println(hash);
//		
//		//데이터를 그룹으로 묶어서 사용하는 hash에서는 대부분 이런식으로 데이터를 하나씩 빼서 사용하지 않는다.
//		for(String food : hash) {
//			System.out.println(food);
//		}
//		
//		//순차적으로 데이터를 이용하고 싶다면 ArrayList(배열)로 변환시켜서 사용하면됨.
//		//정적배열, LinkedList도 가능.
//		ArrayList<String> list = new ArrayList<>(hash); //반대로 ArrayList를 HashSet으로 바꿔줄 수도 있음.
//		System.out.println(list);
//		System.out.println(list.get(3));
		
	}

}

/*
	Set 인터페이스
	 - HashSet, TreeSet
	 - 순차대로 저장되지 않는다.
	 - *중복 허용하지 않는다.(중복제거)
	 - 인덱스가 없다.
	 - *Set은 집합(데이터의 그룹)을 다룰때 사용된다.
	 - HashSet -> 집합을 표현
	 - TreeSet -> 검색에 특화
	 

*/