package ru.rekvi.sas;

import java.util.Objects;

public class Rectangle {
    private double a;
    private double b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        if (area() > rectangle.area())
            return false;
        else if (area() < rectangle.area())
            return false;
        else
            return true;
       // return Double.compare(rectangle.a, a) == 0 && Double.compare(rectangle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a*b;
    }

    public static void main(String[] args) {
        boolean a = new Rectangle(2,3).equals(new Rectangle(3, 2));
        System.out.println("true = " + a);
        boolean b = new Rectangle(3,3).equals(new Rectangle(2, 2));
        System.out.println("false = " + b);
        boolean c = new Rectangle(3,4).equals(new Rectangle(6, 2));
        System.out.println("true = " + c);
        new Rectangle(2,3).equals(new Rectangle(3, 2));
        new Rectangle(3,3).equals(new Rectangle(2, 2));
        new Rectangle(3,4).equals(new Rectangle(6, 2));
        new Rectangle(2,2).equals(new Rectangle(2, 2));
        Rectangle rect;
        boolean d = (rect=new Rectangle(1,2)).equals(rect);
        System.out.println("true = " + d);
        boolean e = new Rectangle(2,2).equals(null);
        System.out.println("" + e);
        new Rectangle(2,2).equals(new Object());
    }
}
