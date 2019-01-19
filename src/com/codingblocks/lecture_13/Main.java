package com.codingblocks.lecture_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Exception e = new Exception("No elemrnt found");


        CustomException ex = new CustomException("No item found yet");

        File f = new File("hello.txt");;

        try {
            Scanner s = new Scanner(f);
        }
        catch (ArithmeticException exc){
            System.out.println("Ja math padh ke aa");
        }

        catch (FileNotFoundException fnot){
            f.createNewFile();
        }
        catch (Exception exc){
            System.out.println(exc.getMessage());
        }




    }
}
