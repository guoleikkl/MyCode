package LeetCode.code_10_isMatch;

// 运行错误


/*
给你一个字符串 s 和一个字符规律 p，
请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
'.' 匹配任意单个字符
'*' 匹配零个或多个前面的那一个元素
所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
说明:
s 可能为空，且只包含从 a-z 的小写字母。
p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。

示例 1:
输入:
s = "aa"
p = "a"
输出: false
解释: "a" 无法匹配 "aa" 整个字符串。

示例 2:
输入:
s = "aa"
p = "a*"
输出: true
解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。

示例 3:
输入:
s = "ab"
p = ".*"
输出: true
解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。

示例 4:
输入:
s = "aab"
p = "c*a*b"
输出: true
解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。
 */

/*
 * 两个指针指向两个字符数组的开始
 * 比较两个指针指向的字符，先判断p指针指向的字符的后一个字符是不是 *  注意数组越界
 *  如果后面不是*
 *      如果两个字符不相等，false
 *      如果两个字符相等，两个指针都向后移动一位
 *  如果后面是*
 *      如果两个字符不相等，p指针向后移动两位
 *      如果两个字符相等，s指针向后移动一位
 */
/*
 * 如果两个字符最后都没有剩余，则匹配成功
 * 如果s没有剩余，且p剩余的字符都有*修饰，则匹配成功
 */
public class Solution {

    public static void main(String[] args){
        String s = "aaa";
        String p = "a*a";
        Solution sss = new Solution();
        boolean b = sss.isMatch(s, p);
        System.out.println(b);
    }

    public boolean isMatch(String s, String p) {

        char[] chs = s.toCharArray();
        char[] chp = p.toCharArray();

        // s为空的情况
        if(chs.length == 0){
            // 如果p为空 或者 p的长度为偶数且偶数位都是* true
            if(chp.length == 0){
                return true;
            }
            else if(chp.length%2 == 0){
                for(int i = 0; i < chp.length; i++){
                    if(i%2 == 1){
                        if(chp[i] != '*'){
                            return false;
                        }
                    }
                }
                return true;
            }
            else{
                return false;
            }
        }

        // p为空的情况
        // 前面已经判断过s为空的情况
        // 所以s不为空，p为空一定匹配不成功
        if(chp.length == 0){
            return false;
        }

        // 两个字符串都不为空的情况
        int i = 0;  // 指定s的指针
        int j = 0;  // 指向p的指针
        while(i < chs.length && j < chp.length){

            // 先判断当前p指针指向的字符后面是否为*
            if(j < chp.length - 1 && chp[j + 1] == '*'){
                // 是*
                // 判断当前字符是否是.
                if(chs[i] == chp[j] || chp[j] == '.'){
                    i++;
                }else{
                    j = j + 2;
                }

            }else{
                // 不是*
                // 判断是否是 .
                if(chs[i] == chp[j] || chp[j] == '.'){
                    i++;
                    j++;
                }else{
                    return false;
                }

            }
        }

        // i 和 j 至少有一个到达了字符数组尾部
        if(i < chs.length - 1){
            return false;
        }
        else if(i == chs.length){
            if(j == chp.length){
                // chp无剩余
                return true;
            }
            else if((chp.length - j) % 2 == 0){
                // chp有剩余
                j++;
                while(j < chp.length){
                    if(chp[j] != '*'){
                        return false;
                    }
                    j = j + 2;
                }
                return true;


            }else{
                return false;
            }
        }else {
            return false;
        }
    }
}
