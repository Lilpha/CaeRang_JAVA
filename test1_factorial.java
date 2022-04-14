
public class test1_factorial {
	public static void main(String [] args) {

	
		System.out.println("5! : "+ factorial(5) );
		
	}
	
	
	static int factorial(int i) {
		if (i == 1) return i;
		return i* factorial(i=i-1);
	}
	

	
}
