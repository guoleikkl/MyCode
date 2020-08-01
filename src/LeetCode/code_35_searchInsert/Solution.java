package LeetCode.code_35_searchInsert;

/*
 * 搜索插入位置
 * 给定一个排序数组和一个目标值，
 * 在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 */

/*
 * 两种情况：
 *  如果数组存在目标值
 *      直接返回值
 *  如果不存在目标值
 *      遍历搜索，找到插入位置
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {

        // 先遍历，看数组是否存在目标值
        boolean b = false;
        int where = 0;
        for( int i = 0; i < nums.length; i++ ) {
            if(target == nums[i]){
                b = true;
                where = i;
                break;
            }
        }
        // 遍历过后  检查是否存在目标值
        if( b == true){
            // 存在
            return where;
        } else {
            // 不存在
            // 遍历找到插入位置
            // 注意！！ 插入开头和末尾
            if(target<nums[0]){
                return 0;
            }else{
                for(int i=0;i<nums.length-1;i++){
                    if(target>nums[i] && target<nums[i+1]) {
                        return i+1;
                    }

                }
                return nums.length;
            }
        }

    }
}
