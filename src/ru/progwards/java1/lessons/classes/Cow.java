package ru.progwards.java1.lessons.classes;

class Cow extends Animal {
    public Cow(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return animal2;
    }
    @Override
    public FoodKind getFoodKind() {
        return food2;
    }
    @Override
    public String toString() {
        return  getKind() + ", " + getFoodKind();
    }
    public static void main(String[] args) {
        System.out.println(new Cow(0).toString());

    }
}
