import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;

    public static int minNonZeroProduct(int p) {
        long maxVal = (1L << p) - 1;  // 2^p - 1
        long minVal = maxVal - 1;     // 2^p - 2
        long times = (1L << (p - 1)) - 1;  // 2^(p-1) - 1

        long product = modPow(minVal, times, MOD);
        product = (product * maxVal) % MOD;
        return (int) product;
    }

    public static void main(String[] args) {
        int p = 3;
        System.out.println(minNonZeroProduct(p));  // Output should be the minimal non-zero product modulo 10^9 + 7
    }


public static long modPow(long base, long exp, long mod) {
    long result = 1;
    while (exp > 0) {
        if ((exp & 1) != 0) {
            result = (result * base) % mod;
        }
        base = (base * base) % mod;
        exp >>= 1;
    }
    return result;
}
}
