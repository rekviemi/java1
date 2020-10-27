package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private Boolean[] sieve;

    public Eratosthenes(int N) {
        sieve = new Boolean[N];
        Arrays.fill(sieve, true);
        sift();
    }

    private void sift() {
        for (int i = 2; i <= sieve.length; i++) {
            for (int j = i; j <= sieve.length; j++) {
                if (i * j < sieve.length) {
                    sieve[i * j] = false;
                }
            }
        }
    }

    public boolean isSimple(int n) {
        return sieve[n];
    }

    public static void main(String[] args) {
        Eratosthenes N = new Eratosthenes(100);
        System.out.println(N.isSimple(11));
    }
}


