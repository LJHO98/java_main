package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		
		try {
			String name = null;
			name.length();
			System.out.println(10/0);
		}catch(NullPointerException e1){
			e1.printStackTrace(); // 오류메세지 확인 - 테스트용
			System.out.println(e1.getMessage());
			System.out.println(e1.getClass());
			System.out.println("문자열 입력!");
		}catch(Exception e2) {
			System.out.println("0으로 나누기 하며 안돼");
		}
			
		
	}
}

/*
	예외처리
	 - 프로그램 실행중에 에러 발생하면 즉시 프로그램 종료된다.
	   예외처리를 해주면 에러가 발생해도 프로그램은 종료 되지 않는다.
	 - 사용자가 잘못된값을 입력하는 경유 알려줄 수 있다.
	 - 에러나 오류를 해결하는 방법이 아니고, 회피하는 방법이다.

*/
