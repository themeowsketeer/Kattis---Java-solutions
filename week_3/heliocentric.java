import java.util.Scanner;

public class heliocentric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseNum = 1;
        while (input.hasNext()) {
            int earthDay = input.nextInt();
            int marsDay = input.nextInt();
            int dayTill0;
            for (dayTill0 = 0; earthDay != 0 || marsDay != 0; dayTill0++) {
                earthDay = (earthDay + 1) % 365;
                marsDay = (marsDay + 1) % 687;
            }
            System.out.format("Case %d: %d%n", caseNum++, dayTill0);
        }
        input.close();
    }
}