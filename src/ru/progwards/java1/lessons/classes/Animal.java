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
    public double getWeight() {
        return weight;
    }

    public double getFoodCoeff() {
        return weight % 0.02;
    }

    public double calculateFoodWeight() {
        return getFoodCoeff() * getWeight();
    }

    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();
    }
    public String toStringFull(){
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }


    public static void main(String[] args) {
        System.out.println(new Animal(0).toString());
        System.out.println(new Animal(200).toStringFull());
    }
}
