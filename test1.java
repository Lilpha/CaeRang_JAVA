import java.util.Arrays;

public class test1 {
	public static void main(String []args ) {
		String school = "hallym universty";
		char school_word[] = new char [school.length()];
		
		for (int i =0;i<school.length();i++) {
			school_word[i] = school.charAt(i);
		}
		System.out.println("문자 배열후 출력");
		
		for(char value : school_word) {
			System.out.print(value+" ");
			
			System.out.println();
			Arrays.sort(school_word);
			
			System.out.println("정렬 후 출력");
			for(int value1 : school_word) {
				System.out.print(value1+" ");
			}
		}
	}
}
