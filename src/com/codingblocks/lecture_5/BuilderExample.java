package com.codingblocks.lecture_5;

public class BuilderExample {
    public static void main(String[] args) {
//        StringBuilder a = new StringBuilder("a");
//
//        System.out.println("Process start");
//
//        for (int i = 0; i < 1000000; i++) {
//            a.append("a");
//        }
//
//        System.out.println("Process stop");
//
//

        System.out.println(oddEven("Happy Diwali"));

    }

    public static String toggle(String line){


        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            // process ch
            if (ch >= 'a' && ch <= 'z'){
                ch = (char)('A' + ch - 'a');

//                ch = Character.toUpperCase(ch);

            } else if (ch >= 'A' && ch <= 'Z'){
                ch = (char)('a' + ch - 'A');

//                ch = Character.toLowerCase(ch);
            }

            // append to builder
            builder.append(ch);
        }

        return builder.toString();
    }

    public static String oddEven(String line){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'A' && ch <= 'z'){
                if (i%2 == 0){
                    if (ch == 'a'){
                        ch = 'z';
                    } else if (ch == 'A'){
                        ch = 'Z';
                    } else {
                        ch = (char) (ch - 1);
                    }

                } else {
                    if (ch == 'z'){
                        ch = 'a';
                    } else if (ch == 'Z'){
                        ch = 'A';
                    } else {
                        ch = (char) (ch + 1);
                    }
                }
            }

            builder.append(ch);
        }

        return builder.toString();
    }
}
