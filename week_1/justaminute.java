import java.util.Scanner;

public class justaminute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int observation = input.nextInt();
        int total_minute_disp = 0;
        int total_second_wait = 0;
        for (int i = 0; i < observation; i++) {
            total_minute_disp += input.nextInt();
            total_second_wait += input.nextInt();
        }
        double result = (double) total_second_wait / ((double) total_minute_disp * 60);
        if (result <= 1) {
            System.out.println("measurement error");
        } else {
            System.out.print(String.format("%.10g%n", result));
        }
        input.close();
    }
}
