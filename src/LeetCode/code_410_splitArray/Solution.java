package LeetCode.code_410_splitArray;

/*
 * 给定一个非负整数数组和一个整数 m，
 * 你需要将这个数组分成 m 个非空的连续子数组。
 * 设计一个算法使得这 m 个子数组各自和的最大值最小。
 *
 * 注意:
 * 数组长度 n 满足以下条件:
 * 1 ≤ n ≤ 1000
 * 1 ≤ m ≤ min(50, n)
 *
 * 示例:
 * 输入:
 * nums = [7,2,5,10,8]
 * m = 2
 * 输出:
 * 18
 * 解释:
 * 一共有四种方法将nums分割为2个子数组。
 * 其中最好的方式是将其分为[7,2,5] 和 [10,8]，
 * 因为此时这两个子数组各自的和的最大值为18，在所有情况中最小。
 */

/*
 *
 */


// 算法设计问题  出错

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public int splitArray(int[] nums, int m) {



        // 先判断特殊情况
        if(m == 1){
            int sum=0;
            for(int i = 0;i<nums.length;i++){
                sum+=nums[i];
            }
            return sum;
        }

        if(m==nums.length){
            int max = 0;
            for(int i = 0;i<nums.length;i++){
                if(max<nums[i]){
                    max = nums[i];
                }
            }
            return max;
        }


        int left = 0;
        int rigth = nums.length-1;

        int[] result = null;

        for(int i=1;i<m;i++){

            int[] rre = splitTwo(nums,left,rigth);
            if(rre!=null){
                result = rre;
            }


            if(result[1] == -1){
                rigth = result[0]-1;
            }
            else if(result[1] == 1){
                left = result[0];
            }



        }


        return result[2];
    }


    public static void swap(int a,int b){
        int t = a;
        a = b;
        b = t;
    }

    // 采用双指针法，将一个数组分成两部分,返回位置 和 最小值
    // result[0] 保存的是数组分割的位置
    // result[1] 保存的是左边最小还是右边最小 -1左边，+1右边
    // result[2] 保存的是最小和
    public static int[] splitTwo(int nums[],int left,int right){

        if(right<left){
            return null;
        }

        int[] result = new int[3];

        int suml = nums[left];
        int sumr = nums[right];

        while(left < right){
            if(suml > sumr){
                right--;
                sumr+=nums[right];
            }
            else if(suml <= sumr){
                left++;
                suml+=nums[left];
            }
        }

        result[0] = left;
        result[1] = (suml>=sumr ? 1 : -1);
        result[2] = (suml>=sumr ? sumr : suml);

        return result;

    }


    public static void main(String[] args){
        int[] arr = new int[]{2,3,1,2,4,3};
        //int[] result = splitTwo(arr,0,0);
        Solution ss = new Solution();
        int nu = ss.splitArray(arr,2);
        System.out.println(nu);
//        System.out.println(result[0]);
//        System.out.println(result[1]);
//        System.out.println(result[2]);

    }
}
