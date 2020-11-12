package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

public class Animal implements FoodCompare {
    double weight;

    @Override
    public int compareFoodPrice() {
        return 0;
    }

    @Override
    public int compareFoodPrice(Animal animal) {
        return 0;
    }

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
        return  0.02;
    }

    public double calculateFoodWeight() {
        return getFoodCoeff() * getWeight();
    }
    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();
    }
    public String toStringFull() {
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (anObject == null || getClass() != anObject.getClass()) return false;
        Animal animal = (Animal) anObject;
        return Double.compare(animal.weight, weight) == 0 &&
                animal1 == animal.animal1 &&
                animal2 == animal.animal2 &&
                animal3 == animal.animal3 &&
                animal4 == animal.animal4 &&
                food1 == animal.food1 &&
                food2 == animal.food2 &&
                food3 == animal.food3;
    }
/** первая попытка
    public boolean equals(Object anObject){
        Object a = this.weight;
        Object b = this.weight;
        if(a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }
*/
    public double getFood1kgPrice(){
        switch (getFoodKind()){
            case HAY: return 20;
            case CORN: return 50;
            case UNKNOWN: return 0;
        }
        return 0;
    }

    public double getFoodPrice(){
        return calculateFoodWeight() * getFood1kgPrice();
    }


    public static void main(String[] args) {
        System.out.println(new Animal(0).toString());
        System.out.println(new Animal(386).toStringFull());
        System.out.println(new Animal(10).equals(new Animal(11)));//false - objects are not equal
        System.out.println(new Cow(33).equals(new Cow(33)));//true - objects are equal
        System.out.println(new Cow(33).equals(new Duck(33)));//false - these objects are different and they are not equal

    }
}
/**
1.1 Для класса Animal из задач 1 и 2, домашнего задания к уроку 5 реализовать метод:
public boolean equals(Object anObject), который возвращает true, если объекты равны и false если не равны по параметру
 - вес животного. Убедится, что при равном весе, утка все равно не равна хомяку. Обратите внимание на тип принимаемого
 параметра и подумайте над тем, что будет делать ваша программа, если в качестве параметра будет передан объект не являющийся экземпляром Animal.
//////////////////////////////////////////////////////////////////////////////////////////////////////////
 public boolean equals(Object other){
 if (other == this){
 return true;
 } else if (other instanceof FractionInterface) {
 FractionInterface fOther = (FractionInterface) other;
 // compare numerator and denominator...
 } else {
 return false;
 }
 }



 //////////////////////////////////////////////////////////////////////////////////////////////////////////


        Для класса Animal реализовать интерфейс FoodCompare, который сравнивает животных по цене потребляемой еды.
public interface FoodCompare {
    public int compareFoodPrice();
}

    Для этого
1.2 В класс Animal добавить метод
public double getFood1kgPrice(), который возвращает информацию о цене 1 кг еды.
        метод реализовать в виде switch по FoodKind со следующими значениями
        HAY : 20
        CORN: 50
        UNKNOWN: 0

        1.3 В класс Animal добавить метод
public double getFoodPrice(), который возвращает информацию о цене еды для данного животного
 по формуле calculateFoodWeight() * getFood1kgPrice()

        1.4 В отдельном файле объявить interface FoodCompare
interface FoodCompare {
    public int compareFoodPrice(Animal animal);
}

1.5 В класс Animal реализовать
public int compareFoodPrice(Animal aminal), который возвращает результаты сравнения цены еды для данного животного с ценой еды для другого животного, используя Double.compare;
*/