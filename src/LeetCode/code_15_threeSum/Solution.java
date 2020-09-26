package LeetCode.code_15_threeSum;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
给你一个包含 n 个整数的数组 nums，
判断 nums 中是否存在三个元素 a，b，c ，
使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
注意：答案中不可以包含重复的三元组。

示例：
给定数组 nums = [-1, 0, 1, 2, -1, -4]，
满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
/*
 * 题解 双指针
 */

/*
 * 要注意数字的顺序
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        int len = nums.length;

        if(nums == null || len < 3){
            return ans;
        }

        Arrays.sort(nums);

        for(int i = 0; i < len; i++){
            // 如果当前数组大于0，则三数之和等于0不可能成立
            if(nums[i] > 0){
                break;
            }
            // 去重
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i + 1;
            int right = len - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 去重
                    while(left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                }
                else if(sum < 0){
                    left++;
                }
                else if(sum > 0){
                    right--;
                }
            }
        }
        return ans;



    }

}
