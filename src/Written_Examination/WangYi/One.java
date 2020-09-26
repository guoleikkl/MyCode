package Written_Examination.WangYi;


/*
 * 每个数可以分为 2*n+3*m
 * m和n可以为0
 */

import java.util.Scanner;

public class One {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        long[] nums = new long[len];
        for(int i = 0; i < len; i++) {
            nums[i] = sc.nextLong();
        }

        long result = 0;
        for(long i : nums) {
            result += splitnum(i);
        }
        System.out.println(result);
    }

    public static long splitnum(long num) {
        if(num == 1) {
            return 0;
        }
        else if(num <= 3) {
            return 1;
        }

        // 分为奇数偶数
        if(num%2 == 1) {
            // 奇数
            return ((num-3)/2)+1;
        } else {
            // 偶数
            return num/2;
        }
    }
}
