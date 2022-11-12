import java.util.*;

public class goldbach2 {

    static int MAX = 32000;
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

    static void findPrimes(int n) {
        List<Integer> prime_1 = new ArrayList<>();
        List<Integer> prime_2 = new ArrayList<>();
        int representCount = 0;

        for (int i = 0; primes.get(i) <= n / 2; i++) {
            int diff = n - primes.get(i);
            if (primes.contains(diff)) {
                prime_1.add(primes.get(i));
                prime_2.add(diff);
                representCount++;
            }
        }
        System.out.println(n + " has " + representCount + " representation(s)");
        for (int i = 0; i < representCount; i++) {
            System.out.println(prime_1.get(i) + "+" + prime_2.get(i));
        }
    }

    public static void main(String[] args) {
        sieveSundaram();

        Scanner input = new Scanner(System.in);
        int testcasesNum = input.nextInt();

        for (int i = 0; i < testcasesNum; i++) {
            int n = input.nextInt();
            findPrimes(n);
            System.out.println();
        }
        input.close();
    }
}