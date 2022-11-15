import java.util.Scanner;

public class savingdaylight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String month = input.next();
            int day = input.nextInt();
            int year = input.nextInt();
            String dayDawn = input.next();
            String dayDusk = input.next();
            int hourDawn = 0;
            int minuteDawn = 0;
            int hourDusk = 0;
            int minuteDusk = 0;
            if (dayDawn.length() == 4) {
                hourDawn = Integer.parseInt(dayDawn, 0, 1, 10);
                minuteDawn = Integer.parseInt(dayDawn, 2, 4, 10);
            } else {
                hourDawn = Integer.parseInt(dayDawn, 0, 2, 10);
                minuteDawn = Integer.parseInt(dayDawn, 3, 5, 10);
            }
            if (dayDusk.length() == 4) {
                hourDusk = Integer.parseInt(dayDusk, 0, 1, 10);
                minuteDusk = Integer.parseInt(dayDusk, 2, 4, 10);
            } else {
                hourDusk = Integer.parseInt(dayDusk, 0, 2, 10);
                minuteDusk = Integer.parseInt(dayDusk, 3, 5, 10);
            }
            int hourLast = hourDusk - hourDawn;
            int minuteLast = 0;
            if (minuteDawn > minuteDusk) {
                minuteLast = minuteDusk + 60 - minuteDawn;
                hourLast--;
            } else {
                minuteLast = minuteDusk - minuteDawn;
            }
            System.out.format("%s %d %d %d hours %d minutes%n", month, day, year, hourLast, minuteLast);
        }
        input.close();
    }
}
