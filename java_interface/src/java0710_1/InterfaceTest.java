package java0710_1;

abstract class animal{//�θ�Ŭ����
	
	public abstract void fly();
	public abstract void sound();
}

class dog extends animal{
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}

class cat extends animal{
	@Override
	public void sound() {
		System.out.println("�Ŀ�");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		animal dog = new dog();
		animal cat = new cat();
		
		dog.sound();
		cat.sound();

	}

}
/*
	�������� �Ҹ��� ����Ѵ�.
	��,�����,��,��ѱ�,�� ���
	�� ������ ���� �ٸ� ��ü �̱� ������ ������ Ŭ������ ����
	������ ������ ������ �����ϹǷ� animal�̶�� �θ� Ŭ������ �ΰڴ�.
*/
