package Written_Examination.Tencent;

import java.util.Scanner;

public class Five {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int Q = sc.nextInt();
        int[] l = new int[Q];
        int[] r = new int[Q];
        for(int i = 0; i < Q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        for(int i = 0; i < Q; i++){
            System.out.println(getMin(input.substring(l[i] - 1, r[i] - 1)) + 1);
        }






    }

    private static int getMin(String str){
//        System.out.println(str);
        int len = str.length();
        int[] f = new int[len + 1];
        int[][] dp = new int[len][len];

        for(int i = 0; i <= len; i++){
            f[i] = len - 1 - i;
        }
        for(int i = len - 1; i >= 0; i--){
            dp[i][i] = 1;
            for(int j = i; j < len; j++){
                if(str.charAt(i) == str.charAt(j) && ((j - i < 2) || dp[i + 1][j - 1] == 1)){
                    dp[i][j] = 1;
                    f[i] = Math.min(f[i], f[j + 1] + 1);
                }
            }
        }
        return f[0];
    }

}
