

import java.util.*;
public class test1 {
	public static void main(String []args ) {
		Scanner sc = new Scanner(System.in);
		int c1,c2;
		c1 = 0;
		c2 = 0;
		String some,thing;
		/*
		System.out.println("문자열을 입력하세요 : ");
		some = sc.next();
		*/
		some = "pen pineapple apple pen" ;
		char array[] = new char [some.length()]; //something 배열을 some의 길이 만큼 만들었음
		for (int i =0;i<some.length();i++) {
			array[i] = some.charAt(i); // some의 길이만큼 만들어진 array 배열에 순서대로 들어감
		}
		for (int i =0;i<some.length();i++) {
			System.out.print(array[i]); //확인용 코드
			}
		for (int i =0;i<some.length();i++) {
			if (array[i] == 'i'||array[i] == 'e'||array[i] == 'o'||array[i] == 'u'||array[i] == 'a') 
			{
			c1 ++;
			}
			else if (array[i] == ' ') {
				c2++;
			}
		
		}
		System.out.println();
		System.out.println("모음의 개수 : "+c1+" 단어의 개수 : "+(c2+1));
	
		
	}
}
