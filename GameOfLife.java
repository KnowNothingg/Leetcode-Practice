class GameOfLife {
    public static void gameOfLife(int[][] board) {
        int[][] newBoard = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int cell = board[i][j];
                newBoard[i][j] = rules(board, i, j, cell);
            }
        }

        for(int i = 0; i < board.length; i++){
            board[i] = newBoard[i].clone();
        }
    }

    public static int rules(int[][] board, int x, int y, int cell) {
        int count1 = 0;
        int m = board.length;
        int n = board[0].length;


        if (x - 1 >= 0 && y - 1 >= 0) {
            if (board[x - 1][y - 1] == 1) {
                count1++;
            }
        }

        if (x - 1 >= 0 && y >= 0) {
            if (board[x - 1][y] == 1) {
                count1++;
            }
        }

        if (x - 1 >= 0 && y + 1 < n) {
            if (board[x - 1][y + 1] == 1) {
                count1++;
            }
        }

        if (x >= 0 && y - 1 >= 0) {
            if (board[x][y - 1] == 1) {
                count1++;
            }
        }

        if (x >= 0 && y + 1 < n) {
            if (board[x][y + 1] == 1) {
                count1++;
            }
        }

        if (x + 1 < m && y - 1 >= 0) {
            if (board[x + 1][y - 1] == 1) {
                count1++;
            }
        }

        if (x + 1 < m && y >= 0) {
            if (board[x + 1][y] == 1) {
                count1++;
            }
        }

        if (x + 1 < m && y + 1 < n) {
            if (board[x + 1][y + 1] == 1) {
                count1++;
            }
        }

        if (cell == 1) {
            if (count1 == 2 || count1 == 3)
                cell = 1;
            if (count1 < 2 || count1 > 3)
                cell = 0;
        } else {
            if (count1 == 3)
                cell = 1;
        }

        return cell;

    }

    public static void main(String[] args) {
        int[][] board = new int[4][3];

        board[0][0] = 0;
        board[0][1] = 1;
        board[0][2] = 0;
        board[1][0] = 0;
        board[1][1] = 0;
        board[1][2] = 1;
        board[2][0] = 1;
        board[2][1] = 1;
        board[2][2] = 1;
        board[3][0] = 0;
        board[3][1] = 0;
        board[3][2] = 0;

        gameOfLife(board);

        for (int i = 0; i < board.length; i++) {
            System.out.print("[");
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print("]\n");
        }

    }
}
