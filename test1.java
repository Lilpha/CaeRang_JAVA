

import java.util.*;
public class test1 {
	public static void main(String []args ) {
		Scanner sc = new Scanner(System.in);
		int c1,c2;
		c1 = 0;
		c2 = 0;
		String some,thing;
		/*
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		some = sc.next();
		*/
		some = "pen pineapple apple pen" ;
		char array[] = new char [some.length()]; //something �迭�� some�� ���� ��ŭ �������
		for (int i =0;i<some.length();i++) {
			array[i] = some.charAt(i); // some�� ���̸�ŭ ������� array �迭�� ������� ��
		}
		for (int i =0;i<some.length();i++) {
			System.out.print(array[i]); //Ȯ�ο� �ڵ�
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
		System.out.println("������ ���� : "+c1+" �ܾ��� ���� : "+(c2+1));
	
		
	}
}
