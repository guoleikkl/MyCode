package Written_Examination.BanYu;

public class One {

    public static void main(String[] args){
        System.out.println(baseNeg2(3));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param N int整型
     * @return string字符串
     */
    public static String baseNeg2 (int N) {
        // write code here

        if(N == 0){
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while(N != 0){
            int rem = N % (-2);
            int qu = N / (-2);

            if(rem == -1){
                result.append(1);
            }else{
                result.append(rem);
            }

            N = qu;
            if(rem == -1){
                N++;
            }
        }
        return result.reverse().toString();
    }

}
