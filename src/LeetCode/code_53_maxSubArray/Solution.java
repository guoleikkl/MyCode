package LeetCode.code_53_maxSubArray;
/* 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
*/

/*
 * 动态规划
 * dp(i)表示：以nums[i]结尾的子序列的最大值
 * 如果 dp(i-1)>0 ,则dp(i) = dp(i-1) + nums[i]
 * 如果 dp(i-1)<0 ,则dp(i) = nums[i]
 */
public class Solution {

    public int maxSubArray(int[] nums){

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(dp[i - 1] > 0){
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            max = Math.max(max, dp[i]);
        }
        return max;



    }

}
