import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int F = sc.nextInt();

        System.out.println(T+F);
        System.out.println(T-F);
        System.out.println(T*F);
        System.out.println(T/F);

    }
}