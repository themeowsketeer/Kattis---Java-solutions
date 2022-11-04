import java.util.Scanner;

public class jewelrybox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        for (int i = 0; i < testcase; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            double height = (x + y - Math.sqrt(Math.pow(x + y, 2) - 3 * x * y)) / 6;
            System.out.println(height * (x - 2 * height) * (y - 2 * height));
        }
        input.close();
    }
}