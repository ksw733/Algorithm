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
            double result = 0;
            for(int i=0; i<10; i++){
                int n = sc.nextInt();
                result += n;
            }

            System.out.println("#"+test_case+" "+Math.round(result/10));
        }
    }
}