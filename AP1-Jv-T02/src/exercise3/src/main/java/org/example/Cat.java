package org.example;

public class Cat extends Animal implements Omnivore {

    public Cat(String name, int age) {
        super(name, age);
    }

    public String hunt() {
        return "I can hunt for mice";
    }

    public String toString() {
        return String.format("Cat name = %s, age = %d. %s", getName(), getAge(), hunt());
    }
}
