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
            int[] arr = new int[10];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int result = 0;
            Arrays.sort(arr);
            for(int i=1; i<arr.length-1; i++){
                result += arr[i];
            }
            System.out.println("#"+test_case+" "+Math.round(result/8.0));

        }
    }
}