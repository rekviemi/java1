package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value) {

        int sum = 0;
        for (int i = 0; i < 8; i++)
        {
            sum += (value >> i) & 1;
        }
        return sum;
/**  подсказал наставник Олег
        int result = 0;
        if ((value & 1) == 1)
            result++;
        value >>= 1;
        if ((value & 1) == 1)
            result++;
        value >>= 1;
        if ((value & 1) == 1)
            result++;
        value >>= 1;
        if ((value & 1) == 1)
            result++;
        value >>= 1;
        if ((value & 1) == 1)
            result++;
        value >>= 1;
        if ((value & 1) == 1)
            result++;
        value >>= 1;
        if ((value & 1) == 1)
            result++;
        value >>= 1;
        if ((value & 1) == 1)
            result++;
        return result;
 */
    }


    public static void main(String[] args) {
        System.out.println(sumBits((byte) 0b1000_0000));
        System.out.println(sumBits((byte) 0b0111_0000));
        byte i = 127;
        System.out.println(sumBits(i));
        System.out.println(sumBits((byte) 0b0111_1111));
    }
}
/* for me
1.1 Реализовать функцию public static int sumBits(byte value), которая суммирует все биты параметра value.
        Например, для двоичного числа 0100101 функция должна вернуть 3.

        Подсказки:
        используйте & с числом 1 для того, чтобы оставить только один правый значащий бит;
        используйте сдвиг вправо для того, чтобы проверить следующий бит.
 */
