package java0716_1;

public class Login implements PageAction{
	@Override
	public String action() {
		System.out.println("로그인 처리 완료");
		return "로그인 성공 페이지 이동";
	}
}
