package ru.rekvi.sas;
//89966200664
import java.util.Arrays;
public class Test {

}







/**
 ************************************* change the color of the text in the console *************************************
 * public class Test {
 *     static final String RESET = "\u001b[0m";
 *     static final String BLACK = "\u001b[30m";
 *     static final String RED = "\u001b[31m";
 *     static final String GREEN = "\u001b[32m";
 *
 *     public static void print(String color){
 *         for(int i = 0; i < 30; i++){
 *             System.out.print(color + "\u1F46");
 *         }
 *         System.out.println();
 *     }
 *
 *     public static void main(String[] args) {
 *         print(RESET);
 *         print(RED);
 *         print(GREEN);
 *
 *     }
 * }
 ***********************************************************************************************************************
        public static void main(String[] args) {
        int i = 128;
        //число 128 в двоичной системе
        System.out.println(Integer.toBinaryString(i));
        //обратыный перевод из двоичной системы в десятичную
        System.out.println(Integer.parseInt("10000000", 2));
        //перевод из двоичной системы в восьмиричную
        System.out.println(Integer.toOctalString(i));
        //перевод из двоичной системы в шестнатцатиричную
        System.out.println(Integer.toHexString(i));
    }
}



    byte i = 127;
//число 232 в двоичной системе
        System.out.println(Integer.toBinaryString(i));
//обратыный перевод из двоичной системы в десятичную
                System.out.println(Integer.parseInt("11101000", 2));



    public static int sumBits(byte value) {

        byte sum = 0;
        while (value > 0) {
            sum += value & 1;
            value >>= 1;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3};
        System.out.println(Arrays.toString(arrayInt));
        int[] copyArrayInt = new int[arrayInt.length + 1];
        System.arraycopy(arrayInt, 0, copyArrayInt, 0, arrayInt.length);
        copyArrayInt[arrayInt.length] = 1000000;
        System.out.println("должен появиться 4 элемент массива с числом 1 миллион" + "\n" + Arrays.toString(copyArrayInt));

        String st = "Учимся программировать";
        System.out.println(st);
        char s[] = st.toCharArray();  // конвертируем строку в массив символов, затем выводим символы на экран в обратном порядке
        for (int x = s.length - 1; x >= 0; x--) {
            System.out.print(s[x]);
        }
    }


class Test {
    public static double addTenPercent(int i) {
        double a = (i * 0.10);
        return a + i;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}

class Test{
    public static void main(String[] args) {
        int [] simpleArray1 = new int[5];
        int [] simpleArray2 = {21, 34, 55, 89, 144};
        int simpleArray3 [] = {144, 34, 55, 89, 21};

        String [] stringArray1 = new String[5];
        String [] stringArray2 = {"мне", "всё", "понятно"};
        System.out.println("simpleArray2[2] = " + simpleArray2[2]);
        boolean testFibo = simpleArray2[2] + simpleArray2[3] == simpleArray2[4];
        System.out.println("testFibo = " + testFibo );
    }
}



    public static double volumeBallDouble(double radius){
        double v = 4/3.03.14(radiusradiusradius);
        return v;
    }
    public static float volumeBallFloat(float radius){
        float v1 = 4/3.0f3.14f((float)radius(float)radius(float)radius);
        return v1;
    }
    public static double calculateAccuracy(double radius){
        return volumeBallDouble ((float)radius) - volumeBallFloat((float) radius);
    }

    public static void main(String[] args) {
        volumeBallDouble(6371.2);
        volumeBallFloat(6371.2f);
        System.out.println(volumeBallDouble (6371.2) - volumeBallFloat(6371.2f));
}
    */
