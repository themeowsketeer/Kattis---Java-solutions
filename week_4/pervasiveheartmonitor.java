import java.util.Scanner;
import java.util.*;

public class pervasiveheartmonitor {
    private static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            List<String> namesList = new ArrayList<String>();
            String namesFinal = "";
            int tempersCount = 0;
            double tempersSum = 0;
            String[] sample = input.nextLine().split(" ");
            for (int i = 0; i < sample.length; i++) {
                if (!isNumeric(sample[i])) {
                    namesList.add(sample[i]);
                } else {
                    tempersSum += Double.parseDouble(sample[i]);
                    tempersCount++;
                }
            }
            tempersSum /= tempersCount;
            for (int i = 0; i < namesList.size(); i++) {
                namesFinal += namesList.get(i) + " ";
            }
            System.out.format("%.6f %s%n", tempersSum, namesFinal);
        }
        input.close();
    }
}