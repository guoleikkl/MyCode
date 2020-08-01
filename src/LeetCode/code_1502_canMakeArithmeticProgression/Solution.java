package LeetCode.code_1502_canMakeArithmeticProgression;
import java.util.Arrays;
/*
 * 判断能否形成等差数列
 *
 * 给你一个数字数组 arr 。
 * 如果一个数列中，任意相邻两项的差总等于同一个常数，
 * 那么这个数列就称为 等差数列 。
 * 如果可以重新排列数组形成等差数列，
 * 请返回 true ；否则，返回 false 。
 *
 * 提示：
 * 2 <= arr.length <= 1000
 * -10^6 <= arr[i] <= 10^6
 *
 * 输入：arr = [3,5,1]
 * 输出：true
 * 解释：对数组重新排序得到 [1,3,5] 或者 [5,3,1] ，
 * 任意相邻两项的差分别为 2 或 -2 ，可以形成等差数列。
 *
 * 输入：arr = [1,2,4]
 * 输出：false
 * 解释：无法通过重新排序得到等差数列。
 */

/*
 * 从小到大进行排序得到新数组
 * 判断新数组是否为等差数列
 *
 */



public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        // 对数组进行排序
        int t;
        int[] arr2 = selectionSort(arr);

        // 检查是否是等差数列
        if(arr2.length<=2){
            return true;
        }else{
            int value = arr2[1] - arr2[0];
            boolean bb = true;
            for(int i =1;i<arr2.length-1;i++){
                if(arr2[i+1]-arr2[i] != value){
                    bb = false;
                }
            }
            return  bb;

        }
    }

    public static int[] selectionSort(int[] array){
        int[] arr = array.clone();
        int flag = 0;   // 用来存储最小值的位置
        //int where = 0;  // 用来存储未排序数组的位置

        for(int i =0; i<arr.length; ++i){
            flag = i;
            for(int j = i+1; j<arr.length;++j){
                if(arr[flag] > arr[j]){
                    flag = j;
                }
            }
            if(flag != i){
                swap(arr,flag,i);
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int flag,int i){
        int t = arr[flag];
        arr[flag] = arr[i];
        arr[i] = t;
    }

}
