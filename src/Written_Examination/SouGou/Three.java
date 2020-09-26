package Written_Examination.SouGou;

import java.util.HashSet;
import java.util.Set;

public class Three {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回生成的新密码个数
     * @param password string字符串 密码的数组字符串（长度小于50），例如 12345
     * @return long长整型
     */
    public static long getPasswordCount (String password) {
        // write code here
        int[] nums = new int[password.length()];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(String.valueOf(password.charAt(i)));
        }

        Set<String> set = new HashSet<>();

        set.add(password);
        for(int i = 0; i < 10; i++){
            String str = "";
            str = str + String.valueOf(i);
            solution(nums, str, set);
        }
        return set.size() - 1;


    }

    private static void solution(int[] nums, String str, Set<String> set){
        if(str.length() == nums.length){
            //String ss = str.substring(1, str.length() );
//            System.out.println(str);
//            set.add(str.substring(1, str.length() - 1));
            set.add(str);
            return;
        }
        double tmp = (Double.parseDouble(String.valueOf(str.charAt(str.length() - 1))) + (double)nums[str.length()]) / 2;
        if(tmp - Math.floor(tmp) == 0){
            str = str + String.valueOf((int)tmp);
            solution(nums, str, set);
        } else {
            solution(nums, str + String.valueOf((int)Math.floor(tmp)), set);
            solution(nums, str + String.valueOf((int)Math.ceil(tmp)), set);
        }
    }

    public static void main(String[] args){
        System.out.println(getPasswordCount("123"));
    }

}
