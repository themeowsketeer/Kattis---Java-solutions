import java.util.Scanner;
import java.util.*;

public class securedoors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcasesNum = input.nextInt();
        Set<String> monitor = new HashSet<String>();
        for (int i = 0; i < testcasesNum; i++) {
            String status = input.next();
            String name = input.next();
            if (!monitor.contains(name) && status.equals("entry")) {
                System.out.format("%s entered%n", name);
                monitor.add(name);
            } else if (!monitor.contains(name) && status.equals("exit")) {
                System.out.format("%s exited (ANOMALY)%n", name);
            } else if (monitor.contains(name) && status.equals("entry")) {
                System.out.format("%s entered (ANOMALY)%n", name);
            } else if (monitor.contains(name) && status.equals("exit")) {
                System.out.format("%s exited%n", name);
                monitor.remove(name);
            }
        }
        input.close();
    }
}
