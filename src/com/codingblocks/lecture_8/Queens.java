package com.codingblocks.lecture_8;

import java.util.Arrays;

public class Queens {

    public static void main(String[] args) {
        int n = 4;

        boolean[][] board = new boolean[n][n];

        nqueen(board, 0);

    }

    public static void nqueen(boolean[][] board, int row){
        if (row == board.length){
            display(board);
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

    public static int nqueenCount(boolean[][] board, int row){
        if (row == board.length){
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)){
                board[row][col] = true;
                count += nqueenCount(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

        System.out.println();
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
