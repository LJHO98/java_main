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
//		//hit��
//		for(Board board : list) {
//			if( board.getHit() >= 40000) {
//				System.out.println(board);
//			}
//		}
		
		//������ ���ڼ��� 8�� �̻��ΰ͸� ���
//		for(Board board : list) {
//			if(board.getTitle().length() >= 8) {
//				System.out.println(board);
//			}
//		}
		
		//content�� ���ڼ��� 10�� ������ ��ü�� title�� writer�� ���
//		for(Board board : list) {
//			if(board.getContent().length() <= 10) {
//				System.out.println("���� : "+board.getTitle()+", "+"���� : "+board.getWriter());
//			}
//		}
		
		//hit���� 3�� �̻��� ��ü���� �����Ͽ� hot �迭�� ����
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
		
		// writer�� '��'�� ���Ե� ��ü�� �����Ͽ�
		// sin �迭�� ������ ���
		Board[] sin = new Board[list.length];
		int i = 0;
		for(Board board : list) {
			if(board.getWriter().contains("��")) {
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
