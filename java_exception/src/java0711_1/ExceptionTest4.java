package java0711_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest4 {

	public static void main(String[] args) {
		//���Ͽ� ����
		
		//�ڵ��ڿ� ��ȯ
		try(BufferedReader br = new BufferedReader( new FileReader("C://test/data.txt")))
		{
			String text = br.readLine();
			System.out.println(text);
		}catch(Exception e) {
			System.out.println("���� ���� ���� �Ǵ� ���� ���� ����");
		}
		
		
//		BufferedWriter br = null;
//		try {
//			br = new BufferedWriter( new FileWriter( "C://test1/data.txt" ) );
//			br.write("�̼��� 34 ����");
//			br.close();
//			
//		}catch(Exception e){
//			System.out.println("���� ���� ���� �Ǵ� ���� ���� ����");
//			try {
//			br.close();
//			}catch(IOException e1) {
//				e1.printStackTrace();
//			}
//		}
		
		
	}

}

//���� ó�� - �ڵ��ڿ���ȯ
//���� �б�, ���⸦ �Ϸ��� ������ ������Ѵ�.
//������ ��� ����� �������� ���� �ڿ��� �ݳ��ؾ� �Ѵ�.
//���� �ݱ⸦ ����� �Ѵ�.
//�����ͺ��̽��� �����͸� �����ϰų� �������� ������ �ߴٸ�
//�ݱ⸦ ����� �Ѵ�.