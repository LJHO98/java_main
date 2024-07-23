package java_modifier;

public class Book {
	public static int count=0;
	
	private String title;
	private String author;
	private int page;
	
	public Book() {} //생성자 메서드
	public Book(String title, String author, int page) { //매개변수 있는 생성자 메서드
		this.title = title;
		this.author = author;
		this.page = page;
	}
	3
	@Override
	public String toString() {
		return this.title+" "+this.author+" "+this.page;
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Book.count = count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
}
