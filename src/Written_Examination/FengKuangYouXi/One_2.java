package Written_Examination.FengKuangYouXi;

import java.util.Scanner;

public class One_2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(getStr(input));
    }

    private static String getStr(String string){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            if(Character.isDigit(string.charAt(i))){
                int j = i;
                for( ; j < string.length(); j++){
                    if(!Character.isDigit(string.charAt(j))){
                        break;
                    }
                }
                int n = Integer.parseInt(string.substring(i, j));

                // 从末尾找']'
                // 将  [ ] 之间的字符串再次进行判断
                int end = string.length() - 1;
                while(string.charAt(end) != ']'){
                    end--;
                }
                String str = getStr(string.substring(j + 1, end));
                addStr(result, n, str);
                i = end;
            }else{
                result.append(string.charAt(i));
            }
        }
        return result.toString();
    }

    private static void addStr(StringBuilder result, int n, String str){
        for(int i = 0; i < n; i++){
            result.append(str);
        }
    }

}
