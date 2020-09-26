package Written_Examination.Bilibili;

public class One {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param arr int整型一维数组
     * @param k int整型 允许0变为1的个数
     * @return int整型
     */
    /*
     * 从头开始遍历，没遇到一个0，k--，遇到1不变
     */
    public static int GetMaxConsecutiveOnes (int[] arr, int k) {
        // write code here
        // 从头开始遍历，没遇到一个0，k--，遇到1不变
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            int mark = k;
            int len = 0;
            for(int j = i; j < arr.length; j++){
                if(mark < 0){
                    break;
                }
                if(arr[j] == 0){
                    mark--;
                }
                len++;
            }
            if(mark < 0){
                len--;
            }
            if(max < len){
                max = len;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int res = GetMaxConsecutiveOnes(arr, k);
        System.out.println(res);
    }
}
//0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1
//1,1,1,0,0,0,1,1,1,1,0