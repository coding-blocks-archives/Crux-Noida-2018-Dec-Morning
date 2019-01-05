package com.codingblocks.lecture_9;

public class Main {
    public static void main(String[] args) {

    }

    public static void assign7q12(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        if (unprocessed.length() >= 2){
            int num = Integer.parseInt(unprocessed.substring(0, 2));
            if (num <= 26){
                char ch = (char)('a' + num - 1);

                assign7q12(processed + ch, unprocessed.substring(2));
            }
        }

        if (unprocessed.startsWith("0")){
            return;
        }

        int num = Integer.parseInt(unprocessed.substring(0, 1));
        char ch = (char)('a' + num - 1);
        assign7q12(processed + ch, unprocessed.substring(1));
    }
}
