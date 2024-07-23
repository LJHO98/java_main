package java0708;

public class Member {
	private int member_id;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private int std_avg;
	
	public Member() {}
	
	//사용자 입력용 생성자 메서드
	public Member(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	//데이터 베이스에서 가지고온 데이터 저장용 생성자 메서드
	public Member(int member_id, String name, int kor, 
			int eng, int mat, int tot, int std_avg) {
		this(name, kor, eng, mat); //위에 생성자 메서드 사용
		this.member_id=member_id;
		this.tot = tot;
		this.std_avg = std_avg;
	}
	
	@Override
	public String toString() {
		return "["+member_id+", "+name+", "+kor+", "+eng+", "+mat+", "+
				tot+", "+std_avg+"]";
	}
	
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getStd_avg() {
		return std_avg;
	}
	public void setStd_avg(int std_avg) {
		this.std_avg = std_avg;
	}
	
}

