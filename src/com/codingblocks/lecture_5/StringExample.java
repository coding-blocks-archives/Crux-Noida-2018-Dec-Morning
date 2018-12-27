package com.codingblocks.lecture_5;

public class StringExample {
    public static void main(String[] args) {

    }

    public static boolean isPallin(String line){
        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)){
                return false;
            }
        }

        return true;
    }

    public static int countPallin(String line){

        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < line.length() && line.charAt(left) == line.charAt(right)){
                count++;
                left--;
                right++;
            }
        }

        for (int i = 0; i < line.length(); i++) {
            int left = i;
            int right = i + 1;

            while (left >= 0 && right < line.length() && line.charAt(left) == line.charAt(right)){
                count++;
                left--;
                right++;
            }
        }

        return count;

    }
}
