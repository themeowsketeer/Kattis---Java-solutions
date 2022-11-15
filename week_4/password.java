import java.util.Scanner;
import java.util.Arrays;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcasesNum = input.nextInt();
        String[] passwordsList = new String[testcasesNum];
        double[] percentagesList = new double[testcasesNum];
        double finalAttempt = 0.0;
        for (int i = 0; i < testcasesNum; i++) {
            passwordsList[i] = input.next();
            percentagesList[i] = input.nextDouble();
        }
        Arrays.sort(percentagesList);
        for (int i = testcasesNum - 1; i >= 0; i--) {
            finalAttempt += percentagesList[i] * (testcasesNum - i);
        }
        System.out.println(finalAttempt);
        input.close();
    }
}
