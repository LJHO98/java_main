package java0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetStudy1 {

	public static void main(String[] args) {
//		HashSet<String> ���� = new HashSet<>();
//		HashSet<String> ��� = new HashSet<>();
//		
//		����.add("¥���"); ����.add("������");
//		����.add("������"); ����.add("�ޱ��̺���");
//		
//		���.add("��ġ������"); ���.add("������");
//		���.add("¥���"); ���.add("������");
//		
//		// ������ - �� �� �̻��� �׷쿡 �������� ���� ����
//		HashSet<String> ���� = new HashSet<>();
//		
//		//�÷��������ӿ�ũ���� �÷��ǿ� ����Ǿ��ִ� ��ҵ��� ������ ����ϴ� �������̽�
//		//���� �����͸� �����ؼ� ���
//		//��ȸ����. �ٽ� ������ �ؿ� �ڵ带 �� ����ؾߵ�.
//		Iterator<String> it = ����.iterator();
//		
//		while(it.hasNext()) {
//			String ����food = it.next();
//			if(���.contains(����food)) {
//				����.add(����food);
//			}
//		}
//		
//		System.out.println(����);
//		
//		//������ - A���տ��� B���հ��� �����յ����͸� ������ ������������
//		
//		it = ����.iterator();
//		HashSet<String> ������ = new HashSet<>();
//		
//		while(it.hasNext()) {
//			String ����food = it.next();
//			if(!���.contains(����food)) {
//				������.add(����food);
//			}
//		}
//		System.out.println(������);
//		
//		//������ - A���հ� B������ �� (�ߺ�����)
//		HashSet<String> ������ = new HashSet<>();
//		������ = (HashSet<String>)����.clone(); //clone�� ��ȯ Ÿ���� HashSet�� �ƴ϶� ����ȯ ������.
//		������.addAll(���);
//		System.out.println(������);
		
		//������ - addAll
		//������ - retainAll ����.retainAll(���)
		//������ - removeAll ����.removeAll(���)
		
		HashSet<Integer> num1 = new HashSet<>();
		HashSet<Integer> num2 = new HashSet<>();
		HashSet<Integer> num3 = new HashSet<>();
		HashSet<Integer> num4 = new HashSet<>(); //1,3 ������
		HashSet<Integer> num5 = new HashSet<>(); //1,2 ������
		HashSet<Integer> num6 = new HashSet<>(); //2,3 ������
		HashSet<Integer> ������  = new HashSet<>();
		
		
		
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
		System.out.println("num1,num3�� ������ : " + num4);
	
		num5 = (HashSet<Integer>)num1.clone();
        num5.removeAll(num2);
        System.out.println("num1,num2�� ������ : " + num5);
		
		num6 = (HashSet<Integer>)num2.clone();
		num6.retainAll(num3);
		System.out.println("num2,num3�� ������ : " + num6);
		
		������.addAll(num1);
		������.addAll(num2);
		������.addAll(num3);
		
		System.out.println("������ : " + ������);
		
		
		
		
		
		
		
		
		
		
		
//		HashSet<String> hash = new HashSet<>();
//		
//		hash.add("¥���");
//		hash.add("«��");
//		hash.add("���뱹��");
//		hash.add("�������");
//		hash.add("��������");
//		hash.add("¥���"); //�̹� �ִ� �����͸� �߰��ϸ� ������ �ִ� �����Ϳ� ������Ѵ�.
//		
//		System.out.println(hash);
//		
//		hash.remove("«��");
//		System.out.println(hash);
//		
//		//�����͸� �׷����� ��� ����ϴ� hash������ ��κ� �̷������� �����͸� �ϳ��� ���� ������� �ʴ´�.
//		for(String food : hash) {
//			System.out.println(food);
//		}
//		
//		//���������� �����͸� �̿��ϰ� �ʹٸ� ArrayList(�迭)�� ��ȯ���Ѽ� ����ϸ��.
//		//�����迭, LinkedList�� ����.
//		ArrayList<String> list = new ArrayList<>(hash); //�ݴ�� ArrayList�� HashSet���� �ٲ��� ���� ����.
//		System.out.println(list);
//		System.out.println(list.get(3));
		
	}

}

/*
	Set �������̽�
	 - HashSet, TreeSet
	 - ������� ������� �ʴ´�.
	 - *�ߺ� ������� �ʴ´�.(�ߺ�����)
	 - �ε����� ����.
	 - *Set�� ����(�������� �׷�)�� �ٷ궧 ���ȴ�.
	 - HashSet -> ������ ǥ��
	 - TreeSet -> �˻��� Ưȭ
	 

*/