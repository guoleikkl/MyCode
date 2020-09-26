package Written_Examination.Tencent;

import java.util.ArrayList;
import java.util.Scanner;

public class One {

    public static void main(String[] args){

        // 获取输入
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(k == 0){
            System.out.println("");
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        // 删除指定位置的节点
        list.remove(k - 1);

        // 打印输出
        for(int i = 0; i < list.size() - 1; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.get(list.size() - 1));
    }

}
