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
            int result=0;
            String S = sc.next();
            for(char c : S.toCharArray()){

            }
            for(int i=0; i<S.length(); i++){
                char c[] = S.toCharArray();
                if(c[i] != c[S.length()-1-i]){
                    result = 0;
                    break;
                }
                result = 1;
            }

            System.out.println("#"+ test_case +" "+result);
        }
    }
}