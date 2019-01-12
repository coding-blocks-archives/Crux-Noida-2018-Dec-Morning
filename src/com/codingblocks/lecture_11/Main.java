package com.codingblocks.lecture_11;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Human anubhav = new Human("Anu Bhav");

        System.out.println(anubhav.getName());

        anubhav.addPet("Bhola", "Labra", 3);

        System.out.println(anubhav.getPets());


        anubhav.laugh();
    }
}
