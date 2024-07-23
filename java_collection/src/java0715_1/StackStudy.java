package java0715_1;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {
//		Stack<String> st = new Stack<>();
//		
//		st.add("�̼���");
//		st.push("������");
//		st.push("������");
//		st.push("�庸��");
//		st.push("������");
//		System.out.println(st);
//		System.out.println(st.pop());
//		System.out.println(st);
//		System.out.println(st.search("������"));
//		
//		System.out.println(st.size());
//		
//		//���ϴ� ���� ����ϱ� ���� pop �޼��� ���� Ƚ��
//		//st.size() - st.search("������")
//	
//		
//		System.out.println(st.pop());
//		String tmp = st.pop();
//		System.out.println(tmp);
//		
//		System.out.println(st.isEmpty());
		
		Stack<String> pre = new Stack<>();
		Stack<String> back = new Stack<>();
		String now = "���̹�";
		String temp;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�̵������� �Է� (1.�� 2.��) : ");
			temp = sc.nextLine();
			if(temp.equals("1") && !back.isEmpty()) { // ���� ������ �̵�
				pre.push(now);
				now = back.pop();
				
			}else if(temp.equals("2") && !pre.isEmpty()) { // �� ������ �̵�
				back.push(now);
				now = pre.pop();
			
			}else if(!(temp.equals("1") || temp.equals("2"))) { //�� ������ �̵�
				back.push(now);
				pre.clear();
				now = temp;
			}
			System.out.println("================");
			System.out.println("���� ������ : " + now);
			System.out.println("back ������ ��� : " + back);
			System.out.println("pre ������ ��� : " + pre);
			
		}
	}

}

/* stack
	�����͸� �����ϱ� ���� �Ա��� ����ϱ� ���� �ⱸ�� ����.
	�� ���� ���� ����� ����� �̷������ �����̴�.
	FILO - first in last out
	���⳪ �������� �湮��� � ����
 	
 
 



*/
