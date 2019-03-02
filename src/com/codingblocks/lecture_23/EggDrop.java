package com.codingblocks.lecture_23;

public class EggDrop {
    public static void main(String[] args) {

        int egg = 10;
        int floor = 100;

        Integer[][] memory = new Integer[egg + 1][floor + 1];

        System.out.println(eggdropDPItr(10, 100, memory));
    }

    public static int eggdrop(int egg, int floor){
        if (floor == 0){
            return 0;
        }

        if (egg == 1){
            return floor;
        }

        int min = floor;

        for (int f = 1; f <= floor ; f++) {
            int down = eggdrop(egg - 1, f-1);
            int up = eggdrop(egg, floor - f);

            int current = Math.max(up, down) + 1;

            if (current < min){
                min = current;
            }
        }

        return min;
    }

    public static int eggdropDP(int egg, int floor, Integer[][] memory){
        if (floor == 0){
            return 0;
        }

        if (egg == 1){
            return floor;
        }

        if (memory[egg][floor] != null){
            return memory[egg][floor];
        }

        int min = floor;

        for (int f = 1; f <= floor ; f++) {
            int down = eggdropDP(egg - 1, f-1, memory);
            int up = eggdropDP(egg, floor - f, memory);

            int current = Math.max(up, down) + 1;

            if (current < min){
                min = current;
            }
        }

        memory[egg][floor] = min;

        return min;
    }

    public static int eggdropDPItr(int egg, int floor, Integer[][] memory){
        for (int e = 1; e <= egg; e++) {
            for (int f = 0; f <= floor; f++) {
                if (f == 0){
                    memory[e][f] = 0;
                } else if (e == 1){
                    memory[e][f] = f;
                } else {
                    int min = f;

                    for (int c_f = 1; c_f <= f ; c_f++) {
                        int down = memory[e-1][c_f-1];
                        int up = memory[e][f - c_f];

                        int current = Math.max(down, up) + 1;

                        if (current < min){
                            min = current;
                        }
                    }

                    memory[e][f] = min;
                }
            }
        }

        return memory[egg][floor];
    }
}
