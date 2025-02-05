package org.example;

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return  String.format("Dog name = %S, age = %d", getName(), getAge());
    }
}
