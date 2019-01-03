package com.codingblocks.lecture_8;

public class Main {
    public static void main(String[] args) {

        String num = "7000";

        System.out.println(toInt(num, num.length() - 1));
    }

    public static int sum(String number, int index){
        if (index == number.length()){
            return 0;
        }

        int digit = number.charAt(index) - '0';

        return digit + sum(number, index + 1);
    }

    public static int toInt(String number, int index){
        if (index == 0){
            return number.charAt(index) - '0';
        }

        int digit = number.charAt(index) - '0';

        return (digit) + 10 * toInt(number, index - 1);
    }

    public static void dub(String line){
        dub("", line);
    }

    private static void dub(String processed, String unprocessed){
        if (unprocessed.length() < 2){
            System.out.println(processed + unprocessed);
            return;
        }

        char first = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        if (unprocessed.charAt(0) == first){
            dub(processed + first + "*", unprocessed);
        } else {
            dub(processed + first, unprocessed);
        }
    }

    public static StringBuilder dubBuilder(StringBuilder processed, String unprocessed, int index){
        if (index == unprocessed.length()){
            return processed;
        }

        if (index == unprocessed.length() - 1){
            return processed.append(unprocessed.charAt(index));
        }

        char first = unprocessed.charAt(index);

        processed.append(first);

        if (first == unprocessed.charAt(index + 1)){
            processed.append("*");
        }

        return dubBuilder(processed, unprocessed, index + 1);
    }
}
