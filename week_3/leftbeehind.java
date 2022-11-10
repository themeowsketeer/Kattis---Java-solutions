import java.util.Scanner;

public class leftbeehind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int sweetHoney = input.nextInt();
            int sourHoney = input.nextInt();
            if (sourHoney == 0 && sweetHoney == 0) {
                break;
            }
            if ((sourHoney + sweetHoney) == 13) {
                System.out.println("Never speak again.");
            } else if (sourHoney > sweetHoney) {
                System.out.println("Left beehind.");
            } else if (sourHoney == sweetHoney) {
                System.out.println("Undecided.");
            } else {
                System.out.println("To the convention.");
            }
        }
        input.close();
    }
}
