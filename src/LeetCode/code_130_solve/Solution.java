package LeetCode.code_130_solve;

/*
 * 根据官方题解
 * 深度优先遍历
 * 先将外围的O替换为A
 * 在将所有内层的O换为X
 * 再将所有的A换为O
 */

public class Solution {



    public static void main(String[] args){
        char[][] board = {{'X','O','X','O','X','O'},{'O','X','O','X','O','X'},{'X','O','X','O','X','O'},{'O','X','O','X','O','X'}};

        Solution so = new Solution();
        so.solve(board);

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }

    }

    public void solve(char[][] board) {

        // 排除最简单的情况 行或者列小于3行  不需要转换
        if(board.length < 3){
            return;
        }
        if(board[0].length < 3){
            return;
        }

        // 遍历矩阵边界，将边界的O换为A
        // 并深度优先搜索所有和边界O相邻的O 替换为A
        for(int i = 0; i < board.length; i++){
            if(board[i][0] == 'O'){
                board[i][0] = 'A';
                dfs(board, i, 0);
            }
            if(board[i][board[0].length-1] == 'O'){
                board[i][board[0].length-1] = 'A';
                dfs(board, i, board[0].length-1);
            }
        }

        for(int i = 1; i < board[0].length -1; i++){
            if(board[0][i] == 'O'){
                board[0][i] = 'A';
                dfs(board, 0, i);
            }
            if(board[board.length-1][i] == 'O'){
                board[board.length-1][i] = 'A';
                dfs(board, board.length-1, i);
            }
        }

        // 将所有的内部O换为X
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

        // 将所有的A换为O
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'A'){
                    board[i][j] = 'O';
                }
            }
        }

    }

    private static void dfs(char board[][], int a, int b){
        if( a > 0){
            if(board[a-1][b] == 'O'){
                board[a-1][b] = 'A';
                dfs(board, a-1, b);
            }
        }

        if( a < board.length-1){
            if(board[a+1][b] == 'O'){
                board[a+1][b] = 'A';
                dfs(board, a+1, b);
            }
        }

        if( b > 0){
            if(board[a][b-1] == 'O'){
                board[a][b-1] = 'A';
                dfs(board, a, b-1);
            }
        }

        if( b < board[0].length - 1){
            if(board[a][b+1] == 'O'){
                board[a][b+1] = 'A';
                dfs(board, a, b+1);
            }
        }



    }


}
