package LeetCode.code_167_twoSum;

/*
 * 双指针法
 */

public class Solution_2 {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left<=right){
            int result = numbers[left]+numbers[right];
            if(result > target){
                right--;
            }
            else if(result <target ){
                left++;
            }
            else if(result == target){
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{-1,-1};
    }
}
