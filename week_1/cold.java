import java.util.Scanner;

public class cold {
    public static void main(String[] args) {
        Scanner weather = new Scanner(System.in);
        int n;
        int day_below_zero = 0;
        n = weather.nextInt();
        for (int i = 0; i < n; i++) {
            if (weather.nextInt() < 0) {
                day_below_zero++;
            }
        }
        System.out.println("Number of days below zero: " + day_below_zero);
        weather.close();
    }
}