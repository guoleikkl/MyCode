package LeetCode.code_1189_maxNumberOfBalloons;


/*
 * 给你一个字符串 text，
 * 你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 * 字符串 text 中的每个字母最多只能被使用一次。
 * 请你返回最多可以拼凑出多少个单词 "balloon"。
 *
 * 输入：text = "loonbalxballpoon"
 * 输出：2
 */

/*
 * 统计单词里的'b''a''l''o''n'几个字母出现的次数
 * 取最小
 */

import java.util.Arrays;

public class Solution {


    public static void main(String[] args){
        String text= "balo";
        Solution ss = new Solution();

        System.out.println(ss.maxNumberOfBalloons(text));
    }


    public int maxNumberOfBalloons(String text) {

        // 将String转化为char[]
        char[] ch = text.toCharArray();

        int[] num = new int[5];
        //Arrays.fill(num,0);
        // balon  2 3

        // 统计各个字符数量
        for(int i = 0; i < ch.length; ++i) {
            switch (ch[i]){
                case 'b':
                    num[0]++;
                    break;
                case 'a':
                    num[1]++;
                    break;
                case 'l':
                    num[2]++;
                    break;
                case 'o':
                    num[3]++;
                    break;
                case 'n':
                    num[4]++;
                    break;
            }
        }

        num[2] = num[2] >> 1;
        num[3] = num[3] >> 1;

        int min = num[0];
        for(int i = 0; i < 5; ++i) {
            if(min>num[i]){
                min = num[i];
            }
        }
        return min;
    }
}
