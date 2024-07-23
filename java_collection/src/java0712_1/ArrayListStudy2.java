package java0712_1;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		ArrayList<Asset> list = new ArrayList<>();
		
		list.add(new Asset("�츮����", 3450000, "1004-910123455","�̼���"));
		list.add(new Asset("����", 513350, "34-123-349393","������"));
		list.add(new Asset("��������", 891003, "394-3412-2323","���س�"));
		list.add(new Asset("��������", 899900, "39-2384-19939","�ֹ���"));
		list.add(new Asset("�츮����", 28300, "1002-93-87888","������"));
		list.add(new Asset("��������", 98000, "293-0123-1234","������"));
		list.add(new Asset("�츮����", 1920000, "1006-23-123456","��ù�"));
		list.add(new Asset("��������", 932000, "23-2555-29991","������"));
		
		System.out.println("======�츮 ���� �̿���======");
		
		for(Asset a : list) {
			if(a.getBank().equals("�츮����"))
				System.out.println(a);
		}
		
		System.out.println("======�ܾ��� 100���� �̻��� �����======");
		
//		for(Asset a : list) {
//			if(a.getBalance()>=1000000) {
//				System.out.println(a);
//			}
//		}
		
		list.forEach( �鸸 -> {
			if(�鸸.getBalance()>=1000000) {
				System.out.println(�鸸);
			}
		}
		);
		
		System.out.println("====�ֹ����� �츮���� ���°� ������ ����======");
	
		Asset asset = new Asset("�츮����",0,"1007-23-128954","�ֹ���");
		if(!list.contains(asset)) {
			list.add(asset);
		}
		list.forEach(info -> System.out.println(info));
				
	}

}
