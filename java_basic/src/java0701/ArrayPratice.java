package java0701;

public class ArrayPratice {

	public static void main(String[] args) {
		String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.";
		String name;
		int age;
		name = str.substring(str.indexOf("[")+1, str.indexOf("]"));	
		age = Integer.parseInt(str.substring(str.lastIndexOf("[")+1, str.lastIndexOf("]")));
		
		System.out.println(name);
		System.out.println(age);
	}

}
