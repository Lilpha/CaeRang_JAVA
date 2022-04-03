
public class test4 {
	public static void main (String[] args) {
		int n, a, b;
		n = 3;
		a = 1;
		int [][] Array = new int[n][n];

		for (int i = 0; i< Array.length; i++) {
			for	(int j = 0; j < Array[i].length;j++) {
				Array[i][j] = n++;
				System.out.print(Array[i][j]+" ");
				
			}
		System.out.println();
		}
		
		
	}
}
