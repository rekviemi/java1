package ru.progwards.java1.lessons.basics;

class ReverseDigits {
    public static void main(String[] args){}



        public static int reverseDigits( int number){
            int a = number / 100;
            int b = number / 10 % 10;
            int c = number % 10;

            System.out.print(c);
            System.out.print(b);
            System.out.print(a);
            return c + b + a;
        }
    }
