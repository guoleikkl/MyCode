package LeetCode.code_3_lengthOfLongestSubstring;


/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:
输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */

import java.util.HashSet;
import java.util.Set;

/*
 * 暴力法
 * 每个字符为起点寻找一遍
 */
public class Solution {

    public static void main(String[] args){
        String s = " ";
        Solution ss = new Solution();
        int re = ss.lengthOfLongestSubstring(s);
        System.out.println(re);
    }

    public int lengthOfLongestSubstring(String s) {
        if(s == null){
            return 0;
        }

        char[] input = s.toCharArray();

        int maxlen = 0; // 用来存储最长子串的长度
        for(int i = 0; i < input.length; i++){

//            Map<Character, Integer> map = new HashMap<>();
            Set<Character> set = new HashSet<>();
            int len = 0;
            for(int j = i; j < input.length; j++){

                if(!set.contains(input[j])){
                    set.add(input[j]);
                    len++;
                }else{
                    break;
                }
            }
            if(len > maxlen){
                maxlen = len;
            }

        }

        return maxlen;

    }

}
