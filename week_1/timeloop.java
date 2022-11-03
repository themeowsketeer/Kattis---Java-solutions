import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        for (int i = 1; i <= limit; i++) {
            System.out.println(i + " Abracadabra");
        }
        input.close();
    }
}
