package LeetCode.code_97_isInterleave;

/*
 * 使用动态规划
 * 如果f(i,j)=true，则必定满足f(i-1,j)=true 或者 f(i,j-1)=true   且   s1[1]==s3[p] 或者 s2[j]==s3[p]
 */

public class Solution_2 {





    public static void main(String[] args){

        Solution_2 solution = new Solution_2();
        String s1 = "";
        String s2 = "";
        String s3 = "aadbbcbcac";

        boolean b = solution.isInterleave(s1,s2,s3);

        System.out.println(b);
    }
    public boolean isInterleave(String s1, String s2, String s3) {

        // 先设置二位数组，记录状态
        int l1 = s1.length();
        int l2 = s2.length();
        int l3 = s3.length();

        if(l1+l2 != l3){
            return false;
        }


        boolean f[][] = new boolean[l1+1][l2+1];

        f[0][0] = true;

        int p;

        for(int i = 0; i <= l1; ++i){
            for(int j = 0;j<=l2;++j){
                p=i+j-1;
                if(i>0){
                    f[i][j] = f[i][j] || (f[i-1][j] && s1.charAt(i-1) == s3.charAt(p));
                }
                if(j>0){
                    f[i][j] = f[i][j] || (f[i][j-1] && s2.charAt(j-1) == s3.charAt(p));
                }

            }


        }

        return f[l1][l2];


    }
}
