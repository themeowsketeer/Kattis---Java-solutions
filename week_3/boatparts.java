import java.util.Scanner;
import java.util.*;

public class boatparts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int boatParts = input.nextInt();
        int daySailed = input.nextInt();
        Set<String> partsReplaced = new HashSet<String>();
        int dayLastReplaced = 0;
        for (int i = 1; i <= daySailed; i++) {
            partsReplaced.add(input.next());
            if (partsReplaced.size() == boatParts) {
                dayLastReplaced = i;
                break;
            }
        }
        input.close();
        if (dayLastReplaced == 0) {
            System.out.println("paradox avoided");
        } else {
            System.out.println(dayLastReplaced);
        }
    }
}
