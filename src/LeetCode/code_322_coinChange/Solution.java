package LeetCode.code_322_coinChange;
/*
 * 给定不同面额的硬币 coins 和一个总金额 amount。
 * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
 * 如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 * 示例 1:
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 *
 * 示例 2:
 * 输入: coins = [2], amount = 3
 * 输出: -1
 *
 * 说明:
 * 你可以认为每种硬币的数量是无限的。
 */

import java.util.Arrays;

/*
 * 动态规划
 * 看评论有思路的
 * 自下而上的动态规划
 * dp(i) = dp(i-coin)+1
 */
public class Solution {

    public static void main(String[] args){
        Solution ss = new Solution();
        int[] coins = {186,419,83,408};
        int amount = 6249;
        int result = ss.coinChange(coins,amount);
        System.out.println(result);
        //System.out.println(383-186*2);
    }

    int coinChange(int[] coins, int amount){
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i = 1; i <= amount; i++){

            int mindpnum = mindp(dp,i,coins);
            System.out.println("i="+i+" mindp="+mindpnum);

            if(mindpnum == -1){
                dp[i] = -1;
            }else {
                dp[i] = mindpnum + 1;
            }

        }
        return dp[amount];
    }

    public static int mindp(int[] dp, int num, int[] coins){
        int min = 1000000;
        Boolean b = false;
        for(int coin : coins){
            if(coin <= num){

                if(dp[num-coin] != -1 && dp[num-coin] < min){
                    b = true;
                    min = dp[num-coin];
                }
            }
        }
        if(b) {
            return min;
        }else{
            return -1;
        }
    }
}
