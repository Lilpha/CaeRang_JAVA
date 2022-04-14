import java.util.Scanner;
public class test2_overloading {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("타입 변환할 수를 입력하세요 : 8 ");
		float Typei = 8;
		System.out.println(convertStr(Typei));	
	}
	
	
	static int factorial(int i) {
		if (i == 1) return i;
		return i* factorial(i=i-1);
	}
	
	
	static String convertStr(int Typei) {
		//i 입력이 들어오면 그걸 string 형태로 변환
		String converti = String.valueOf(Typei);			//현재 문제가 입력의 모양으로 출력이 되는 문제가 있음
		return converti;
	}
	static String convertStr(float Typei) {					//코드를 작성할때 메소드 부분에서 Typei의 문자 타입을 확인해
		//i 입력이 들어오면 그걸 string 형태로 변환				//converStr중에 하나로 변환될 것이라 예상 했지만 실패.
		String converti = String.valueOf(Typei);
		return converti;
	}
	static String convertStr(double Typei) {
		//i 입력이 들어오면 그걸 string 형태로 변환
		String converti = String.valueOf(Typei);
		return converti;
	}
	
	
}
