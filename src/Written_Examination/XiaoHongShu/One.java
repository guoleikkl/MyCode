package Written_Examination.XiaoHongShu;

import java.util.ArrayList;
import java.util.Scanner;

public class One {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int findMin(int[] tree) {
        int max = tree[0];
        int min = tree[0];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < tree.length; i++){
            if(max < tree[i])
                max = tree[i];
            if(min > tree[i])
                min = tree[i];
            list.add(tree[i]);
        }
        if(min > 1){
            return 1;
        }else{
            int i = 2;
            while(i <= max + 1){
                if(!list.contains(i)){
                    break;
                }
            }
            return i;
        }




    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _tree_size = 0;
        _tree_size = Integer.parseInt(in.nextLine().trim());
        int[] _tree = new int[_tree_size];
        int _tree_item;
        for(int _tree_i = 0; _tree_i < _tree_size; _tree_i++) {
            _tree_item = Integer.parseInt(in.nextLine().trim());
            _tree[_tree_i] = _tree_item;
        }

        res = findMin(_tree);
        System.out.println(String.valueOf(res));

    }
}
