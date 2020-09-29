package ru.rekvi.sas;

class Person{
    private String name;
    private int age;
    private String country;

    public Person(){
        country = "RU";
    }

    public Person(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }
    public String getCountry(){
        return country;
    }
}





//
//    public static double volumeBallDouble(double radius){
//        double v = 4/3.03.14(radiusradiusradius);
//        return v;
//    }
//    public static float volumeBallFloat(float radius){
//        float v1 = 4/3.0f3.14f((float)radius(float)radius(float)radius);
//        return v1;
//    }
//    public static double calculateAccuracy(double radius){
//        return volumeBallDouble ((float)radius) - volumeBallFloat((float) radius);
//    }
//
//    public static void main(String[] args) {
//        volumeBallDouble(6371.2);
//        volumeBallFloat(6371.2f);
//        System.out.println(volumeBallDouble (6371.2) - volumeBallFloat(6371.2f));
//
//    }
