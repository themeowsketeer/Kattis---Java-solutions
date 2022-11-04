import java.util.Scanner;

public class number_fun_2 {
    public static String calculation(double a, double b, double c) {
        String result = "Impossible";
        if ((a + b == c) || (a + c == b) || (b + c == a)) {
            result = "Possible";
        }
        if ((a - b == c) || (b - a == c) || (a - c == b) || (c - a == b) || (b - c == a) || (c - b == a)) {
            result = "Possible";
        }
        if ((a * b == c) || (a * c == b) || (b * c == a)) {
            result = "Possible";
        }
        if ((a / b == c) || (b / a == c) || (a / c == b) || (c / a == b) || (b / c == a) || (c / b == a)) {
            result = "Possible";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTestcase = input.nextInt();
        String result[] = new String[numTestcase];
        for (int i = 0; i < numTestcase; i++) {
            double numA = input.nextDouble();
            double numB = input.nextDouble();
            double numC = input.nextDouble();
            result[i] = calculation(numA, numB, numC);
        }
        input.close();
        for (int i = 0; i < numTestcase; i++) {
            System.out.println(result[i]);
        }
    }
}
