package testtoday;
import java.util.*;

public class fgh {
    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();				//���� �ڵ忡�� scanner������ �迭�� ũ�⸦ ����
    
    	
    	int array[][] = new int[n][n]; 

        int cnt = 1;
        boolean isPositive = true;					//���������� ���������� ����		[1]
        for(int i =0; i < n; i++) {
            if(isPositive == true) {				//���� ��������� true�ϋ�		[2]
                for(int j=0 ; j<n ; j++) {			//�������� ����				[3]
                    array[i][j] = cnt++;
                }
            }    else {								//��������� true�� �ƴҶ�		[2]
                for (int j=n-1; j>= 0;j--) {			//������ j���� 4���� 0���� �پ��� ��� ������ ���ʺ��� ����ϴ� �͵� ������
                	//���� n-1�� ������ �迭�� 0���� �����ϱ� ���� 1=>0 �ڸ��� ������, �ƿ� ���� �� ��ǥ j�� ū������ �������� �� �����°�.	[4]
                									//�׷��� i=1�϶� [1][4]>[1][3]�� ������� ���� �ݺ� >��ǥ���� �����ϴ� �� ��
                    array[i][j] = cnt++;			//i���� ���������� ����			[3]
                }
            }
            isPositive = !isPositive;			//ó������ else���� ���� ���� ������ �ߴµ� 
        }										//�׳� �ݺ��� ����(��)�� ������ ������Ŵ = ������� ����
        										// �� �� ���ٱ��� ����Ʈ�� ���� �ߴµ� �����غ��� ������ ���� �����ϴ� �ڵ忴��
        for(int i=0; i<n; i++)					//���� �� �������ڵ�	i���� 0���� �ʱ�ȭ �߱⿡ �����̶� ��� x
        {
            for (int j =0;j<n;j++) 				//�� ������ �ڵ�		j���� 0���� �ʱ�ȭ �߱⿡ �����̶� ��� x
            {
                System.out.print(array[i][j] + "\t");		//"\t"�� �����ϴ� �ڵ尡 �ƴұ� �ϸ� ������.
            }
            System.out.println();				//�� �ϳ� �� ���ư��� println ���� �ٹٲ�
        }

    }
    }