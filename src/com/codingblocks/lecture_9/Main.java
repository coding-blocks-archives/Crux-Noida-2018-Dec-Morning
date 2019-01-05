package com.codingblocks.lecture_9;

public class Main {
    public static void main(String[] args) {
        optimised(new StringBuilder(), "11111111111111111111111111111111111", 0);

//        assign7q12("", "11111111111111111111111111111111111" );
    }

    public static void assign7q12(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
//            System.out.println(processed);
            return;
        }

        int num = Integer.parseInt(unprocessed.substring(0, 1));
        char ch = (char)('a' + num - 1);
        assign7q12(processed + ch, unprocessed.substring(1));

        if (unprocessed.length() >= 2){
            num = Integer.parseInt(unprocessed.substring(0, 2));
            if (num <= 26){
                ch = (char)('a' + num - 1);

                assign7q12(processed + ch, unprocessed.substring(2));
            }
        }

        if (unprocessed.startsWith("0")){
            return;
        }


    }

    public static void optimised(StringBuilder processed, String unprocessed, int index){
        if (index == unprocessed.length()){
//            System.out.println(processed);
            return;
        }

        char ch = (char)(unprocessed.charAt(index) - '0' - 1 + 'a');

        processed.append(ch);
        optimised(processed, unprocessed, index + 1);
        processed.deleteCharAt(processed.length() - 1);


        if (index < unprocessed.length() - 1){
            ch = (char)((unprocessed.charAt(index) - '0') * 10 + (unprocessed.charAt(index + 1) - '0' - 1 + 'a'));

            processed.append(ch);
            optimised(processed, unprocessed, index + 2);
            processed.deleteCharAt(processed.length() - 1);


        }
    }
}
