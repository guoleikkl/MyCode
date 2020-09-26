package Written_Examination.TuHuYangChe;
public class One {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * calculate combination Number
     * @param r int整型
     * @param n int整型
     * @return int整型
     */
    public static int combination (int r, int n) {
        // write code here

        long res = (r >= n) ? factorial(r) / factorial(r - n) / factorial(n) : 0;
        return (int)res;

//        long factorial_r = factorial(r);
//        long factorial_n = factorial(n);
//        long factorial_n_r = factorial(n - r);
//
//        long res = factorial_n / (factorial_r * factorial_n_r);
//        return (int)res;


    }

    private static long factorial(int n){
        return (n > 1) ? n * factorial(n - 1) : 1;
    }

//    public static long factorial(int num){
//        long factorial_num = 1L;
//        for(int i = 1; i <= num; i++){
//            factorial_num *= i;
//        }
//        return factorial_num;
//    }

    public static void main(String[] args){
        System.out.println(combination(3,4));
    }
}
