import java.util.Scanner;
public class test2_overloading {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ÿ�� ��ȯ�� ���� �Է��ϼ��� : 8 ");
		float Typei = 8;
		System.out.println(convertStr(Typei));	
	}
	
	
	static int factorial(int i) {
		if (i == 1) return i;
		return i* factorial(i=i-1);
	}
	
	
	static String convertStr(int Typei) {
		//i �Է��� ������ �װ� string ���·� ��ȯ
		String converti = String.valueOf(Typei);			//���� ������ �Է��� ������� ����� �Ǵ� ������ ����
		return converti;
	}
	static String convertStr(float Typei) {					//�ڵ带 �ۼ��Ҷ� �޼ҵ� �κп��� Typei�� ���� Ÿ���� Ȯ����
		//i �Է��� ������ �װ� string ���·� ��ȯ				//converStr�߿� �ϳ��� ��ȯ�� ���̶� ���� ������ ����.
		String converti = String.valueOf(Typei);
		return converti;
	}
	static String convertStr(double Typei) {
		//i �Է��� ������ �װ� string ���·� ��ȯ
		String converti = String.valueOf(Typei);
		return converti;
	}
	
	
}
