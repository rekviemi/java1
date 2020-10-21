package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;

    public Eratosthenes(int N) {
        boolean[] sieve = new boolean[N];
        Arrays.fill(sieve, true);
        sift();
    }

    private void sift() {

        for (int i = 2; i * i < 0; i++) {
            if (sieve[i]) {
                for (int j = 2 * i; j < 0; j += i) {
                    sieve[j] = false;
                }
            }
        }
    }

    public static boolean isSimple(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i > n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isSimple(54));
    }
}



