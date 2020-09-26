package Written_Examination.WuBaTongCheng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three {

    /**
     * 翻译组合数
     * @param num int整型 数字加密报文
     * @return int整型
     */
    public int translateNum (int num) {
        // write code here
        String str = String.valueOf(num);
        // 将该字符串的所有子串求出来，然后计算其中的最大值和最小值的差不大于25
        return 0;

    }

    public static void main(String[] args){
        String[] strarr = {"1","2","1","5","8"};
        List<String> list = Arrays.asList(strarr);
        List<List<String>> lists = splitArr(list, 2);
        for(List<String> list1 : lists){
            for(String ss : list1){
                System.out.print(ss + " ");
            }
            System.out.println("----------------");
        }
    }

    public static List<List<String>> splitArr(List<String> list, int splitSize){
        int len = list.size();
        int count = (len % splitSize == 0) ? (len / splitSize) : (len / splitSize + 1);

        List<List<String>> rows = new ArrayList<>();

        for(int i = 0; i < count; i++){
            int index = i * splitSize;
            List<String> cols = new ArrayList<>();
            int j = 0;
            while(j < splitSize && index < len){
                cols.add(list.get(index++));
                j++;
            }
            rows.add(cols);
        }
        return rows;
    }

}
