import java.util.Scanner;

public class howmanydigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] factorialDigits = new double[10000001];
        for (int i = 1; i < 10000001; i++) {
            factorialDigits[i] = Math.log10(i) + factorialDigits[i - 1];
        }
        factorialDigits[0] = 1;
        factorialDigits[1] = 1;
        while (input.hasNext()) {
            int number = input.nextInt();
            System.out.println((int) Math.ceil(factorialDigits[number]));
        }
        input.close();
    }
}
