package org.example;

public class Dog extends Animal implements Omnivore {

    public Dog(String name, int age) {
        super(name, age);
    }

    public String hunt() {
        return "I can hunt for robbers";
    }

    public String toString() {
        return String.format("Dog name = %s, age = %d. %s", getName(), getAge(), hunt());
    }
}
