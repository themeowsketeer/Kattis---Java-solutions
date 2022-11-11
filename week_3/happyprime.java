import java.util.Scanner;
import java.util.*;

public class happyprime {
    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean isHappy(int n) {
        do {
            int sum = 0;
            while (n / 10 != 0) {
                int remainder = n % 10;
                n /= 10;
                sum += remainder * remainder;
            }
            sum += n * n;
            n = sum;
        } while (n != 1 && n != 4);
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numInputs = input.nextLine();

        for (int i = 0; i < Integer.parseInt(numInputs); i++) {
            String line = input.nextLine();
            List<String> splitLine = Arrays.asList(line.split(" "));
            int testcase = Integer.parseInt(splitLine.get(1));
            if (isPrime(testcase)) {
                if (testcase == 2 || testcase == 3) {
                    System.out.format("%s %d NO\n", splitLine.get(0), testcase);
                } else {
                    if (isHappy(testcase)) {
                        System.out.format("%s %d YES\n", splitLine.get(0), testcase);
                    } else {
                        System.out.format("%s %d NO\n", splitLine.get(0), testcase);
                    }
                }
            } else {
                System.out.format("%s %d NO\n", splitLine.get(0), testcase);
            }
        }
        input.close();
    }
}