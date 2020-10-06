package ru.progwards.java1.lessons.classes;

class Duck extends Animal {
    public Duck(double weight) {
        super(weight);
    }
    @Override
    public double getFoodCoeff(){
        return weight / 0.04;
    }
    @Override
    public AnimalKind getKind() {
        return animal4;
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
        System.out.println(new Duck(0).toString());

    }
}
