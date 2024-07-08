import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String date = sc.next();
            String result = isValidDate(date) ? formatDate(date) : "-1";
            System.out.println("#"+test_case+" "+result);
        }

    }

    private static boolean isValidDate(String date) {
        if (date.length() != 8) {
            return false;
        }
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(4, 6));
        int day = Integer.parseInt(date.substring(6, 8));

        if (year < 0) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int[] maxDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (day < 1 || day > maxDay[month - 1]) {
            return false;
        }
        return true;
    }

    private static String formatDate(String date) {
        String year = date.substring(0,4);
        String month = date.substring(4,6);
        String day = date.substring(6,8);
        return year+"/"+month+"/"+day;
    }


}