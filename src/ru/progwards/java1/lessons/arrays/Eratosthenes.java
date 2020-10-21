package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;

    public Eratosthenes(int N) {
        boolean[] sieve = new boolean[N + 1];
//        for (int i = 2; i <= N; i++) {
//            sieve[i] = true;
//        }
    }

    private void sift() {
        int max = 0;
        boolean[] isPrime = new boolean[max];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i < max; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j < max; j += i) {
                   isPrime[j] = false;
                }
            }
        }
    }

    public boolean isSimple(int n) {
        return true;
    }

    public static void main(String[] args) {
    }
}
