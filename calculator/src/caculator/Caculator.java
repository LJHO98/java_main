package caculator;

abstract class Caculator { //�߻� Ŭ����

	public final void caculate(double num1, double num2) { //���ø� �޼���, final ������ ����ؼ� ���� ����
		double result = cal(num1, num2);
		printResult(result);
		
	}


protected abstract double cal(double num1, double num2); //�߻� �޼���

private void printResult(double result) { //��� ��� �޼���
	System.out.println("��� : "+result);
}

}