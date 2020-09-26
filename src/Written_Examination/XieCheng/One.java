package Written_Examination.XieCheng;

import java.util.Scanner;

// 计算组合数
public class One {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 公司员工
        int n = sc.nextInt(); // 挑选的员工数

//        System.out.println(getFactorial(20));
        System.out.println(getCombination(m, n));
    }

    // 求组合数
    private static long getCombination(int m, int n){

        long molecular = getFactorial(m);
        System.out.println(molecular);
        long denominator = getFactorial(n) * getFactorial(m - n);
        System.out.println(denominator);
        return molecular / denominator;



    }

    // 求一个数的阶乘
    private static long getFactorial(int num){
        if(num <= 1){
            return 1;
        }else{
            return getFactorial(num - 1) * num;
        }
    }

}
