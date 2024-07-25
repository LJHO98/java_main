package study;

public class Inquiry {
	private int inquiryId;
	private String title;
	private String content;
	private String writer;
	private String email;
	private String password;
	private String answer;
	
	public Inquiry() {}
	public Inquiry(int id, String title, String content
			,String writer, String email, String password,
			String answer) {
		this.inquiryId=id;
		this.title=title;
		this.content=content;
		this.writer=writer;
		this.email=email;
		this.password=password;
		this.answer=answer;
	}
	
	
	public int getInquiryId() {
		return inquiryId;
	}
	public void setInquiryId(int inquiryId) {
		this.inquiryId = inquiryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
