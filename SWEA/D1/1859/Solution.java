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
            long[] list = new long[N];
            long max = 0;
            long result = 0;
            for(int i = 0; i < N; i ++){
                list[i] = sc.nextInt();
            }
            for(int i = N - 1; i >= 0; i--){
                if(list[i]>max){
                    max = list[i];
                }
                result += max - list[i];
            }



            System.out.println("#"+test_case+ " "+result);

        }
    }
}