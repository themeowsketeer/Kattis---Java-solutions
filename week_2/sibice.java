import java.util.Scanner;
import java.util.*;

public class sibice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int W = input.nextInt();
        int H = input.nextInt();
        int hypotenuse = (int) (Math.sqrt(W * W + H * H));
        List<String> results = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            int testcase = input.nextInt();
            if (testcase <= hypotenuse) {
                results.add("DA");
            } else {
                results.add("NE");
            }
        }
        input.close();
        for (int i = 0; i < N; i++) {
            System.out.println(results.get(i));
        }
    }
}
