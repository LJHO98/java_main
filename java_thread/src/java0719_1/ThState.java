package java0719_1;

public enum ThState {
	NEW, RNNABLE, BLOCKED,
	WATING, TIMED_WATING,
	TERMINATED
	
	//�� ������� �ϳ��� ��üó�� �����ϰ� �̸���ü�� ���ڿ����� �����ε� ���ǰ�, �⺻������ ���� ���� ������ �ִ�.
	
//	int num;
//	Thstate(int num){
//		this.num= num;	
//	}
//	
//	Thstate() {
//		
//	}
}

/*
	Enum - ������� Ŭ����ó�� ����� �� �ִ� ���
	
	menu <- 1.���� ���� 2. �������� 3. �ٸ��̸�����
			4. ȯ�漳�� 5. ����
			
	enum Menu{
		���Ͽ���, ��������, SAVES, SET, EXIT
	}
	
	swicth( menu ){
		case Menu.���Ͽ���:
		case Menu.��������:
		case Menu.SAVES:
		case 4:
		case 5:
	}
*/
