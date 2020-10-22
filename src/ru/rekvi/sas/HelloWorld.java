package ru.rekvi.sas;



/*
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

    }
}

*/