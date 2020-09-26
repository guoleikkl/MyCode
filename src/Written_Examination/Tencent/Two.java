package Written_Examination.Tencent;

import java.util.*;

public class Two {

    public static void main(String[] args){

        // 获取输入
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int k = sc.nextInt();

        // 获取所有子串
        ArrayList<String> list = getSub(input);

        // 将子串按照字典序排列
        String[] result = list.toArray(new String[list.size()]);
        Arrays.sort(result);

        // 打印输出
        System.out.println(result[k - 1]);


    }

    // 获取字符串的所有子串，保存到ArrayList中
    // 同时利用Set去重
    private static ArrayList<String> getSub(String str){
        // 先找出最小的5个字符
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        ArrayList top5 = new ArrayList<String>();
        for(int i = 0; i < str.length(); i++){
            if(!top5.contains(ch[i])){
                top5.add(ch[i]);
            }
            if(top5.size() == 5){
                break;
            }
        }

        ArrayList<String> list = new ArrayList<>();
        Set<String> set = new LinkedHashSet<>();
        for(int i = 0; i < str.length(); i++){
            if(top5.contains(str.charAt(i))){
                for(int j = i + 1; j <= str.length(); j++){
                    set.add(str.substring(i, j));
                }
            }
        }
        list.addAll(set);
        return list;
    }

}
