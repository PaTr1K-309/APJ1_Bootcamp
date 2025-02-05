package org.example;

public class Cat extends Animal {

    int feed;

    public Cat(String nameAnimal, int ageAnimal, double mass) {
        super(nameAnimal, ageAnimal, mass);
    }

    public double getFeedInfoKg() { return getMass() * 0.1;}

    public String toString() {
        return String.format("Cat name = %s, age = %d, mass = %.2f, feed = %.2f",
                getNameAnimal(), getAgeAnimal(), getMass(), getFeedInfoKg());
    }
}
