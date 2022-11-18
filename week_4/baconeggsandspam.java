import java.util.Scanner;
import java.util.*;

public class baconeggsandspam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            String dinerCount = input.nextLine();
            int dinerOrderCount = Integer.parseInt(dinerCount);
            if (dinerOrderCount == 0) {
                break;
            }
            HashMap<String, ArrayList<String>> orderMap = new HashMap<>();
            ArrayList<String> foodOrdered = new ArrayList<>();
            for (int i = 0; i < dinerOrderCount; i++) {
                String order = input.nextLine();
                String[] orderArray = order.split(" ");
                for (int j = 1; j < orderArray.length; j++) {
                    if (!orderMap.containsKey(orderArray[j])) {
                        ArrayList<String> guestName = new ArrayList<String>();
                        guestName.add(orderArray[0]);
                        orderMap.put(orderArray[j], guestName);
                        foodOrdered.add(orderArray[j]);
                    } else {
                        ArrayList<String> guestName = orderMap.get(orderArray[j]);
                        guestName.add(orderArray[0]);
                        orderMap.put(orderArray[j], guestName);
                    }
                }
            }
            Collections.sort(foodOrdered);
            for (String food : foodOrdered) {
                System.out.format("%s", food);
                ArrayList<String> guestName = orderMap.get(food);
                Collections.sort(guestName);
                for (String name : guestName) {
                    System.out.format(" %s", name);
                }
                System.out.format("%n");
            }
            System.out.println();
        }
        input.close();
    }
}
