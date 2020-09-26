package Written_Examination.MiHaYou;

import java.util.Scanner;

public class One {

    private static final int char_A = 'A';
    private static final int char_Z = 'Z';
    private static int where = char_A;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        char[][] matrix = new char[M][N];

        SpiralMatrix(matrix, M, N);

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }


    }

    private static void SpiralMatrix (char[][] matrix, int rows, int cols) {

        int index = 0;
        while(rows > 2 * index && cols > 2 * index){
            addMatrix(matrix, rows, cols, index);
            index++;
        }

    }

    private static void addMatrix(char[][] matrix, int rows, int cols, int index){

        int end1 = cols - index - 1;
        int end2 = rows - index - 1;
        for (int i = index; i <= end1; i++){
            matrix[index][i] = (char)where;
            where++;
            if(where == char_Z + 1){
                where = char_A;
            }

        }
        if(index < end2){
            for(int i = index + 1; i <= end2; i++){
                matrix[i][end1] = (char)where;
                where++;
                if(where == char_Z + 1){
                    where = char_A;
                }
            }
        }
        if(index < end1 && index < end2){
            for(int i = end1 - 1; i >= index; i--){
                matrix[end2][i] = (char)where;
                where++;
                if(where == char_Z + 1){
                    where = char_A;
                }
            }
        }
        if(index < end1 && index < end2 - 1){
            for(int i = end2 - 1; i >= index + 1; i--){
                matrix[i][index] = (char)where;
                where++;
                if(where == char_Z + 1){
                    where = char_A;
                }
            }
        }
    }

}
