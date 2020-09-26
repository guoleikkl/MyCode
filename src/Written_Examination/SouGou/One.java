package Written_Examination.SouGou;

import java.util.Arrays;

public class One {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回能交换奖品的最大数量
     * @param a int整型
     * @param b int整型
     * @param c int整型
     * @return int整型
     */
    public static int numberofprize (int a, int b, int c) {
        // write code here
        int[] nums = new int[3];
        nums[0] = a;
        nums[1] = b;
        nums[2] = c;

        Arrays.sort(nums);

        int result = nums[0];
        nums[1] = nums[1] - nums[0];
        nums[2] = nums[2] - nums[0];
        nums[0] = 0;

        while(true){

            if((nums[1] != 1 && nums[2] == 1) || (nums[1] ==0 && nums[2] < 4)){
                break;
            }
            else if(nums[1] == 0 && nums[2] < 5){
                return result;
            }
            else if(nums[1] == 0 && nums[2] > 5){
                nums[2] = nums[2] - 5;
                result++;
            }
            else if(nums[1] > 0 && nums[2] >= nums[1] + 2){
                nums[2] = nums[2] - 3;
                nums[1]--;
                result++;
            }
            else if(nums[1] > 0 && nums[2] >= nums[1] && nums[2] < nums[1] + 2 ){
                nums[1] = nums[1] - 2;
                nums[2] = nums[2] - 2;
                result++;
            }
        }


        return result;

    }

    public static void main(String[] args){
        System.out.println(numberofprize(0,0,6));
    }

}
