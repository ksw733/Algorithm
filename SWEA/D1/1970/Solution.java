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
            int N = sc.nextInt();
            int[] units = {50000,10000,5000,1000,500,100,50,10};
            System.out.println("#"+test_case);
            for(int unit : units){
                int count = N/unit;
                System.out.print(count+" ");
                N %= unit;
            }
            System.out.println();

        }
    }
}