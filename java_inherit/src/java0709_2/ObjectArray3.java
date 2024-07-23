package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findByAll();
		
//		//contains
//		for(Board board : list) {
//			if(board.getTitle().contains("e")) {
//				System.out.println(board);
//			}
//		}
//		
//		//hit값
//		for(Board board : list) {
//			if( board.getHit() >= 40000) {
//				System.out.println(board);
//			}
//		}
		
		//제목의 글자수가 8자 이상인것만 출력
//		for(Board board : list) {
//			if(board.getTitle().length() >= 8) {
//				System.out.println(board);
//			}
//		}
		
		//content의 글자수가 10자 이하인 객체의 title과 writer만 출력
//		for(Board board : list) {
//			if(board.getContent().length() <= 10) {
//				System.out.println("제목 : "+board.getTitle()+", "+"가수 : "+board.getWriter());
//			}
//		}
		
		//hit수가 3만 이상인 객체들을 추출하여 hot 배열에 저장
//		Board[] hot = new Board[list.length];
//		int i = 0;
//		for(Board board : list) {
//			if(board.getHit() >= 30000) {
//				hot[i] = board;
//				i++;
//			}
//		}
//		for(Board data : hot) {
//			if(data == null) break;
//			System.out.println(data);
//		}
		
		// writer에 '신'이 포함된 객체만 추출하여
		// sin 배열에 저장후 출력
		Board[] sin = new Board[list.length];
		int i = 0;
		for(Board board : list) {
			if(board.getWriter().contains("신")) {
				sin[i] = board;
				i++;
			}
		}
		for(Board data : sin) {
			if(data == null) break;
			System.out.println(data);
		}
	}
}
