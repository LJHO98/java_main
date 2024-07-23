package java0719_1;

public enum ThState {
	NEW, RNNABLE, BLOCKED,
	WATING, TIMED_WATING,
	TERMINATED
	
	//위 상수들은 하나의 객체처럼 동작하고 이름자체가 문자열같은 값으로도 사용되고, 기본적으로 정수 값을 가지고 있다.
	
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
	Enum - 상수들의 클래스처럼 사용할 수 있는 방법
	
	menu <- 1.파일 열기 2. 파일저장 3. 다른이름저장
			4. 환경설정 5. 종료
			
	enum Menu{
		파일열기, 파일저장, SAVES, SET, EXIT
	}
	
	swicth( menu ){
		case Menu.파일열기:
		case Menu.파일저장:
		case Menu.SAVES:
		case 4:
		case 5:
	}
*/
