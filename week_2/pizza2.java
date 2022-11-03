import java.util.Scanner;

public class pizza2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R = input.nextInt();
        int C = input.nextInt();
        input.close();
        float percent = ((float) (R - C) * (R - C)) / (R * R);
        System.out.println(percent * 100);
    }
}
