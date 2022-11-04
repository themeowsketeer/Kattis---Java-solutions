import java.util.Scanner;
import java.util.*;

public class sibice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTestcase = input.nextInt();
        int width = input.nextInt();
        int height = input.nextInt();
        int hypotenuse = (int) (Math.sqrt(width * width + height * height));
        List<String> results = new ArrayList<String>();
        for (int i = 0; i < numTestcase; i++) {
            int matchLength = input.nextInt();
            if (matchLength <= hypotenuse) {
                results.add("DA");
            } else {
                results.add("NE");
            }
        }
        input.close();
        for (int i = 0; i < numTestcase; i++) {
            System.out.println(results.get(i));
        }
    }
}
