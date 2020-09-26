package Written_Examination.QingYingFeiFan;
//
//public class Three {
//
//    /**
//     * 翻转字符串
//     *
//     * @param str 字符串
//     * @param k 整数
//     * @return 字符串
//     */
//    public static String reverseStr(String str, int k) throws Exception {
//        // 请在此添加代码
//        char[] ch = str.toCharArray();
//        int i = 1;
//        while(i < ch.length){
//            reverseCh(ch, i - 1, i * k - 1);
//            i = i * k * 2;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for(int j = 0; j < ch.length; j++){
//            sb.append(ch[j]);
//        }
//
//        String re = new String(sb);
//        return re;
//
//
//    }
//
//    private static void reverseCh(char[] ch, int m, int n){
//        for(int i = m; i < (m + n + 1) / 2; i++){
//            char t = ch[i];
//            ch[i]= ch[n-1];
//            ch[n-i] = t;
//        }
//    }
//
//    // 若有需要，请在此添加辅助变量、方法
//
//
//    public static void main(String[] args){
//        String s =
//    }
//
//}