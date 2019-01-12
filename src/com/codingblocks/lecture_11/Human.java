package com.codingblocks.lecture_11;

import java.util.ArrayList;

public class Human {

    private String name;

    private ArrayList<Pet> pets;


    public Human(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void addPet(String name, String breed, int age){
        Pet pet = new Pet(name, breed, age);

        pets.add(pet);
    }

    public void eat(){
        this.openMouth();
        System.out.println("I am eating");
    }

    public void laugh(){
        this.openMouth();
        System.out.println("I am laughing");
    }

    private void openMouth() {
        System.out.println("My mouth is open");
    }


}
