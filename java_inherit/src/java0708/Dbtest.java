package java0708;

import java.util.Arrays;
import java.util.Scanner;

public class Dbtest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Dao dao = new Dao();
		Member[] list; //Member클래스 타입 배열 주소를 저장할 참조변수
		
		System.out.print("1.입력  2. 출력 3. 삭제 : ");
		int menu = scan.nextInt();
		
		switch(menu) {
			case 1:
				scan.nextLine();
				System.out.print("학생 이름 : ");
				String name = scan.nextLine();
				System.out.print("국어 성적 : ");
				int kor = scan.nextInt();
				System.out.print("영어 성적 : ");
				int eng = scan.nextInt();
				System.out.print("수학 성적 : ");
				int mat = scan.nextInt();
				
				Member member = new Member(name, kor, eng, mat);
				total_avg(member);
				System.out.println(member);
				
				//데이터베이스에 저장
				dao.insert(member);
				break;
			case 2: // 데이터 전부 출력
				list = dao.select();// 데이터베이스의 데이터를 Member 클래스 배열로 가져오기
				for(Member data : list) {
					System.out.println(data);
				}
				break;
			case 3:
				scan.nextLine();
				System.out.println("학생 이름 : ");
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

// 1. 드라이버로 연결
// 2. 계정 접속
// 3. 쿼리문 작성