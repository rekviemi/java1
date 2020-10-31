package ru.progwards.java1.lessons.bitsworld;

public class Binary {
private byte num;

    public Binary(byte num) {
        this.num = num;
    }

    public String toString() {
//первое решение которое нашёл без циклов
//        String result = "";
//        result += (num >> 7) & 0b00000001;
//        result += (num >> 6) & 0b00000001;
//        result += (num >> 5) & 0b00000001;
//        result += (num >> 4) & 0b00000001;
//        result += (num >> 3) & 0b00000001;
//        result += (num >> 2) & 0b00000001;
//        result += (num >> 1) & 0b00000001;
//        result += (num >> 0) & 0b00000001;
//        return result;

        String result = "";
        for (int i = 0; i < 8; i++){
            result = (num & 0b1) + result;
            num >>>= 1;
        }
        return result;
    }


    public static void main(String[] args) {
        Binary bin = new Binary((byte) -128);
        System.out.println(bin);
    }
}

/*
3.1 Реализовать конструктор
public Binary(byte num).
3.2 Реализовать метод
public String toString(), который возвращает двоичное представление числа типа byte, используя только битовые операции.
 В выводимом значении всегда должно быть 8 символов
Например:
0: "00000000"
1: "00000001"
127: "01111111"
-128: "10000000"
-1: "11111111"
 */
