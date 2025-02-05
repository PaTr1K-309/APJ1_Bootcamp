package org.example;

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    protected Dog createNewAnimal(String name, int age) {
        return new Dog(name, age);
    }

    @Override
    public String toString() {
        return String.format("Dog name = %s, age = %d.", getName(), getAge());
    }
}
