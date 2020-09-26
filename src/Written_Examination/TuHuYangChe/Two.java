package Written_Examination.TuHuYangChe;

public class Two {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param array1 int整型一维数组
     * @param n int整型
     * @param array2 int整型一维数组
     * @param m int整型
     * @return int整型一维数组
     */

//    public static void main(String[] args){
//        int[] arr = { 6, 5, 4, 3, 2, 1, 0};
//        arrayMerge(null, 0, arr, arr.length);
//    }

    public int[] arrayMerge (int[] array1, int n, int[] array2, int m) {
        // write code here
        // 将array2反转
        for(int i = 0; i < m / 2; i++){
            int t = array2[i];
            array2[i] = array2[m - 1 - i];
            array2[m - 1 - i] = t;
        }

        // 采用归并排序的思想将两个升序数组合成一个
        int i = 0;
        int j = 0;
        int[] result = new int[n + m];
        while(i < n && j < m){
            if(array1[i] <= array2[j]){
                result[i + j] = array1[i];
                i++;
            }else{
                result[i + j] = array2[j];
                j++;
            }
        }
        while(i < n){
            result[i + j] = array1[i];
            i++;
        }


        while(j < m){
            result[i + j] = array2[j];
            j++;
        }


        return result;



    }

}
