package com.codingblocks.lecture_8;

public class MazeDirections {
    public static void main(String[] args) {

        int n = 4;
        int m = 4;

        boolean[][] maze = new boolean[m][n];


        maze("", maze, 0, 0, 1, 1);

    }

    public static void maze(String path, boolean[][] maze, int row, int col, int f_row, int f_col){
        if (row == f_row && col == f_col){
            System.out.println(path);
            return;
        }

        if (maze[row][col]){
            return;
        }

        maze[row][col] = true;

        if (row > 0){
            maze(path+"U", maze, row - 1, col, f_row, f_col);
        }

        if (col > 0){
            maze(path + "L", maze, row, col - 1, f_row, f_col);
        }

        if (row < maze.length - 1){
            maze(path+"D", maze, row + 1, col, f_row, f_col);
        }

        if (col < maze[0].length - 1){
            maze(path + "R", maze, row, col + 1, f_row, f_col);
        }

        maze[row][col] = false;
    }
}
