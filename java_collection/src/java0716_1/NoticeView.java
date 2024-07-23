package java0716_1;

public class NoticeView implements PageAction{
	@Override
	public String action() {
		System.out.println(" 뷰 페이지에 제공할 데이터 조회완료");
		return "뷰 페이지 이동";
	}
}
