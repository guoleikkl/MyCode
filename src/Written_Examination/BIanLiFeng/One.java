package Written_Examination.BIanLiFeng;

import java.util.Scanner;

public class One {

    public static void main(String[] args){

        // 获取输入
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        String[] strWidths = sc.nextLine().split(",");
        String[] strValues = sc.nextLine().split(",");
        int[] widths = new int[strWidths.length];
        int[] values = new int[strValues.length];
        for(int i = 0; i < strWidths.length; i++){
            widths[i] = Integer.parseInt(strWidths[i]);
            values[i] = Integer.parseInt(strValues[i]);
        }


        // 得到结果
        int result = layout(length, widths, values);

        System.out.println(result);


    }

    //背包问题解决过程
    public static int layout(int length, int[] widths, int[] values){

        int num = widths.length;
        int tmp[][] = new int[num + 1][length + 1];
        for(int i = 0; i < num + 1; i++){
            tmp[i][0] = 0;
        }
        for(int j = 0; j < length + 1; j++){
            tmp[0][j] = 0;
        }

        for(int i = 1; i < num + 1; i++){
            for(int j = 1; j < length + 1; j++){
                if(widths[i - 1] <= j){
                    if(tmp[i - 1][j] < (tmp[i - 1][j - widths[i - 1]] + values[i - 1])){
                        tmp[i][j] = tmp[i - 1][j - widths[i - 1]] + values[i - 1];
                    }else{
                        tmp[i][j] = tmp[i - 1][j];
                    }
                }else{
                    tmp[i][j] = tmp[i - 1][j];
                }
            }
        }

        return tmp[num][length];
    }

    // 计算过程
    // 01背包问题
//    public static int layout(int length, int[] widths, int[] values){
//
//        int num = widths.length;  // 数量
//        int[] new_widths = new int[num + 1];
//        int[] new_values = new int[num + 1];
//
//        // flag[i][j] = 1：表示商品i放入了货架
//        int[][] flag = new int[num + 1][length + 1];
//        for(int i = 1; i < num + 1; i++){
//            new_widths[i] = widths[i - 1];
//            new_values[i] = values[i - 1];
//        }
//
//        int[] value2 = new int[length + 1];
//
//        for(int i = 1; i < num + 1; i++){
//            for(int t = length; t >= new_widths[i]; t--){
//                if(value2[t] < value2[t - new_widths[i]] + new_values[i]){
//                    value2[t] = value2[t - new_widths[i]] + new_values[i];
//                    flag[i][t] = 1;
//                }
//            }
//        }
//
//        int sum = 0;
//        int i = num;
//        int j = length;
//        while(i > 0){
//            if(flag[i][j] == 1 && i != 0){
//                sum += values[i - 1];
//                j -= new_widths[i];
//            }
//            i--;
//        }
//        return sum;
//    }

}

