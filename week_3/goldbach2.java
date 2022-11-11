import java.util.*;

class goldbach2 {

    static int MAX = 10000;
    static ArrayList<Integer> primes = new ArrayList<Integer>();

    static void sieveSundaram() {
        boolean[] marked = new boolean[MAX / 2 + 100];

        for (int i = 1; i <= (Math.sqrt(MAX) - 1) / 2; i++)
            for (int j = (i * (i + 1)) << 1; j <= MAX / 2; j = j + 2 * i + 1)
                marked[j] = true;

        primes.add(2);
        for (int i = 1; i <= MAX / 2; i++)
            if (marked[i] == false)
                primes.add(2 * i + 1);
    }

    // Function to perform Goldbach's conjecture
    static void findPrimes(int n) {
        // Return if number is not even or less than 3
        if (n <= 2 || n % 2 != 0) {
            System.out.println("Invalid Input ");
            return;
        }

        // Check only upto half of number
        for (int i = 0; primes.get(i) <= n / 2; i++) {
            // find difference by subtracting
            // current prime from n
            int diff = n - primes.get(i);

            // Search if the difference is
            // also a prime number
            if (primes.contains(diff)) {
                // Express as a sum of primes
                System.out.println(primes.get(i) + " + " + diff + " = " + n);
            }
        }
    }

    public static void main(String[] args) {
        sieveSundaram();
        findPrimes(4);
        findPrimes(38);
        findPrimes(100);
    }
}