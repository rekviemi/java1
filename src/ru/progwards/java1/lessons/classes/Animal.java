package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;

    enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK,
    }
    AnimalKind animal1 = AnimalKind.ANIMAL;
    AnimalKind animal2 = AnimalKind.COW;
    AnimalKind animal3 = AnimalKind.HAMSTER;
    AnimalKind animal4 = AnimalKind.DUCK;

    enum FoodKind {
        UNKNOWN,
        HAY,
        CORN,
    }
    FoodKind food1 = FoodKind.UNKNOWN;
    FoodKind food2 = FoodKind.HAY;
    FoodKind food3 = FoodKind.CORN;
    public Animal(double weight) {
          this.weight = weight;
    }

    public AnimalKind getKind() {
        return animal1;
    }

    public FoodKind getFoodKind() {
        return food1;
    }

    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    public static void main(String[] args) {
        System.out.println(new Animal(0).toString());
    }
}
