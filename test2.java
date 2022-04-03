import java.util.*;

public class test2 {
	public static void main(String []args ) {
	int col, row;
	int Array[][];
	int cnt = 1;
	Scanner scan = new Scanner(System.in);
	System.out.print("행 입력");
	col = scan.nextInt();
	
	System.out.print("열 입력");
	row = scan.nextInt();
	
	Array = new int[col][row];
	
	for (int i = 0; i< Array.length; i++) {
		for	(int j = 0; j < Array[i].length;j++) {
			Array[i][j] = cnt++;
		}
	}
	
	for (int _Col[] : Array) {
		for (int _Row : _Col)
			System.out.printf("%-3d ",_Row);
		System.out.println();
	}
	
	}
}
