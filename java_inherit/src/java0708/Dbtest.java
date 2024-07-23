package java0708;

import java.util.Arrays;
import java.util.Scanner;

public class Dbtest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Dao dao = new Dao();
		Member[] list; //MemberŬ���� Ÿ�� �迭 �ּҸ� ������ ��������
		
		System.out.print("1.�Է�  2. ��� 3. ���� : ");
		int menu = scan.nextInt();
		
		switch(menu) {
			case 1:
				scan.nextLine();
				System.out.print("�л� �̸� : ");
				String name = scan.nextLine();
				System.out.print("���� ���� : ");
				int kor = scan.nextInt();
				System.out.print("���� ���� : ");
				int eng = scan.nextInt();
				System.out.print("���� ���� : ");
				int mat = scan.nextInt();
				
				Member member = new Member(name, kor, eng, mat);
				total_avg(member);
				System.out.println(member);
				
				//�����ͺ��̽��� ����
				dao.insert(member);
				break;
			case 2: // ������ ���� ���
				list = dao.select();// �����ͺ��̽��� �����͸� Member Ŭ���� �迭�� ��������
				for(Member data : list) {
					System.out.println(data);
				}
				break;
			case 3:
				scan.nextLine();
				System.out.println("�л� �̸� : ");
				String stdName = scan.nextLine();
				dao.delete(stdName);
		}
	}
	
	static void total_avg(Member m) {
		int total = m.getKor() + m.getEng() + m.getMat();
		m.setTot(total);
		m.setStd_avg(total/3);
	}

}

// 1. ����̹��� ����
// 2. ���� ����
// 3. ������ �ۼ�