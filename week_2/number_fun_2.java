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
        int N = input.nextInt();
        String result[] = new String[N];
        for (int i = 0; i < N; i++) {
            double A = input.nextDouble();
            double B = input.nextDouble();
            double C = input.nextDouble();
            result[i] = calculation(A, B, C);
        }
        input.close();
        for (int i = 0; i < N; i++) {
            System.out.println(result[i]);
        }
    }
}
