import java.util.*;

public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // boolean prime;
        // if (n % 2 != 0) {
        // n = n + 1;
        // }
        // int i = n / 2;

        int primearr[] = new int[n];
        int fibarr[] = new int[n];
        // Store prime numbers in primearr
        // for (int i = 2; i < n; i++) {
        // int flag = 0;
        // for (int j = 2; j < i; j++) {
        // if (i % j == 0) {
        // flag = 1;
        // break;
        // }
        // }
        // if (flag == 0) {
        // primearr[prime] = i;
        // prime++;
        // System.out.println(primearr[prime]);
        // }
        // }
        int[] primes = new int[n];
        int ncounter = 0;
        int isPrime = 2;

        while (ncounter < n) {
            boolean prime = true;
            for (int j = 2; j < isPrime; j++) {
                if (isPrime % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes[ncounter] = isPrime;
                ncounter++;
            }
            isPrime++;
        }
        for (int j = 0; j < n; j++) {
            fibarr[j] = fib(j);
        }
        for (int j = 0; j < n / 2; j++) {
            System.out.print(fibarr[j + 1] + " " + primes[j] + " ");
        }

    }

    // public static boolean isPrime(int n) {
    // if (n == 0 || n == 1) {
    // return false;
    // }
    // for (int i = 2; i < n; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
