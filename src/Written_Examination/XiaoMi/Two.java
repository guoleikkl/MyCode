package Written_Examination.XiaoMi;

public class Two {
    private boolean[][] isMarked;
    private int[][] dirction = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    private int row;
    private int col;
    private String word;
    private char[][] board;


    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0 || word.length() == 0) {
            return false;
        }

        this.row = board.length;
        this.col = board[0].length;
        this.word = word;
        this.board = board;
        isMarked = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (DFS(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean DFS(int x, int y, int start) {
        if (start == word.length() - 1) {
            return (board[x][y] == word.charAt(start));
        }

        if (board[x][y] == word.charAt(start)) {
            isMarked[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int temp_x = x + dirction[i][0];
                int temp_y = y + dirction[i][1];
                if (inRange(temp_x, temp_y) && !isMarked[temp_x][temp_y]) {
                    if (DFS(temp_x, temp_y, start + 1)) {
                        return true;
                    }
                }
            }
            isMarked[x][y] = false;
        }
        return false;
    }

    private boolean inRange(int x, int y) {
        if (x > -1 && x < row && y > -1 && y < col) {
            return true;
        }
        return false;
    }
}
