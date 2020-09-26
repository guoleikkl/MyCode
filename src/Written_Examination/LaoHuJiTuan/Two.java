package Written_Examination.LaoHuJiTuan;

public class Two {

    public static void main(String[] args){
        String str = "1-2-3+4";
        Two tt = new Two();
        System.out.println(tt.getMaxResult(str));
    }

    /**
     *
     * @param expression string字符串
     * @return int整型
     */
    public int getMaxResult (String expression) {
        // write code here
        // 只有加减，所以只有括号前面是减号时才能更改计算结果
        int len = expression.length();
        int[][] result = new int[len][len];

        int max = getResult(expression);
        for(int i = 2; i < len; i++){
            if(Character.isDigit(expression.charAt(i))){
                if(expression.charAt(i - 1) == '-'){
                    for(int j = i + 2; j < len; j = j + 2){
                        int re = getResult(changeStr(expression, i, j));
                        if(max < re){
                            max = re;
                        }
                    }
                }
            }
        }
        return max;




    }

    private static String changeStr(String str, int a, int b){
        char[] ch = str.toCharArray();
        for(int i = a; i < b; i++){
            if(ch[i] == '-'){
                ch[i] = '+';
            }
            else if(ch[i] == '+'){
                ch[i] = '-';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ch.length; i++){
            sb.append(ch[i]);
        }
        return new String(sb);
    }

    // 计算没有括号的表达式的结果
    private static int getResult(String str){
        char[] ch = str.toCharArray();
        int result;
        if(Character.isDigit(ch[0])){
            // 开头第一个是数字，ch[1]开始判断
            result = Integer.parseInt(String.valueOf(ch[0]));
            for(int i = 1; i < ch.length; i++){
                if (ch[i] == '+'){
                    result += Integer.parseInt(String.valueOf(ch[i + 1]));
                }
                else if (ch[i] == '-'){
                    result -= Integer.parseInt(String.valueOf(ch[i + 1]));
                }
            }
        } else{
            result = 0;
            for(int i = 0; i < ch.length; i++){
                if (ch[i] == '+'){
                    result += Integer.parseInt(String.valueOf(ch[i + 1]));
                }
                else if (ch[i] == '-'){
                    result -= Integer.parseInt(String.valueOf(ch[i + 1]));
                }
            }
        }
        return result;
    }

}
