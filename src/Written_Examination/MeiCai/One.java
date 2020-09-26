package Written_Examination.MeiCai;

import java.util.ArrayList;
import java.util.Scanner;

public class One {

    public static void main(String[] args){
        // 获取键盘输入
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();

        // 分割字符串
        String[] rowelement = input.split("#");
        String[][] matrix = new String[rowelement.length][];
        for(int i = 0; i < rowelement.length; i++){
            matrix[i] = rowelement[i].split(",");
        }

        // 运行方法，得到并打印结果
        System.out.println(SpiralMatrix(matrix));

    }


    // 输入矩阵，返回顺时针读取的字符串
    private static String SpiralMatrix (String[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();// 用于保存顺时针读取结果
        int rows = matrix.length;
        int cols = matrix[0].length;
        int index = 0;
        while(rows > 2 * index && cols > 2 * index){
            addMatrix(result, matrix, rows, cols, index);
            index++;
        }

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < result.size() - 1; i++){
            res.append(result.get(i) + ",");
        }
        res.append(result.get(result.size() - 1));

        return new String(res);
    }

    private static void addMatrix(ArrayList<Integer> result, String[][] matrix, int rows, int cols, int index){

        int end1 = cols - index - 1;
        int end2 = rows - index - 1;
        for (int i = index; i <= end1; i++){
            result.add(Integer.parseInt(matrix[index][i]));
        }
        if(index < end2){
            for(int i = index + 1; i <= end2; i++){
                result.add(Integer.parseInt(matrix[i][end1]));
            }
        }
        if(index < end1 && index < end2){
            for(int i = end1 - 1; i >= index; i--){
                result.add(Integer.parseInt(matrix[end2][i]));
            }
        }
        if(index < end1 && index < end2 - 1){
            for(int i = end2 - 1; i >= index + 1; i--){
                result.add(Integer.parseInt(matrix[i][index]));
            }
        }
    }

}
