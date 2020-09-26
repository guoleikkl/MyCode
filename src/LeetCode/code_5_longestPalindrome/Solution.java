package LeetCode.code_5_longestPalindrome;

/*
给定一个字符串 s，找到 s 中最长的回文子串。
你可以假设 s 的最大长度为 1000。

示例 1：
输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
 */
public class Solution {

    public String longestPalindrome(String s) {

//        if(s.equals("")){
//            return "";
//        }
        if(s.length() <= 1){
            return s;
        }

        char[] ch = s.toCharArray();

        int maxlen = 0;
        int maxleft = 0;
        int maxright = 0;

        Solution sss = new Solution();

        for(int i = 0; i < ch.length; i++){
            for(int j = i + 1; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    if(sss.isPalindrome(ch, i+1, j-1)){
                        if(maxlen < j - i){
                            maxlen = j - i;
                            maxleft = i;
                            maxright = j;
                        }
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i = maxleft; i <= maxright; i++){
            result.append(ch[i]);
        }

        return result.toString();



    }

    // 判断子串是否是回文串
    private boolean isPalindrome(char[] ch, int left, int right) {

        while(left < right){
            if(ch[left] != ch[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
