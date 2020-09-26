package Written_Examination.WanMeiShiJie;

import java.util.Scanner;


// 01背包实现问题
public class One {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int knapsackCapacity = Integer.parseInt(input.nextLine().trim());

        String[] volumesStr = input.nextLine().split(" ");
        int[] volumes = new int[volumesStr.length];
        for (int i = 0; i < volumesStr.length; i++) {
            volumes[i] = Integer.parseInt(volumesStr[i].trim());
        }

        String[] valuesStr = input.nextLine().split(" ");
        int[] values = new int[valuesStr.length];
        for (int i = 0; i < valuesStr.length; i++) {
            values[i] = Integer.parseInt(valuesStr[i].trim());
        }

        if (volumes.length == values.length) {
            System.out.println(method(knapsackCapacity, volumes, values));
        }else {
            System.out.println("道具数量不一致。");
        }
        input.close();
    }

    public static int method(int knapsackCapacity, int[] volumes, int[] values){

        int num = volumes.length;  // 道具数量
        int[] new_volumes = new int[num + 1];
        int[] new_values = new int[num + 1];

        // flag[i][j] = 1：表示道具i放入了背包
        int[][] flag = new int[num + 1][knapsackCapacity + 1];
        for(int i = 1; i < num + 1; i++){
            new_volumes[i] = volumes[i - 1];
            new_values[i] = values[i - 1];
        }

        int[] value2 = new int[knapsackCapacity + 1];

        for(int i = 1; i < num + 1; i++){
            for(int t = knapsackCapacity; t >= new_volumes[i]; t--){
                if(value2[t] < value2[t - new_volumes[i]] + new_values[i]){
                    value2[t] = value2[t - new_volumes[i]] + new_values[i];
                    flag[i][t] = 1;
                }
            }
        }

        int sum = 0;
        int i = num;
        int j = knapsackCapacity;
        while(i > 0){
            if(flag[i][j] == 1 && i != 0){
                sum += values[i - 1];
                j -= new_volumes[i];
            }
            i--;
        }
    return sum;
    }

}
