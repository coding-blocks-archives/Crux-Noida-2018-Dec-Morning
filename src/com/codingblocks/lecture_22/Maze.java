package com.codingblocks.lecture_22;

public class Maze {

    public static int maze(int row, int col){
        if (row == 0 || col == 0){
            return 1;
        }

        return maze(row-1, col) + maze(row, col-1);
    }

    public static int mazeDP(int row, int col, Integer[][] memory){
        if (row == 0 || col == 0){
            return 1;
        }

        if(memory[row][col] != null){
            return memory[row][col];
        }

        memory[row][col] = mazeDP(row-1, col, memory) + mazeDP(row, col-1, memory);

        return memory[row][col];
    }

    public static int mazeDPItr(int row, int col, Integer[][] memory) {

        for (int r = 0; r <= row; r++) {
            for (int c = 0; c <=col; c++) {
                if (r == 0 || c == 0){
                    memory[r][c] = 1;
                } else {
                    memory[r][c] = memory[r-1][c] + memory[r][c-1];
                }
            }
        }

        return memory[row][col];
    }

}
