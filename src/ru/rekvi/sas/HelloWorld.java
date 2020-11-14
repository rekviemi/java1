package ru.rekvi.sas;



/**
 * ========================================== test block 8.3 ===========================================================
 * Создайте класс Person, а внутри него 2 класса
 * вложенный класс Child1
 * внутренний класс Child2
 * У каждого класса, Child1 и Child2 создайте метод String hello()
 * У Child1 String hello() должен вернуть "привет"
 * У Child2 String hello() должен вернуть "servus"
 *
 public class Person {
 public static class Child1 { //nested
        String hello(){
        return "привет";
     }
 }

 public class Child2 { //inner
 String hello(){
 return  "servus";
     }
 }

 public static void main(String[] args) {
 System.out.println(new Person.Child1().hello());
 System.out.println(new Person().new Child2().hello());
       }
 }
*=========================================== test block 8.2 ============================================================
Описаны интерфейсы
public interface Speaking {
    public String say();
 }

public interface Eating {
     public String eat();
 }

реализовать 2 класса, Dog и Goat.
У класса Dog метод say() должен вернуть "Гав"
У класса Dog метод eat() должен вернуть "Мясо"
У класса Goat метод say() должен вернуть "Мее"
У класса Goat метод eat() должен вернуть "Сено"

 public class Dog implements Speaking, Eating{
    @Override
    public String say(){
        return new String("Гав");
    }
    @Override
    public String eat(){
        return new String("Мясо");
    }
}

public class Goat implements Eating, Speaking {
    @Override
    public String say(){
        return new String("Мее");
    }

    @Override
    public String eat(){
        return new String("Сено");
    }
}



test block 8.1
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
       // return Double.compare(rectangle.a, a) == 0 && Double.compare(rectangle.b, b) == 0; выдала среда по умолчанию
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

test block 7.3
Создайте метод, возвращающий значение enum Grade по числовой оценке.
Сигнатура метода static Grade intToGrade(int grade)
Соответствие оценок
1 - VERYBAD
2 - BAD
3 - SATISFACTORILY
4 - GOOD
5 - EXCELLENT
все остальное NOTDEFINED
Например, intToGrade(4) должно вернуть GOOD

public class Grader {
    enum Grade {
        VERYBAD,
        BAD,
        EXCELLENT,
        GOOD,
        NOTDEFINED,
        SATISFACTORILY,
    }
    static Grade intToGrade(int grade){
            switch (grade){
                case 1: return Grade.VERYBAD;
                case 2: return Grade.BAD;
                case 3: return Grade.SATISFACTORILY;
                case 4: return Grade.GOOD;
                case 5: return Grade.EXCELLENT;
                default: return Grade.NOTDEFINED;
            }
        }
    public static void main(String[] args) {
        System.out.println(intToGrade(55));
    }
}



test block 7.2
Написать программный код, который возвращает младший (нулевой) бит переменной byte value. Ответ нужно поместить в переменную int result.
Таким образом, если младший бит параметра value равен 0, то result должен быть равен 0. Если младший бит равен 1, то и result должен быть равен 1.
Подсказка
при реализации этой функции удобно использовать битовую операцию &
int result = value & 0b01;
/////////////////////////////////////////
public static boolean isSimple(int n) {
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0) {
            return n == 2;
        }
        if (n % 3 == 0) {
            return n == 3;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
test block 6.3
Реализуйте функцию, возвращающую максимальный по значению элемент массива. Если в массиве 0 элементов, вернуть 0. Сигнатура функции

public int arrayMax(int[] a)

Подсказка - для быстрой реализации удобно использовать функцию Arrays.sort()
public int arrayMax(int[] a){
      if (a.length == 0) return 0;
            Arrays.sort(a);
            int max = 0;
            max = a[a.length - 1];
            return max;
        }

test block 6.2
реализуйте метод compareTo с сигнатурой
public int compareTo(Rectangle anRectangle) который должен сравнивать прямоугольники по величине их площади.
При сравнении a.compareTo(b) метод должен возвращать
a   > b : 1
a == b : 0
a   < b : -1

Например

прямоугольник 2x2  >  прямоугольника 1x1 - результат 1
прямоугольник 2x3 == прямоугольнику 3x2 - результат 0
прямоугольник 2x2  <  прямоугольника 3x3 - результат -1
	class Rectangle {
		private double a;
		private double b;

		public Rectangle(double a, double b) {
		        this.a = a;
			this.b = b;
                 }

		public double area() {

			return a*b;
		}
		 public int compareTo(Rectangle anRectangle){
  if (area() > anRectangle.area())
            return 1;
        else if (area() < anRectangle.area())
            return -1;
        else
            return 0;
    }
    main
    new Rectangle(2,3).compareTo(new Rectangle(3, 2))
}


test block 6.1
Напишите функцию, суммирующие значения элементов одномерного массива, содержащего целые числа. Сигнатура:
public int sumArrayItems(int[] a)

 public int sumArrayItems(int[] a){
        int result = 0;
        for(int i = 0; i < a.length; i++){
            result = result + a[i];
        }
        return result;
    }

    public static void main(String[] args) {
       int[] numbers = new int[] {1,1};
        System.out.println(sumArrayItems(numbers));
    }

test block 5.3
Создайте классы Point2D, Point3D, в одном окошке, последовательно один, за другим

Класс Point2D - точка с 2-мя координатами, содержит

переменные int x; int y;
конструктор с параметрами int x, int y, устанавливающий соответствующие переменные
переопределение функции toString(), которая должна возвращать результат в формате х,у, например 23,12
Класс Point3D - точка с 3-мя координатами

наследуется от Point2D
содержит приватную переменную int z;
конструктор с параметрами int x, int y, int z, вызывающий конструктор родителя и устанавливающий соответствующую свою переменную
переопределение функции toString(), которая должна возвращать результат в формате х,у,z, например 23,12,37 для этого вызывать функцию toString() родителя внутри себя

class Point2D {
    int x, y;

    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }
    public static void main(String[] args) {
        System.out.println(new Point2D(22, 38).toString());
        System.out.println(new Point3D(1, 2, 3).toString());
    }
}
class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    @Override
    public String toString (){
        return super.toString()+"," + z;
    }
      }
test block 5.2
Создайте класс Calculator, содержащий
приватную переменную int result;
конструктор по умолчанию, устанавливающий result = 0;
публичную функцию set(int num), устанавливающую значение result равный num
публичную функцию add(int num), увеличивающую result на num
публичную функцию sub(int num), уменьшающую result на num
публичную функцию int getResult()

class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    }

    public void set(int num) {
        result = num;
    }

    public void add(int num) {
        result = result + num;
    }

    public void sub(int num) {
        result = result - num;
    }

    public int getResult() {
        return result;
    }
}







test block 5.1
Создайте класс Person, содержащий
приватную переменную String name;
приватную переменную int age;
приватную переменную String country;
конструктор по умолчанию, устанавливающий country = "RU";
конструктор с параметрами String name, int age, вызывающий конструктор по умолчанию, и устанавливающий значения переменным name и age из соответствующих параметров;
публичные функции String getName(), int getAge(), String getCountry(), возвращающие значения соответствующих переменных

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





 тест блока 4.3
 Напишите метод, вычисляющий факториал числа - n!. Сигнатура метода static long factorial(long n)
Напомним, что факториал n это произведение всех чисел от 1 до n и факториал 0 == 1

static long factorial(long n){
        if( n <= 1 )
            return 1;
        else
         return n * factorial( n - 1 );
}




 тест блока 4.2
 Напишите метод, который возвращает текстовую характеристику оценки по числовой.
0 - не оценено
1..20 - очень плохо
21..40 - плохо
41..60 - удовлетворительно
61..80 - хорошо
81..100 - отлично
в остальных случаях - не определено
Сигнатура метода static String textGrade(int grade)

Например, textGrade(45) должна вернуть "удовлетворительно"

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println(textGrade(34));

    }
    static String textGrade(int grade){
        String score;
        if(grade >= 1 & grade <= 20)
            score = "очень плохо";
        else if (grade >= 21 & grade <= 40)
            score = "плохо";
        else if (grade >= 41 & grade <= 60)
            score = "удовлетворительно";
        else if (grade >= 61 & grade <= 80)
            score = "хорошо";
        else if (grade >= 81 & grade <= 100)
            score = "отлично";
        else if (grade == 0 & grade == 0)
            score = "не оценено";
        else
            score = "не определено";
        return score;
Rekvi1zaq
    }
}

*/