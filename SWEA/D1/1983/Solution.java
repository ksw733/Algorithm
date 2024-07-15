import java.util.Scanner;
import java.util.Arrays;
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
            int N = sc.nextInt();
            int k = sc.nextInt();
            double total[] = new double[N];
            for(int i=0; i<N; i++){
                int mid = sc.nextInt();
                int fin = sc.nextInt();
                int report = sc.nextInt();
                total[i] = mid*0.35+fin*0.45+report*0.2;
            }
            double result = total[k-1];
            int rank=0;
            Arrays.sort(total);
            for(int i=N-1; i>=0; i--){
                if(total[i]==result){
                    rank = N-1-i;
                    break;
                }
            }

            String grade[]={"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
            System.out.println("#"+test_case+" "+grade[rank*10/N]);
        }
    }
}