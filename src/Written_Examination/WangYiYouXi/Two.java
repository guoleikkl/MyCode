package Written_Examination.WangYiYouXi;

public class Two {

    public static void main(String[] args){
        String ss = compress("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBeeeeeeeeeeFYHHnjHAPQQc");
        System.out.println(ss);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 使用题目中描述的方法，将 raw_str 压缩后返回
     * @param raw_str string字符串 未压缩的原始字符串
     * @return string字符串
     */
    public static String compress (String raw_str) {
        // write code here
        StringBuilder result = new StringBuilder();

        // 双指针法，求出连续相同字符的起点和重点
        int i = 0;
        while(i < raw_str.length()){
            int j = i + 1;
            while(j < raw_str.length()){
                if(raw_str.charAt(i) == raw_str.charAt(j)){
                    j++;
                }else{
                    break;
                }
            }
            if(j - i < 4){
                appendString(raw_str, result, i, j);
                i = j;
                continue;
            }else{
                compress_append(raw_str.charAt(i), result, i, j);
                i = j;

            }
        }
        String str = new String(result);
        return str;
    }

    // 未压缩的情况
    private static void appendString(String str, StringBuilder result, int i, int j){
        while(i < j){
            result.append(str.charAt(i++));
        }
    }

    // 有压缩的情况
    private static void compress_append(char ch, StringBuilder result, int i, int j){
        // 如果j - i > 55
        // 则直接压缩55个，直到少于55个
        while(j - i > 55){
            result.append('0');
            result.append('Z');
            result.append(ch);
            i = i + 55;
        }
        // 少于55个的情况
        result.append('0');
        int m = (int)'a';
        m = m + (j - i) - 4;
        result.append((char)m);
        result.append(ch);
    }

}
