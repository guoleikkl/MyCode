package Written_Examination.Bilibili;

public class Three {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str string字符串
     * @return int整型
     */
    public static int GetFragment (String str) {
        // write code here
        int quantity = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i - 1)){
                quantity++;
            }
        }

        return str.length()/quantity;
    }
    public static void main(String[] args){
        String str = "aaabbaaacdd";
        int j = GetFragment(str);
    }
}
