package Written_Examination.MeiTuan;

import java.util.Scanner;

public class Two {

    public static void main(String[] args){

        // 获取输入
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] v = new int[n];
        int[] w = new int[n];
        for(int i = 0; i < n; i++){
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        // 计算每个订单的收益并存储到数组
        int[] income = new int[n];
        for(int i = 0; i < n; i++){
            income[i] = v[i] + 2 * w[i];
        }

        // 将最大的订单保存到数组
        int[] ans = new int[m];
        for(int i = 0; i < m; i++){
            int max = 0;
            for(int j = 0; j < n; j++){
                if(income[max] < income[j]){
                    max = j;
                }
            }
            ans[i] = max;
        }

        for(int i = 0; i < m - 1; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.print(ans[m-1]);


    }

}
