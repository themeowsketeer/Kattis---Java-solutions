import java.util.Scanner;

public class quickestimate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int result[] = new int[N];
        for (int i = 0; i < N; i++) {
            String number = input.next();
            result[i] = number.length();
        }
        input.close();
        for (int i = 0; i < N; i++) {
            System.out.println(result[i]);
        }
    }
}
