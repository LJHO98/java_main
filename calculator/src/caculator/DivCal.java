package caculator;

public class DivCal extends Caculator{
	@Override
	protected double cal(double num1, double num2) {
		if(num1==0) {
			System.out.println("잘못된 입력");
			return 0;
		}
		
		
		return num1/num2;
	}
}
