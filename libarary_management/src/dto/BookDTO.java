package dto;

public class BookDTO {
	private String code;
	private String title;
	private boolean is_rental;
	
	public BookDTO() {
		
	}
	
	public BookDTO(String code, String title, boolean is_rental) {
		this.code = code;
		this.title = title;
		this.is_rental = is_rental;
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isIs_rental() {
		return is_rental;
	}
	public void setIs_rental(boolean is_rental) {
		this.is_rental = is_rental;
	}
	
	
}
