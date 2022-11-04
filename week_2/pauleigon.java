import java.util.Scanner;

public class pauleigon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int serveCount = input.nextInt();
        int paulScore = input.nextInt();
        int opponentScore = input.nextInt();

        if (Math.ceil((paulScore + opponentScore) / serveCount) % 2 == 0) {
            System.out.println("paul");
        } else {
            System.out.println("opponent");
        }
        input.close();
    }
}
