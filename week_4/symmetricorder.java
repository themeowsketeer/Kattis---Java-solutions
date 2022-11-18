import java.util.Scanner;
import java.util.*;

public class symmetricorder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int setCounter = 1;
        while (true) {
            int nameCount = input.nextInt();
            if (nameCount == 0) {
                break;
            }
            ArrayList<String> namesList = new ArrayList<String>();
            for (int i = 0; i < nameCount; i++) {
                namesList.add(input.next());
            }
            ArrayList<String> finalList_1 = new ArrayList<String>();
            ArrayList<String> finalList_2 = new ArrayList<String>();
            for (int i = 0; i < nameCount; i++) {
                if (i % 2 == 0) {
                    finalList_1.add(namesList.get(i));
                } else {
                    finalList_2.add(namesList.get(i));
                }
            }
            System.out.println("SET " + setCounter);
            for (int i = 0; i < finalList_1.size(); i++) {
                System.out.println(finalList_1.get(i));
            }
            for (int i = finalList_2.size() - 1; i >= 0; i--) {
                System.out.println(finalList_2.get(i));
            }
            setCounter++;
        }
        input.close();
    }
}
