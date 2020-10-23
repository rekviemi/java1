package ru.progwards.java1.lessons.arrays;


import java.util.Arrays;

//3.1 в классе разместить private переменную - массив целых чисел.
//        3.2 конструктор - по умолчанию.
//        3.2 метод
//public void add(int num) - добавляет элемент num в конец массива, при этом размер массива должен увеличиться на 1.
// Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, и добавить в хвост элемент num.
//        3.3 метод
//public void atInsert(int pos, int num) - добавляет элемент num в позицию pos массива, при этом размер массива должен увеличиться на 1. Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, c учетом того, что новый элемент окажется где-то в середине, и потом положить в нужный индекс элемент num.
//        3.4 метод
//public void atDelete(int pos) - удаляет элемент в позиции pos массива, при этом размер массива должен уменьшиться на 1. Для этого нужно будет разместить новый массив нужного размера, скопировать в него старый, уже без элемента, который был в позиции pos.
//        3.5 метод
//public int at(int pos) - возвращает элемент по индексу pos.
public class DIntArray {
    private int[] arrayInt;

    public DIntArray() {
        arrayInt = new int[0];
    }

    public void add(int num) {
        int[] arrayIntCopy = Arrays.copyOf(arrayInt, arrayInt.length + 1);
        arrayIntCopy[arrayInt.length] = num;
        arrayInt = Arrays.copyOf(arrayIntCopy, arrayIntCopy.length);
        System.out.println(Arrays.toString(arrayInt));
    }

    public void atInsert(int pos, int num) {
        return;
    }

    public void atDelete(int pos) {
        return;
    }
    public int at(int pos){
        return 0;
    }

    public static void main(String[] args) {
        DIntArray arrayInt = new DIntArray();
        arrayInt.add(2);
    }
}
