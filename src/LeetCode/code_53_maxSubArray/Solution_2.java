package LeetCode.code_53_maxSubArray;

/*
 * 贪心算法
 * 设置：当前值，最大和，之前和，当前和
 * 如果之前和小于0，则当前和为当前值
 * 如果之前和大于0，则当前和为当前值加之前和
 * 如果当前和大于之前和，则最大和等于当前和
 */

public class Solution_2 {
    public int maxSubArray(int[] nums){
        int currentSum = nums[0];
        int beforeSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(beforeSum <= 0){
                currentSum = nums[i];
            }else{
                currentSum = beforeSum + nums[i];
            }
            maxSum = Math.max(maxSum, currentSum);
            beforeSum = currentSum;
        }
        return maxSum;

    }


}
