package Unit2;

import java.math.BigInteger;

public class problem3 {
    public static void main(String args[]) {
        long x = 600851475143L;
        for (double z = 2; z <= x; z++) {
            if (x%z == 0) {
                while( x%z == 0)
                    x = (long) (x/z);
                System.out.println(z + "PRIME FACTOR");
            }
        }
        }


    public static boolean isEven(long num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(long n) {
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}




