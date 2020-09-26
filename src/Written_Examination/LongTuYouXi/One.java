package Written_Examination.LongTuYouXi;

import java.util.Scanner;

public class One {

    public static void main(String[] args){
        // 获取输入
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strs = input.split(" ");

        // 循环计算输出
        for(String str : strs){
            System.out.print(solution(str) + " ");
        }

    }

    private static int solution(String str){
        int len = str.length();
        int[][] dp = new int[len + 1][len + 1];
        for(int i = 1; i < len + 1; i++){
            for(int j = 1; j < len + 1; j++){
                if(str.charAt(i - 1) == str.charAt(len  - j)){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return len - dp[len][len];
    }

}
