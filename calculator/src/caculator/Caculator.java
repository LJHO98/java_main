package caculator;

abstract class Caculator { //추상 클래스

	public final void caculate(double num1, double num2) { //템플릿 메서드, final 제한자 사용해서 수정 방지
		double result = cal(num1, num2);
		printResult(result);
		
	}


protected abstract double cal(double num1, double num2); //추상 메서드

private void printResult(double result) { //결과 출력 메서드
	System.out.println("결과 : "+result);
}

}