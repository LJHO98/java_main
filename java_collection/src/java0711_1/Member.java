package java0711_1;

public class Member implements Comparable<Member>{
	private String name;
	private int age;
	private String birth;
	
	public Member(String name, int age, String birth) {
		this.name = name;
		this.age = age;
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return name+", "+age+", "+birth;
	}
	
	//indexOf나 contains같은 메서드를 사용하려면 최상위 클래스인 object 클래스에
	//equals 메서드를 오버라이딩해주면 된다.
	@Override
	public boolean equals(Object obj) { //어떤 데이터로 비교할것인가?
		//클래스 타입도 형변환이 가능하다. 다만 부모클래스와 자식클래스 관계여야하고
		//부모클래스를 자식클래스로 바꾸는것만 가능 반대는 안된다.
		Member tmp = (Member)obj;
		boolean isSame = this.age==tmp.age;
		if(isSame)
			isSame = this.name.equals(tmp.name);
		if(isSame)
			isSame = this.birth.equals(tmp.birth);
		return isSame;
//		return this.age == tmp.age; //나이 비교
//		return this.name.equals(tmp.name); // 이름 비교
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public int compareTo(Member o) {
		//Collection.sort는 버블정렬을 사용, 비교(빼기)해서 나온 값이 양수일때 자리변경 음수일때는 자리변경 X
//		return this.age - o.age;
//		return this.name.compareTo(o.name); //String 클래스에 이미 compareTo 메서드가 오버라이딩 되어있으므로 그냥 사용하면 됨
// 		return (this.age - o.age)*-1; // o.age - this.age; 내림차순으로 정렬
		int comp = 0;
		comp = this.age - o.age;
		if(comp == 0) {
			comp = o.name.compareTo(this.name);
		}
		
		return comp;
	}
	
	
}
