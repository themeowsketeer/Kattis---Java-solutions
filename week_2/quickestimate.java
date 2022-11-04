import java.util.Scanner;

public class quickestimate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTestcase = input.nextInt();
        int digitEachCost[] = new int[numTestcase];
        for (int i = 0; i < numTestcase; i++) {
            String estimatedCost = input.next();
            digitEachCost[i] = estimatedCost.length();
        }
        input.close();
        for (int i = 0; i < numTestcase; i++) {
            System.out.println(digitEachCost[i]);
        }
    }
}
