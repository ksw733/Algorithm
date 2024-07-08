import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String T;
        T=sc.next();

        for(char ch : T.toCharArray()){
            System.out.print(ch - 'A' + 1 + " ");
        }

    }
}