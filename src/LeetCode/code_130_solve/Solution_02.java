package LeetCode.code_130_solve;

/*
 * 广度优先搜索
 */

import java.util.LinkedList;
import java.util.Queue;

public class Solution_02 {

    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};



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


    public void solve(char[][] board){
        int n = board.length;
        if(n == 0){
            return;
        }

        int m = board[0].length;

        Queue<int[]> queue = new LinkedList<int[]>();
        for(int i = 0; i < n; i++){

            if(board[i][0] == 'O'){
                queue.offer(new int[]{i, 0});
            }
            if(board[i][m-1] == 'O'){
                queue.offer(new int[]{i, m-1});
            }
        }

        for(int i = 1; i < m - 1; i++){
            if(board[0][i] == 'O'){
                queue.offer(new int[]{0,i});
            }
            if(board[n - 1][i] == 'O'){
                queue.offer(new int[]{n-1, i});
            }
        }

        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int x = cell[0];
            int y = cell[1];

            board[x][y] = 'A';

            for(int i = 0; i < 4; i++){
                int mx = x + dx[i], my = y + dy[i];
                if(mx < 0 || my < 0 || mx >= n || my >= m || board[mx][my] != 'O'){
                    continue;
                }
                queue.offer(new int[]{mx, my});
            }
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
}
