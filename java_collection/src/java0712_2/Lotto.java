package java0712_2;

public class Lotto {
	private int[] num;

	public Lotto(int[] num) {
		this.num=num;
	}
	
	@Override
	public String toString() {
		return num[0]+","+num[1]+","+num[2]+","+num[3]+","+
				num[4]+","+num[5];
	}
	
	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}
	
	
}

