package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private int N;
    private boolean[] sieve;

    public Eratosthenes(int N) {
        boolean[] sieve = new boolean[N];
        Arrays.fill(sieve, true);
    }

    private void sift() {
//        for (int i = 2; i <= N - 1; i++) {
//            if (sieve[i]) {
//                for (int j = 2 * i; j <= N; j += i) {
//                    sieve[j] = false;
//                }
//            }
//        }
    }


    public static boolean isSimple(int n) {
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0) {
            return n == 2;
        }
        if (n % 3 == 0) {
            return n == 3;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isSimple(2));
    }
}



