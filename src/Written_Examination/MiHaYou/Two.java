//package Written_Examination.MiHaYou;
//
//
//// 匹配字符串
//// 正则
//
//import java.util.Scanner;
//
//public class Two {
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
//
//        System.out.println(matchString(str1, str2));
//
//
//    }
//
//    private static boolean matchString(String str1, String str2){
//        int rows = str1.length();
//        int cols = str2.length();
//
//        boolean[][] dp = new boolean[rows + 1][cols + 1];
//
//        dp[0][0] = true;
//
//        for(int j = 1; j <= cols; j++){
//
//        }
//
//
//
//
////        int m = str1.length();
////        int n = str2.length();
////
////        boolean[][] f = new boolean[m + 1][n + 1];
////        f[0][0] = true;
////        for(int i = 0; i <= m; i++){
////            for(int j = 1; j <= n; j++){
////                if(str2.charAt(j - 1) == '*'){
////                    f[i][j] = f[i][j - 2];
////                    if(judge(str1, str2, i, j)){
////                        f[i][j] = f[i][j] || f[i - 1][j];
////                    }
////                }else{
////                    if(judge(str1, str2, i, j)){
////                        f[i][j] = f[i - 1][j - 1];
////                    }
////                }
////            }
////        }
////        return f[m][n];
//    }
//
//    private static boolean judge(String str1, String str2, int i, int j){
//        if(i == 0){
//            return false;
//        }
//
//        if(str2.charAt(j - 1) == '.'){
//            return true;
//        }
//
//        return str1.charAt(i - 1) == str2.charAt(j - 1);
//    }
//
//}
