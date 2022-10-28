import java.util.Scanner;

public class random_seq {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(Math.random());
        }
        number.close();
    }
}
