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
            int hour1 = sc.nextInt();
            int min1 = sc.nextInt();
            int hour2 = sc.nextInt();
            int min2 = sc.nextInt();
            int resultHour = hour1 + hour2;
            int resultMin = min1 + min2;
            int addHour = 0;
            if(resultMin >= 60){
                addHour = resultMin/60;
                resultMin %= 60;
            }
            resultHour = (resultHour+addHour)%12;
            if(resultHour == 0) resultHour = 12;

            System.out.println("#"+test_case+" "+resultHour+" "+resultMin);
        }
    }
}