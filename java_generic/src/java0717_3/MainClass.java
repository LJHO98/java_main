package java0717_3;

import java.util.ArrayList;
import java.util.Date;


@FunctionalInterface
interface moveable{
	public void move();
}

class A<T>{
	T item;
	
	@SafeVarargs
	final void get(T...��ad) {
		
	}
}

public class MainClass {
	
	@Deprecated
	static void aaa() {
		
	}

	public static void main(String[] args) {
		aaa();
		
		Date today = new Date();
		
		@SuppressWarnings("all")
		ArrayList list = new ArrayList<>();
		
		
		
		today.getYear();

	}

}

/*
	�����ڸ� ���� �޸� - �ּ�
	annotation - �ּ����� �ǹ̸� ������.
	Ư�� �ڵ���� ��ǻ�Ϳ��� ��������
	ǥ�� annotation , ��Ÿ annotation
	
	ǥ�� annotation
	@Override
	�����Ϸ����� �޼��带 �������̵� �ϴ°��̶�� �˷��ش�.
	
	@Deprecated
	������ ������� ���� ����̶�� �˷��ش�.
	
	@SuppressWarnings
	�����Ϸ� ��� ������� �ʰ� �ϵ��� ����
	@SuppressWarings("all") - ��� ��� ����
					("deprecation") - ��������ʴ� ��� ��� ����
					("null") null�� ���õ� ��� ����
					("unchecked") ��Ȯ�� ���۷��̼� ��� ����
					("unused") ��������ʴ� �ڵ� �Ǵ� ���ʿ��� �ڵ忡 ���� ������
	
	@FunctionalInterFace
	�Լ��� �������̽���°��� �˷��ش�.
	
	@SafeVaragrs
	���׸��� ���� ���� ������ �Ű������� ����Ҷ� ��� ��Ÿ���� �ʰ� �Ѵ�.
	
	��Ÿ annotation
	@Target - �������̼��� �����Ҷ� ������ ��� ����
	@Dcoumented - javadoc���� �ۼ��� ������ ����
	@Inherited - ����Ŭ������ ��ӵǵ��� �Ҷ� ���
	@Retention - �������̼� �Ⱓ ����
	@Repeatable - �������̼� �ݺ� ����
	
	
	


*/
