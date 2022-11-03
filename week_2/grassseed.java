import java.util.Scanner;

public class grassseed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C = input.nextDouble();
        int L = input.nextInt();
        double sum = 0.0;
        for (int i = 0; i < L; i++) {
            double width = input.nextDouble();
            double length = input.nextDouble();
            sum += width * length;
        }
        input.close();
        sum *= C;
        System.out.println(String.format("%.9g%n", sum));
    }
}
