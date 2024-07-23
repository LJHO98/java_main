package java0712_3;

import java.util.Collections;

public class LinkedList2 {
	Node head=null; //��ũ�帮��Ʈ�� ù��° ���
	Node tail; //��ũ�帮��Ʈ�� ������ ���
	
	void add(int n) { // �� ������ ����
		Node temp = new Node(n);
		if(head==null) {
			head = temp;
			tail = temp;
		}else {
			tail.next=temp;
			tail=temp;
		}
		
			
	}
	
	@Override
	public String toString() {
		String out="[";
		Node move = head;
		while(move !=null) {
			out += move.num+", ";
			move = move.next;
		}
		out = out.substring(0, out.length()-2);
		return out+"]";
	}
	
	int get(int index) { //������ ��ġ�� ������ ���
		int cnt = 0;
		int out =0;
		Node move = head;
		while(move !=null) {
			if(cnt==index) {
				out = move.num;
				break;
			}
			move = move.next;
			cnt++;
			
		}
		return out;
	}
	
	void remove(int index) { //������ ��ġ�� ������ ����
		Node pre = head;
		int cnt = 0;
		Node del = null;
		if(index==0) {
			head=pre.next;
		}else{
			
			for(int i=1; i<index; i++) {
				pre = pre.next;
			}
			del = pre.next;
			pre.next = del.next;
			if(pre.next==null)
				tail=pre;
		}
		
	}
}

// �� ������ ���� - add
// ������ ���� - remove
// ��ü ��� - toString
// ������ �ϳ� ��� - get
