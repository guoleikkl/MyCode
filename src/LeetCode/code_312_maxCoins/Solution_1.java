package LeetCode.code_312_maxCoins;
/*
 * https://www.cnblogs.com/niuyourou/p/11964842.html
 * 分治法
 */
public class Solution_1 {

    public static void main(String[] args){
        Solution_1 ss = new Solution_1();
        int[] nums = {8,2,6,8,9,8,1,4,1,5,3,0,7,7,0,4,2,2,5};
        int max = ss.maxCoins(nums);
        System.out.println(max);
    }



    public int maxCoins(int[] nums) {

        int[] arr = new int[nums.length+2];
        arr[0] = 1;
        arr[nums.length+1] = 1;
        for(int i = 1;i<arr.length-1;i++){
            arr[i] = nums[i-1];
        }

        // 超出时间限制，加缓冲数组，减少计算次数
        int[][] buffer = new int[arr.length][arr.length];

        int max = def(arr,0,arr.length-1,buffer);

        return max;
    }

    public static int def(int[] arr,int i,int j, int[][] buffer){
        if(i+1 == j){
            return 0;
        }
        if(buffer[i][j] > 0){
            return buffer[i][j];
        }

//      int k = i+1;
        int max = 0;
        for(int k = i+1; k<j; ++k){
            int temp = def(arr,i,k,buffer) + def(arr,k,j,buffer) + arr[i]*arr[k]*arr[j];
            if(max<temp){
                max = temp;
            }
        }
        buffer[i][j] = max;
        return max;
    }
}
