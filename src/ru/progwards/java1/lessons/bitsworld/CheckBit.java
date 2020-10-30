package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {

    public static int checkBit(byte value, int bitNumber) {

      // return ((value >> (bitNumber -1)) & 1);
       // return (byte) (value >> (bitNumber - 1));
        return (value >> bitNumber) & 1;
    }

    public static void main(String[] args) {
        System.out.println(checkBit((byte) 84, 0));// 84-0 = 0 ___ 85-0 = 1
        System.out.println(checkBit((byte) 85, 4));
    }
}
/* for me
2.1 Реализовать функцию public static int checkBit(byte value, int bitNumber) которая возвращает значение бита
с порядковым номером bitNumber от параметра value. При этом следует помнить,
что нумерация начинается с нуля и нулевой бит является младшим.

Подсказки:
при реализации этой функции следует использывать опыт, полученный при решении предыдущей задачи;
кроме того, удобно использовать битовую операцию сдвиг вправо >>.
 */