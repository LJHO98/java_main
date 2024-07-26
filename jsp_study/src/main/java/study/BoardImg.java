package study;

public class BoardImg {
	private int boardImgId; //번호
	private int boardId; //게시글 번호
	private String imgName; //이미지이름
	private String imgPath; //이미지저장경로
	
	public BoardImg() {
		
	}
	
	public BoardImg(int boardImgId, int boardId, String imgName, String imgPath) {
		this.boardImgId = boardImgId;
		this.boardId = boardId;
		this.imgName = imgName;
		this.imgPath = imgPath;
	}
	
	public int getBoardImgId() {
		return boardImgId;
	}
	public void setBoardImgId(int boardImgId) {
		this.boardImgId = boardImgId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	
}
