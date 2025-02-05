package org.example;

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public String toString() {
        return  String.format("Cat name = %S, age = %d", getName(), getAge());
    }
}
