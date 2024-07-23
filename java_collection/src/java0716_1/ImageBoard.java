package java0716_1;

public class ImageBoard {
	public static int count = 0;
	private String title;
	private String writer;
	private int id;
	private String imagePath;
	
	
	public ImageBoard(String title, String writer, String imagePath) {
		this.title = title;
		this.writer = writer;
		this.imagePath = imagePath;
		this.id = ++count;
	}
	
	@Override
	public String toString() {
		return title+"-"+writer+"-"+imagePath;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
}
