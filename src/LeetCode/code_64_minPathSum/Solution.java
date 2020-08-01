package LeetCode.code_64_minPathSum;
/*
 * 给定一个包含非负整数的 m x n 网格，
 * 请找出一条从左上角到右下角的路径，
 * 使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 * 示例:
 * 输入:
 * [
 *  [1,3,1],
 *  [1,5,1],
 *  [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 */
/*
 * 动态规划法
 * 使用一个m*n的矩阵 存放结果
 *
 * result[i][j] = min(result[i-1][j] | result[i][j-1]) + grid[i][j]
 */

class Solution {

    public static void main(String[] args){

        int[][] grid = {
                {1,3,1},
                {1,5,1},
                {4,2,1},
                {3,2,1}
        };

        Solution ss = new Solution();
        int min = ss.minPathSum(grid);

        System.out.println(min);

    }


    public int minPathSum(int[][] grid) {
        // 求出矩阵的长和高
        int length = grid.length;
        int heigh = grid[0].length;

        // 新申请一个矩阵，用来存放路径和
        int[][] result = new int[length][heigh];

        // [0][0]位置初始化
        result[0][0] = grid[0][0];


        for(int i = 0; i<length; i++){
            for(int j=0;j<heigh;j++){
                if(i+j!=0){
                    if(i*j == 0){
                        if(i==0){
                            result[i][j] = result[i][j-1] + grid[i][j];
                        }
                        if(j==0){
                            result[i][j] = result[i-1][j] + grid[i][j];
                        }
                    }
                    else{
                        if(result[i-1][j] <= result[i][j-1]){
                            result[i][j] = result[i-1][j] + grid[i][j];
                        } else {
                            result[i][j] = result[i][j-1] + grid[i][j];
                        }
                    }


                }


            }
        }

        return result[length-1][heigh-1];
    }
}