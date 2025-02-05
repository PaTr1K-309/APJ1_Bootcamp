package org.example;

public class Cat extends Animal {

    public Cat(String nameAnimal, int ageAnimal) {
        super(nameAnimal, ageAnimal);
    }

    public String toString() {
        return "Cat name = " + getNameAnimal() + ", age = " + getAgeAnimal();
    }
}
