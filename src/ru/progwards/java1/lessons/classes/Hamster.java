package ru.progwards.java1.lessons.classes;

class Hamster extends Animal {
    public Hamster(double weight) {
        super(weight);
    }
    @Override
    public double getFoodCoeff(){
        return weight % 0.03;
    }
    @Override
    public AnimalKind getKind() {
        return animal3;
    }
    @Override
    public FoodKind getFoodKind() {
        return food3;
    }
    @Override
    public String toString() {
        return  super.toString();
    }
    public static void main(String[] args) {
        System.out.println(new Hamster(0).toString());

    }
}
