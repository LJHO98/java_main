package test;

public class Music { //자바빈 - 브라우저에 표시할 데이터를 담을 수 있는 클래스
	private String title; 
	private String singer;
	private int year;

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
