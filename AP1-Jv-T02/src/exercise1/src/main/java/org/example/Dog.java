package org.example;

public class Dog extends Animal{

    public Dog(String nameAnimal, int ageAnimal) {
        super(nameAnimal, ageAnimal);
    }


    public String toString() {
        return "Dog name = " + getNameAnimal() + ", age = " + getAgeAnimal();
    }
}
