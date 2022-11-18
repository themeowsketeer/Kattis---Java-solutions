import java.util.Scanner;
import java.util.*;

public class zoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int listOrder = 1;
        while (true) {
            String animalsNum = input.nextLine();
            int animalsCount = Integer.parseInt(animalsNum);
            if (animalsCount == 0) {
                break;
            }
            List<String> animalList = new ArrayList<String>();
            for (int i = 0; i < animalsCount; i++) {
                String animal = input.nextLine();
                String[] animalArray = animal.split(" ");
                String animalType = animalArray[animalArray.length - 1].toLowerCase();
                animalList.add(animalType);
            }
            System.out.format("List %d: %n", listOrder);
            TreeSet<String> sortedAnimalList = new TreeSet<String>(animalList);
            for (String animalType : sortedAnimalList) {
                System.out.println(animalType + " | " + Collections.frequency(animalList, animalType));
            }
            listOrder++;
        }
        input.close();
    }
}
