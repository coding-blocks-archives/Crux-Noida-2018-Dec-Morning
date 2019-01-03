package com.codingblocks.lecture_8;

public class Queens {

    public static void main(String[] args) {
        int n = 4;

        boolean[][] board = new boolean[n][n];


    }

    public static void nqueen(boolean[][] board, int row){
        if (row == board.length){
            // display(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)){
                board[row][col] = true;
                nqueen(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // for up

        for (int r = 0; r < row; r++) {
            if (board[r][col]){
                return false;
            }
        }

        int min = Math.min(row, col);

        for (int i = 1; i <= min; i++) {
            if (board[row-i][col - i]){
                return false;
            }
        }

        min = Math.min(row, board.length - 1 - col);

        for (int i = 1; i <= min ; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }
}
