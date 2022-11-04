import java.util.*;

public class nastyhacks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> results = new ArrayList<String>();

        int numTestcase = input.nextInt();
        for (int i = 0; i < numTestcase; i++) {
            int revenueNoAdver = input.nextInt();
            int revenueAdver = input.nextInt();
            int costAdver = input.nextInt();

            if (revenueNoAdver < (revenueAdver - costAdver)) {
                results.add("advertise");

            } else if (revenueNoAdver == (revenueAdver - costAdver)) {
                results.add("does not matter");

            } else {
                results.add("do not advertise");
            }
        }
        input.close();
        for (int i = 0; i < numTestcase; i++) {
            System.out.println(results.get(i));
        }
    }
}
