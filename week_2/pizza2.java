import java.util.Scanner;

public class pizza2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radianPizza = input.nextInt();
        int radianCrust = input.nextInt();
        input.close();
        float percent = ((float) (radianPizza - radianCrust) * (radianPizza - radianCrust))
                / (radianPizza * radianPizza);
        System.out.println(percent * 100);
    }
}
