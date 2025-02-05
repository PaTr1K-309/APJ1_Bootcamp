package org.example;


class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    protected Cat createNewAnimal(String name, int age) {
        return new Cat(name, age);
    }

    @Override
    public String toString() {
        return String.format("Cat name = %s, age = %d.", getName(), getAge());
    }
}
