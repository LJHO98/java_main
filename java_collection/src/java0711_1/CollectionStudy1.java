package java0711_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionStudy1 {

	public static void main(String[] args) {
		
		//ArrayList�� ������Ÿ���� �־��� ��
		//�⺻ ������Ÿ���� �ƴ� Ŭ���� Ÿ���� �־������
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
		
		//�ε���
		System.out.println(list1.get(0));
		
		//�迭�� ũ��
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		//indexOf ��밡��
		System.out.println(list1.indexOf(230));
		//�� �������������� ã��
		System.out.println(list1.lastIndexOf(230));
		System.out.println(list1.contains(3434));
		
		//������ ����
		list1.remove(3);
		System.out.println(list1);
		
		//Integer Ÿ�� ������ ����
		list1.remove(Integer.valueOf(89));
		System.out.println(list1);
		
		//�迭�� ũ�Ⱑ 0�̸� true �ƴϸ� false
		System.out.println(list1.isEmpty());
		
		//�ε��� ��ġ �����ؼ� ������ �߰�
		list1.add(1,450);
		System.out.println(list1);
		
		list1.forEach(n -> System.out.println(n));
		//forEach�� �Ʒ��� ���� for���� ���ִ�.
		for(Integer n : list1) {
			System.out.println(n);
		}
		
		//������ ����
		list1.set(3, 15);
		System.out.println(list1);
		
		//�����迭���� �����迭�� ����
		Integer[] number = list1.toArray(new Integer[list1.size()]);
		
		Integer[] aa = new Integer[3];
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
		//�����迭���� �����迭�� ����
		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(aa));
		
		//����
		Collections.sort(list1);
		System.out.println(list1);
		
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("������");
		names.add("�念��");
		System.out.println(names);
		
		ArrayList<String> names2 = new ArrayList<>(Arrays.asList(new String[] {"������", "�念��", "�̼���", "������", "������", "����ȣ"}));
		
		for(String name : names2) System.out.println(name);
		
		if(names2.indexOf("�̼���") == -1) {
			names2.add("�̼���");
			System.out.println(names2);
		}
		
	}

}

/*
	�ڹ� �÷��� �����ӿ�ũ
	
	�����͸� ����, �����ϱ� ���� �ڷᱸ�� �� �����͸� ����ó���ϴ� �˰����� ���� �Ǿ��ִ� Ŭ�������� ����ü
	
	Collection, Map �������̽�
	
	Collection �������̽�
		- List �������̽�
			ArrayList Ŭ����
			vector
			LinkedList
			Stack
			Queue
		- Set �������̽�
			HashSet
			TreeSet
			LinkedHashSet
	
	Map �������̽�
		- HashMap
		- TreeMap
		- LinkedHashMap
		


*/
