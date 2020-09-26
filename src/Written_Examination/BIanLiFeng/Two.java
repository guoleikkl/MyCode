package Written_Examination.BIanLiFeng;

import java.util.Scanner;

public class Two {
    static char[][] matrix = {
            {'0', '1', 'C', 'H', 'A'},
            {'9', 'E', '7', 'B', 'I'},
            {'K', 'D', '4', '8', 'J'},
            {'6', '5', 'F', 'G', 'O'},
            {'L', 'N', 'M', '2', '3'}
    };
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

//        ArrayList<String> input = new ArrayList<>();
        while (sc.hasNextLine()){
            String ss = sc.nextLine();
            if(!ss.equals("")){
//                input.add(ss);
                solution(ss);
            }else{
                break;
            }
        }

//        for(String str : input){
//            System.out.println(str);
//            solution(str);
//        }


    }

    private static void solution(String str){
        // 遍历找到str第一个字母，然后深度优先搜索
        char[] arr = str.toCharArray();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == arr[0]){
                    // 找到了第一个字符的位置
                    int where = 1;
                    if(arr.length > 1){
                        boolean b = dfs(i, j, arr, where);
                        if(b == true){
                            System.out.println("Y");
                            return;
                        }else{
                            System.out.println("N");
                            return;
                        }
                    }else{
                        System.out.println("Y");
                        return;
                    }
                }
            }
        }
        System.out.println("N");
        return;

    }

    private static boolean dfs(int i, int j, char[] arr, int where){
        if(where == arr.length){
            return true;
        }
        char a = arr[where];

        if (i > 0){
            if(matrix[i - 1][j] == a){
                where++;
                return dfs(i - 1, j, arr, where);
            }
        }
        if(i < matrix.length - 1){
            if(matrix[i + 1][j] == a){
                where++;
                return dfs(i + 1, j, arr, where);
            }

        }
        if(j > 0){
            if(matrix[i][j - 1] == a){
                where++;
                return dfs(i, j - 1, arr, where);
            }
        }
        if(j < matrix.length - 1){
            if(matrix[i][j + 1] == a){
                where++;
                return dfs(i, j + 1, arr, where);
            }

        }

        return false;
    }

}
