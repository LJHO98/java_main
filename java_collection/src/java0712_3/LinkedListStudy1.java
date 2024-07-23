package java0712_3;

import java.util.LinkedList;

public class LinkedListStudy1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		
		list.add("제주도");
		list.add("독도");
		list.add("울릉도");
		list.add("백령도");
		list.add("마라도");
		
		list.indexOf("울릉도");
		System.out.println(list.get(3));
		list.forEach(도 -> System.out.println(도));
		
		

	}

}
