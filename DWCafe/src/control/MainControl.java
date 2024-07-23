package control;

import java.util.TreeMap;

import service.Kiosk;
import service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {
		//정렬과 검색이 필요하면 TreeMap, 색인검색만 필요하면 HashMap
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(20, "자두");
		tree.put(54, "사과");
		tree.put(9, "수박");
		tree.put(33, "참외");
		tree.put(5, "토마토");
		
		System.out.println(tree);
		
		System.out.println(tree.headMap(21));
		System.out.println(tree.tailMap(20));
		//같은 key나 입력한 key보다 작은 key중에 가장 가까운 key
		System.out.println(tree.floorKey(15));
		System.out.println(tree.floorKey(33));
		//key와 value 둘 다 출력
		System.out.println(tree.floorEntry(15));
		System.out.println(tree.subMap(10, 40));
		System.out.println(tree.lowerKey(25));
		System.out.println(tree.higherKey(40));
		
//		System.out.println("=== DW 카페 주문 키오스크 ===\n");
//		System.out.println("=== 화면을 터치하지 마세요 ===\n");
//		Kiosk kiosk = new SelectDrink(); // 패키지가 다르면 import 해주어야함.
//		
//		kiosk.action();
	}

}
