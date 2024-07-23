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
	
	//indexOf�� contains���� �޼��带 ����Ϸ��� �ֻ��� Ŭ������ object Ŭ������
	//equals �޼��带 �������̵����ָ� �ȴ�.
	@Override
	public boolean equals(Object obj) { //� �����ͷ� ���Ұ��ΰ�?
		//Ŭ���� Ÿ�Ե� ����ȯ�� �����ϴ�. �ٸ� �θ�Ŭ������ �ڽ�Ŭ���� ���迩���ϰ�
		//�θ�Ŭ������ �ڽ�Ŭ������ �ٲٴ°͸� ���� �ݴ�� �ȵȴ�.
		Member tmp = (Member)obj;
		boolean isSame = this.age==tmp.age;
		if(isSame)
			isSame = this.name.equals(tmp.name);
		if(isSame)
			isSame = this.birth.equals(tmp.birth);
		return isSame;
//		return this.age == tmp.age; //���� ��
//		return this.name.equals(tmp.name); // �̸� ��
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
		//Collection.sort�� ���������� ���, ��(����)�ؼ� ���� ���� ����϶� �ڸ����� �����϶��� �ڸ����� X
//		return this.age - o.age;
//		return this.name.compareTo(o.name); //String Ŭ������ �̹� compareTo �޼��尡 �������̵� �Ǿ������Ƿ� �׳� ����ϸ� ��
// 		return (this.age - o.age)*-1; // o.age - this.age; ������������ ����
		int comp = 0;
		comp = this.age - o.age;
		if(comp == 0) {
			comp = o.name.compareTo(this.name);
		}
		
		return comp;
	}
	
	
}
