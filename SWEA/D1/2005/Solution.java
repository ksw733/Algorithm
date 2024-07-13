import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            System.out.println("#"+test_case);
            int N = sc.nextInt();
            int n[][] = new int[N][N];
            n[0][0]=1;
            for(int i = 1; i < N; i++) {
                for(int j = 0; j<=i; j++){
                    if(j==0 || j==i){
                        n[i][j]=1;
                    } else {
                        n[i][j] = n[i-1][j-1] + n[i-1][j];
                    }
                }
            }
            for(int i=0; i<N; i++){
                for(int j=0; j<=i; j++){
                    System.out.print(n[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}