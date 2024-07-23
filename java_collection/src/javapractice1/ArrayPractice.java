package javapractice1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		ArrayList<Grade> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int scoreTemp;
		String nameTemp;
		
		while(true) {
			System.out.print("학생 이름을 입력해주세요 : ");
			nameTemp = scan.nextLine();
			if(nameTemp.equals("끝")) break;
			System.out.print("국어 성적을 입력해주세요 : ");
			scoreTemp = scan.nextInt();
			scan.nextLine();
			list.add(new Grade(nameTemp, scoreTemp));
			
		}
		

	}

}
