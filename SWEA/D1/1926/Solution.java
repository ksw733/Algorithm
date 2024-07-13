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
            int count=0;
            String t = String.valueOf(test_case);

            for(char c : t.toCharArray()){
                if(c=='3' || c=='6' || c=='9'){
                    count++;
                }
            }
            if(count>0){
                for(int i=0; i<count; i++){
                    System.out.print("-");
                }
            } else {
                System.out.print(test_case);
            }
            System.out.print(" ");


        }
    }
}