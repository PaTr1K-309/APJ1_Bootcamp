package org.example;

public class Dog extends Animal{

    public Dog(String nameAnimal, int ageAnimal, double mass) {
        super(nameAnimal, ageAnimal, mass);
    }

    public double getFeedInfoKg() { return getMass() * 0.3;}

    public String toString() {
        return String.format("Dog name = %s, age = %d, mass = %.2f, feed = %.2f",
                getNameAnimal(), getAgeAnimal(), getMass(), getFeedInfoKg());
    }
}
