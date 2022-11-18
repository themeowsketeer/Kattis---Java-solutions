import java.util.Scanner;
import java.util.*;

public class whatdoesthefoxsay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String testcaseNumString = input.nextLine();
        int testcasesNum = Integer.parseInt(testcaseNumString);
        for (int i = 0; i < testcasesNum; i++) {
            ArrayList<String> sample = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
            List<String> animalSounds = new ArrayList<String>();
            while (true) {
                String animalGoes = input.nextLine();
                if (animalGoes.equals("what does the fox say?")) {
                    break;
                } else {
                    String[] temp = animalGoes.split(" ");
                    animalSounds.add(temp[temp.length - 1]);
                }
            }
            String result = "";
            for (String sound : sample) {
                if (animalSounds.contains(sound)) {
                    continue;
                } else {
                    result += sound + " ";
                }
            }
            System.out.println(result);
        }
        input.close();
    }
}