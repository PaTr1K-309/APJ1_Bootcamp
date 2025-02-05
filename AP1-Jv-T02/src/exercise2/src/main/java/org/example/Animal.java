package org.example;

public abstract class Animal {
    private String nameAnimal;
    private int ageAnimal;
    private  double mass;

    public Animal(String nameAnimal, int ageAnimal, double mass) {
        this.nameAnimal = nameAnimal;
        this.ageAnimal = ageAnimal;
        this.mass = mass;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public double getMass() {
        return mass;
    }

    public double getFeedInfoKg() { return 0;}

}
