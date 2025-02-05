package org.example;

public abstract class Animal {
    private String nameAnimal;
    private int ageAnimal;

    public Animal(String nameAnimal, int ageAnimal) {
        this.nameAnimal = nameAnimal;
        this.ageAnimal = ageAnimal;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

}
