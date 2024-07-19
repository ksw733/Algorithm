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
            int arr[][] = new int[9][9];
            boolean result = true;
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0; i<9; i++){
                boolean[] check = new boolean[9];
                for(int j=0; j<9; j++){
                    int num = arr[i][j]-1;
                    if(check[num]){
                        result = false;
                        break;
                    }
                    check[num]=true;
                }
            }
            for(int i=0; i<9; i++){
                boolean[] check = new boolean[9];
                for(int j=0; j<9; j++){
                    int num = arr[j][i]-1;
                    if(check[num]){
                        result = false;
                        break;
                    }
                    check[num]=true;
                }
            }
            for(int i=0; i<9; i+=3){
                for(int j=0; j<9; j+=3){
                    boolean[] check = new boolean[9];
                    for(int x=0; x<3; x++){
                        for(int y=0; y<3; y++){
                            int num = arr[i+x][j+y]-1;
                            if(check[num]){
                                result = false;
                                break;
                            }
                            check[num]=true;
                        }
                    }
                }
            }
            System.out.println("#"+test_case+" "+(result ? 1 : 0));
        }
    }
}