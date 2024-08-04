package dto;

public class MemberDTO {
	private String memNum;
	private String bookCode;
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(String memNum, String booCode) {
		this.memNum = memNum;
		this.bookCode = bookCode;
	}
	
	public String getMemNum() {
		return memNum;
	}
	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	
	
}
