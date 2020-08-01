package LeetCode.code_167_twoSum;

/*
 * 用二分查找法
 */



public class Solution_1 {
    public int[] twoSum(int[] numbers, int target) {

        //int result;
        //int[] re = new int[2];
        //int left;
        //int right;
        //int mid;
        for(int i = 0;i < numbers.length; ++i){
            int result = target - numbers[i];

            int left = i+1;
            int right = numbers.length-1;

            while(left<=right){
                int mid = (left+right) >> 1;
                if(result < numbers[mid]){
                    right = mid-1;
                }
                else if(result > numbers[mid]){
                    left = mid+1;
                }
                else if(result == numbers[mid]){
                    return new int[]{i,mid};
                }
            }

        }

        return new int[]{-1, -1};

    }
}
