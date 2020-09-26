package Written_Examination.LaoHuJiTuan;
public class One {
    /**
     *
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] reOrderArray (int[] array) {
        // write code here
        // 遍历数组 将奇偶数分别取出 最后整合
        int[] odd = new int[array.length];
        int[] even = new int[array.length];
        int odd_num = 0;
        int even_num = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                // 为奇数
                odd[odd_num] = array[i];
                odd_num++;
            } else {
                // 为偶数
                even[even_num] = array[i];
                even_num++;
            }
        }

        // 整合
        int[] result = new int[array.length];
        for(int i = 0; i < odd_num; i++){
            result[i] = odd[i];
        }
        for(int i = 0; i < even_num; i++){
            result[i + odd_num] = even[i];
        }

        return result;

    }
}