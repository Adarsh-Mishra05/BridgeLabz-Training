package com.inheritance.AnimalHierarchy;

// Base class
class BaseAnimal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Animals make sound");
    }
}

// Child classes
class Dog extends BaseAnimal {
    void makeSound() {
        System.out.println("Dog makes sound");
    }
}

class Cat extends BaseAnimal {
    void makeSound() {
        System.out.println("Cat makes sound");
    }
}

class Bird extends BaseAnimal {
    void makeSound() {
        System.out.println("Bird makes sound");
    }
}

// Main class (ONLY public class)
public class Animal {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();
        BaseAnimal animal = new BaseAnimal();

        bird.makeSound();
        cat.makeSound();
        dog.makeSound();
        animal.makeSound();
    }
}
