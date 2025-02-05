package org.example;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public double goToWalk() {
        return getAge() * 0.5;
    }

    public String toString() {
        return String.format("Dog name = %s, age = %d", getName(), getAge());
    }
}
