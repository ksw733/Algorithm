import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int F=sc.nextInt();

        for(int test_case = F; test_case <= T; test_case++){
            if(test_case == T){
                System.out.println(test_case-F+1);
            }

        }
    }
}