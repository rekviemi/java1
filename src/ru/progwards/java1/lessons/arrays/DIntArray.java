package ru.progwards.java1.lessons.arrays;


import java.util.Arrays;

/*
задание разместил для себя, чтоб было всегда на виду
    3.1 в классе разместить private переменную - массив целых чисел.
    3.2 конструктор - по умолчанию.
    3.2 метод
public void add(int num) - добавляет элемент num в конец массива, при этом размер массива должен увеличиться на 1.
Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, и добавить в хвост элемент num.
    3.3 метод
public void atInsert(int pos, int num) - добавляет элемент num в позицию pos массива, при этом размер
массива должен увеличиться на 1. Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый,
c учетом того, что новый элемент окажется где-то в середине, и потом положить в нужный индекс элемент num.
    3.4 метод
public void atDelete(int pos) - удаляет элемент в позиции pos массива, при этом размер массива должен уменьшиться на 1.
Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, уже без элемента, который был в позиции pos.
    3.5 метод
public int at(int pos) - возвращает элемент по индексу pos.
*/
public class DIntArray {
    private int[] arrayInt;

    public DIntArray() {

        arrayInt = new int[0];
    }

    public void add(int num) {
        int[] copyArrayInt = new int[arrayInt.length + 1];
        System.arraycopy(arrayInt, 0, copyArrayInt, 0, arrayInt.length);
        copyArrayInt[arrayInt.length] = num;
        arrayInt = copyArrayInt;
    }

    public void atInsert(int pos, int num) {
        int[] copyArrayInt = new int[arrayInt.length + 1];
        System.arraycopy(arrayInt, 0, copyArrayInt, 0, pos);
        System.arraycopy(arrayInt, pos, copyArrayInt, pos + 1, arrayInt.length - pos);
        copyArrayInt[pos] = num;
        arrayInt = copyArrayInt;
    }

    public void atDelete(int pos) {
        int[] copyArrayInt = new int[arrayInt.length - 1];
        System.arraycopy(arrayInt, 0, copyArrayInt, 0, pos);
        System.arraycopy(arrayInt, pos + 1, copyArrayInt, pos, arrayInt.length - pos - 1);
        arrayInt = copyArrayInt;
    }

    public int at(int pos) {
        return arrayInt[pos];

    }

    public static void main(String[] args) {
        DIntArray arr = new DIntArray();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        System.out.println(Arrays.toString(arr.arrayInt));
        System.out.println(arr.at(1));
        arr.atInsert(3, 150000);
        System.out.println(Arrays.toString(arr.arrayInt));
        arr.atDelete(10);
        System.out.println(Arrays.toString(arr.arrayInt));

    }
}

