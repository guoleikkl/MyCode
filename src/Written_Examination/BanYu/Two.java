package Written_Examination.BanYu;

public class Two {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 移动的次数
     * @param m int整型
     * @param n int整型
     * @param k int整型
     * @return int整型
     */
    public int movingCount (int m, int n, int k) {
        // write code here
        if(k < 0 || m <= 0 || n <= 0){
            return 0;
        }

        int res = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(addNum(i, j) <= k){
                    res++;
                }else{
                    break;
                }
            }
        }

//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                if(addNum(i, j) <= k){
//                    res++;
//                }
//            }
//        }
        return res;


    }

    // 计算两个数的数位之和
    private static int addNum(int a, int b){
        int sum = 0;
        while(a > 0){
            sum += a % 10;
            a = a / 10;
        }
        while(b > 0){
            sum += b % 10;
            b = b / 10;
        }
        return sum;
    }

}
