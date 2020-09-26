package LeetCode.code_130_solve;

// 深度优先
/*
 * 先把外围的O全部换成A，再把所有的O换为X，再把A换为O
 */
public class Solution_01 {

    int n, m;


    public static void main(String[] args){
        char[][] board = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };

        Solution_01 so = new Solution_01();
        so.solve(board);

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }

    }


    public void solve(char[][] board) {

        n = board.length;
        if(n == 0) {
            return;
        }

        m = board[0].length;

        for(int i = 0; i < n; i++){
            dfs(board, i, 0);
            dfs(board, i, m - 1);
        }

        for(int i = 1; i < m - 1; i++){
            dfs(board, 0, i);
            dfs(board, n-1, i);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 'A'){
                    board[i][j] = 'O';
                } else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(char[][] board, int x, int y){
        if(x < 0 || x >= n || y <0 || y >= n || board[x][y] != 'O') {
            return;
        }

        board[x][y] = 'A';
        dfs(board, x+1, y);
        dfs(board, x-1, y);
        dfs(board, x, y+1);
        dfs(board, x, y-1);
    }
}