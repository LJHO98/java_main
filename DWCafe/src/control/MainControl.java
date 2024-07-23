package control;

import java.util.TreeMap;

import service.Kiosk;
import service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {
		//���İ� �˻��� �ʿ��ϸ� TreeMap, ���ΰ˻��� �ʿ��ϸ� HashMap
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(20, "�ڵ�");
		tree.put(54, "���");
		tree.put(9, "����");
		tree.put(33, "����");
		tree.put(5, "�丶��");
		
		System.out.println(tree);
		
		System.out.println(tree.headMap(21));
		System.out.println(tree.tailMap(20));
		//���� key�� �Է��� key���� ���� key�߿� ���� ����� key
		System.out.println(tree.floorKey(15));
		System.out.println(tree.floorKey(33));
		//key�� value �� �� ���
		System.out.println(tree.floorEntry(15));
		System.out.println(tree.subMap(10, 40));
		System.out.println(tree.lowerKey(25));
		System.out.println(tree.higherKey(40));
		
//		System.out.println("=== DW ī�� �ֹ� Ű����ũ ===\n");
//		System.out.println("=== ȭ���� ��ġ���� ������ ===\n");
//		Kiosk kiosk = new SelectDrink(); // ��Ű���� �ٸ��� import ���־����.
//		
//		kiosk.action();
	}

}
