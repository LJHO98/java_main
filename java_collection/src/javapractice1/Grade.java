package javapractice1;

public class Grade {
	private String name;
	private int score;
	
	public Grade(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return name + ": " + score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
