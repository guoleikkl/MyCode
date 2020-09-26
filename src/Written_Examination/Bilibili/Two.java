package Written_Examination.Bilibili;

import java.util.ArrayList;

public class Two {



    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12}
        };
        Two t = new Two();
        int[] r = t.SpiralMatrix(matrix);
        for(int i = 0; i < r.length; i++){
            System.out.print(r[i] + " ");
        }
    }

    public int[] SpiralMatrix (int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int index = 0;
        while(rows > 2 * index && cols > 2 * index){
            addMatrix(result, matrix, rows, cols, index);
            index++;
        }

        int[] res = new int[result.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = result.get(i);
        }
        return res;

    }


    private static void addMatrix(ArrayList<Integer> result, int[][] matrix, int rows, int cols, int index){
//        int startX = index;
        int end1 = cols - index - 1;
        int end2 = rows - index - 1;
        for (int i = index; i <= end1; i++){
            result.add(matrix[index][i]);
        }
        if(index < end2){
            for(int i = index + 1; i <= end2; i++){
                result.add(matrix[i][end1]);
            }
        }
        if(index < end1 && index < end2){
            for(int i = end1 - 1; i >= index; i--){
                result.add(matrix[end2][i]);
            }
        }
        if(index < end1 && index < end2 - 1){
            for(int i = end2 - 1; i >= index + 1; i--){
                result.add(matrix[i][index]);
            }
        }
    }
}
