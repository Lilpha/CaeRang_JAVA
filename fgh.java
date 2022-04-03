package testtoday;
import java.util.*;

public class fgh {
    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();				//기존 코드에서 scanner문으로 배열의 크기를 정함
    
    	
    	int array[][] = new int[n][n]; 

        int cnt = 1;
        boolean isPositive = true;					//정방향인지 역방향인지 구분		[1]
        for(int i =0; i < n; i++) {
            if(isPositive == true) {				//만약 진행방향이 true일떄		[2]
                for(int j=0 ; j<n ; j++) {			//정상적인 증가				[3]
                    array[i][j] = cnt++;
                }
            }    else {								//진행방향이 true가 아닐때		[2]
                for (int j=n-1; j>= 0;j--) {			//하지만 j값이 4에서 0으로 줄어드는 모양 이유는 왼쪽부터 출력하는 것도 있지만
                	//위가 n-1인 이유는 배열은 0부터 시작하기 때문 1=>0 자리에 들어가야함, 아예 값이 들어갈 좌표 j를 큰수에서 작은수로 써 나가는것.	[4]
                									//그러면 i=1일때 [1][4]>[1][3]의 모양으로 수열 반복 >좌표값에 증가하는 값 들어감
                    array[i][j] = cnt++;			//i값은 정상적으로 증가			[3]
                }
            }
            isPositive = !isPositive;			//처음에는 else에만 들어가면 되지 않을까 했는데 
        }										//그냥 반복문 한줄(열)이 끝나면 반전시킴 = 진행순서 변경
        										// 왜 이 윗줄까지 프린트가 없나 했는데 생각해보니 수열에 값만 대입하는 코드였음
        for(int i=0; i<n; i++)					//순서 행 돌리는코드	i값은 0으로 초기화 했기에 윗줄이랑 상관 x
        {
            for (int j =0;j<n;j++) 				//열 돌리는 코드		j값은 0으로 초기화 했기에 윗줄이랑 상관 x
            {
                System.out.print(array[i][j] + "\t");		//"\t"는 정렬하는 코드가 아닐까 하며 생각중.
            }
            System.out.println();				//열 하나 다 돌아가면 println 으로 줄바꿈
        }

    }
    }