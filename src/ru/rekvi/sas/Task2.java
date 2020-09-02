package ru.rekvi.sas;

class Task2{

    public static void printJava(){
        String str, str1, str2;
        str = "Хорошо идут дела";
        str1 = "Изучаю Java я!";
        str2 = " ";
        System.out.println(str);
        System.out.println(str1);
        System.out.print(str);
        System.out.print(str2);
        System.out.println(str1);
        System.out.print(str1);
        System.out.print(str2);
        System.out.println(str);
    }

    public static int addition(int x, int y) {
        System.out.print("Вызвана функция addition() с параметрами x = "  +x);
        System.out.println (", y = "  +y);
        return x + y;
    }

    public static int subtraction(int x, int y){
        System.out.print("Вызвана функция subtraction() с параметрами x = "  +x);
        System.out.println (", y = "  +y);
        return x - y;
    }


    public static int multiplication(int x, int y){
        System.out.print("Вызвана функция multiplication() с параметрами x = "  +x);
        System.out.println (", y = "  +y);
        return x * y;
    }
    public static void calculation(){

        int a = 34;
        int b = 55;
        int c = a + b;
        int c1 = a - b;
        int c2 = a * b;
        System.out.print("a = ");
        System.out.println(a);
        System.out.print("b = ");
        System.out.println(b);

        addition(34, 55);
        System.out.print("a + b = ");
        System.out.println(c);

        subtraction(34, 55);
        System.out.print("a - b = ");
        System.out.println(c1);

        multiplication(34, 55);
        System.out.print("a * b = ");
        System.out.println(c2);
    }

    public static void main(String[] args) {
        printJava();


        subtraction(45, 12);
        subtraction(23, 55);
        addition(128, 787);
        addition(528, 387);
        multiplication(124, 87);
        multiplication(1528, 3);

        calculation();
    }
}


