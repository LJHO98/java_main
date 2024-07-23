package java0712_3;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList2 list = new LinkedList2();
		
		list.add(20);
		list.add(50);
		list.add(100);
		list.add(5);
		System.out.println(list);
		System.out.println(list.get(3));
		list.remove(3);
		System.out.println(list);
	}

}
