package Written_Examination.WangYi;

import java.util.Arrays;
import java.util.Scanner;

public class Three {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for( int i = 0; i < T; i++){

            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            // 计算每个人最多能装多少东西
            int sum = 0;
            for(int j : arr){
                sum += j;
            }
            int max = sum/2;










        }

    }

}
