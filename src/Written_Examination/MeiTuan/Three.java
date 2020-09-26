package Written_Examination.MeiTuan;

import java.util.Scanner;

public class Three {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int[] order = new int[n];

        for(int i = 0; i < n; i++){
            w[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            order[i] = sc.nextInt() - 1;
        }

        for(int i = 0; i < n; i++){
            System.out.println(solution(w, order[i]));
        }
    }

    // 输入数组和取数的位置
    // 输出两遍重量和最大的一堆
    // 并将取数的位置的元素变为0
    private static long solution(int[] w, int where){
        // 将where位置的元素置为0
        w[where] = 0;

        // 计算左边的值
        long left = 0L;
        for(int i = 0; i < where; i++){
            left += (long)w[i];
        }

        // 计算右边的值
        long right = 0L;
        for(int i = w.length-1; i > where; i--){
            right += (long)w[i];
        }
        // 返回最大值
        return Math.max(left, right);
    }

}
