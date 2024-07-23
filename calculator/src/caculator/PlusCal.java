package caculator;

public class PlusCal extends Caculator{ //더하기, 추상클래스 Caculator를 상속
	@Override
	protected double cal(double num1, double num2) {
		return num1+num2;
	}
}
