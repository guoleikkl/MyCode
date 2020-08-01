package LeetCode.code_97_isInterleave;


/*
 * 交错字符串
 * 给定三个字符串 s1, s2, s3, 验证 s3 是否是由 s1 和 s2 交错组成的
 *
 * 输入: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * 输出: true
 *
 * 输入: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 * 输出: false
 */

/*
 * 将三个字符串作为栈，每次s3弹出一个字符，检查s1和s2最上面的字符
 * 特殊情况：
 *  如果s1和s2都符合，
 *
 * 将s3中的s1全部抽出，剩下的如果和s2一样，则成立
 */

class Solution {

    public static void main(String[] args){

        Solution solution = new Solution();
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";

        boolean b = solution.isInterleave(s1,s2,s3);

        System.out.println(b);
    }



    public boolean isInterleave(String s1, String s2, String s3) {

        // 将s1和s3变为char[]
        char[] c1 = s1.toCharArray();
        char[] c3 = s3.toCharArray();

        char[] cc = new char[c3.length];    // 用于保存剩余的字符
        int cnum = 0;

        int t = 0;  // 保存c1的开头

        // 遍历s3，将和s1相同的字符删去
        for( int i = 0; i < c3.length; i++ ) {
            if( t<c1.length && c3[i] == c1[t]){
                System.out.println("i="+i+"  t="+t);
                t++;
            } else {
                System.out.println("i="+i+"  cnum="+cnum);
                cc[cnum] = c3[i];
                cnum++;
            }

        }


        // 将得到的cc和s2进行对比
        String str = String.valueOf(cc);

        System.out.println("str: "+str);

        if(str.equals(s2)){
            return true;
        }else{
            return false;
        }


    }
}