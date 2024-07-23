package java0703_1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {
		Member member1 = new Member("�̼���",31,"����");
		Member member2 = new Member("������",29,"�����������");
		Member member3 = new Member("�念��",45,"��������");
		
		//�¾ �⵵
		member1.birthYear();
		member2.birthYear();
		member3.birthYear();
		
		//���̴�
//		DataIdenti.ageRange(member1.age);
		
		DataIdenti dataIdenti = new DataIdenti();
		dataIdenti.ageGroup(member1.name, member1.age);
		dataIdenti.ageGroup(member2.name, member2.age);
		
		//�����з� - �������� �з��� ���� ǥ��
		dataIdenti.jobGroup(member1.name, member1.job);
		dataIdenti.jobGroup(member2.name, member2.job);
		dataIdenti.jobGroup(member3.name, member3.job);
		
		
		
		
//		System.out.println(today.getYear());
		//�⵵ - .getYear()
		//�� - .getMonthValue();
		//�� - .getDayOfMonth();
		//���� - .getDayOfWeek().getValue(); 1(������), 2ȭ����, ...
		
//		Calendar cal = Calendar.getInstance(); //�߻�Ŭ���� - new�����ڸ� ���� ��ü ���� �Ұ�, �ٸ� Ŭ������ ���� ��ü ����
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH) + 1;
//		int �� = cal.get(Calendar.DAY_OF_MONTH);
//		int ���� =  cal.get(Calendar.DAY_OF_WEEK);
//		
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(��);
//		System.out.println(����);
		
		
//		Date today = new Date();
//		System.out.println(today.getDay());

	}

}

//�޼��峪 �Լ��� ����ϴ� ����
//�迭, ���, �ܼ� ��� - �ݺ���
//�޼��带 ����ϸ� �ڵ��� ����� ��������, �������� ��������.
//�޼��带 ����ϸ� ����ȭ�� ���α׷����� �����ϴ�.

class Member {
	String name;//�̸�
	int age;//����
	String job;//����
	
	//�⺻ �����ڸ޼���
	Member(){}
	
	//�Ű������� �ִ� ������ �޼���
	Member(String name, int age, String job){
		this.name=name;
		this.age=age;
		this.job=job;
	}
	
	void birthYear() {
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
		// ȭ�� ��� - �̼��� �¾�⵵ : 0000��
		
		int birthYear1 = nowYear - this.age;
		System.out.printf("%s �¾�⵵ : %d \n", this.name, birthYear1);
		
	}
	
}

//��Ʈ�ѿ� Ŭ����, ��������� ���� Ŭ����, ������ Ŭ����
//Controller, Service, DTO(VO)

class DataIdenti { //���ɴ�, ���� �з� ��� ������ �з��� ���� Ŭ����
	
//	static void ageRange(int age) {
//		if(age>=20 && age<=30) {
//			System.out.println("20��");
//		}else if(age>=30 && age<=40) {
//			System.out.println("30��");
//		}else if(age>=40 && age<=50) {
//			System.out.println("40��");
//		}	
//	}
	void ageGroup(String name ,int age) {
		String group=null;
		group = (age/10)+"0��";
		System.out.println(name+" : "+group);
	}
	
	// ���� ���� �з�
	// ���� - 05.���� �������� - 15.���
	// ����������� - 18.�����Ǻ�
	void jobGroup(String name, String job) {
		String ncs = null;
		
		switch(job) {
			case "����": ncs = "05.����";
				break;
			case "��������": ncs = "15.���";
				break;
			case "�����������": ncs = "18.�����Ǻ�";
				break;
		}
		System.out.printf("%s : %s\n",name, ncs);
	}
}