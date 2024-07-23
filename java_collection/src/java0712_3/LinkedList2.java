package java0712_3;

import java.util.Collections;

public class LinkedList2 {
	Node head=null; //링크드리스트의 첫번째 노드
	Node tail; //링크드리스트의 마지막 노드
	
	void add(int n) { // 새 데이터 저장
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
	
	int get(int index) { //지정한 위치의 데이터 출력
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
	
	void remove(int index) { //지정한 위치의 데이터 삭제
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

// 새 데이터 저장 - add
// 데이터 삭제 - remove
// 전체 출력 - toString
// 데이터 하나 출력 - get
