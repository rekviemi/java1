package ru.rekvi.sas;

public class NumberSystem {

    public static String val2Digit(int val) {
        if (val == 10) {
            return "A";
        } else if (val == 11) {
            return "B";
        } else if (val == 12) {
            return "C";
        } else if (val == 13) {
            return "D";
        } else if (val == 14) {
            return "E";
        } else if (val == 15) {
            return "F";
        }
        return Integer.toString(val);
    }

    public static String show(int val, int base){
        String result = "";
        while (val > 0) {
            int remainder = val % base;
            result = val2Digit(remainder) + result;
            val /= base;
        }
        if (result.isEmpty() )
            return "0";
        return result;
    }

    public static void main(String[] args) {
        int value = 2147000000;
        System.out.println("Десячичная система: " + value);
        System.out.println("Двоичная система: " + NumberSystem.show(value, 2));
        System.out.println("Шеснадцатиричная система: " + NumberSystem.show(value, 16));
    }
}
