package com.codingblocks.lecture_5;

import java.util.ArrayList;

public class Recursion {
    public static void recur(ArrayList<Integer> hello, int[][] maze, int row, int col, int frow, int fcol, int count) {
        if (row == frow && col == fcol) {
            count += maze[row][col];
            hello.add(count);
            return;
        }
        if (row < maze.length - 1) {
            if (count + maze[row][col] - 1 >= 0) {
//                count += maze[row][col] - 1;
                recur(hello, maze, row + 1, col, frow, fcol, count + maze[row][col] - 1);
            }
        }

        if (col < maze[0].length - 1) {
//            count += maze[row][col] + 1;
            recur(hello, maze, row, col + 1, frow, fcol, count + maze[row][col] + 1);
        }
    }

    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0}, {2, 4, 7, 0}, {8, 0, 0, 1}, {9, 8, 7, 1}};
        int n = maze.length;
        ArrayList<Integer> hello = new ArrayList<>();
        recur(hello, maze, 0, 0, n - 1, n - 1, 0);
    }
}
