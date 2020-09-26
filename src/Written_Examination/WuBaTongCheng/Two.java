package Written_Examination.WuBaTongCheng;

public class Two {
    /**
     *
     * @param a int整型
     * @param b int整型
     * @return int整型
     */
    public int question (int a, int b) {
        // write code here

        for(int i = 500; i > 0; i--){
            double n = Math.sqrt(i + a);
            if(n == Math.ceil(n)){
                double m = Math.sqrt(i + b);
                if(m == Math.ceil(m)){
                    return i;
                }
            }
        }

        return 0;


    }

    public static void main(String[] args){
        System.out.println(Math.sqrt(676));
    }

}
