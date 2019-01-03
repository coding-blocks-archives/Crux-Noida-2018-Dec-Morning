package com.codingblocks.lecture_8;

public class Maze {
    public static void main(String[] args) {
//        mazePath("", 3, 3);
        System.out.println(true & false);
    }

    public static int maze(int row, int col){
        if (row == 1 && col == 1){
            return 1;
        }

        int count = 0;

        if (row > 1) {
            count += maze(row - 1, col);
        }

        if (col > 1) {
            count += maze(row, col - 1);
        }

        return count;
    }

    public static void mazePath(String path, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if (row > 1){
            mazePath(path + "V", row - 1, col);
        }

        if (col > 1){
            mazePath(path + "H", row, col - 1);
        }
    }

    public static void mazePathBuilder(StringBuilder path, int row, int col){
        if (row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if (row > 1){
            path.append("V");
            mazePathBuilder(path, row - 1, col);
            path.deleteCharAt(path.length() - 1);
        }

        if (col > 1){
            path.append("H");
            mazePathBuilder(path, row, col - 1);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
