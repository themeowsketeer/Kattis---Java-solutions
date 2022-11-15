import java.util.Scanner;

public class conundrum {
    public static void main(String[] args) {
        String sample = "PER";
        for (int i = 1; i < 100; i++) {
            sample += "PER";
        }
        Scanner input = new Scanner(System.in);
        String testcase = input.next();
        input.close();
        int dayNeedChange = 0;
        for (int i = 0; i < testcase.length(); i++) {
            if (sample.charAt(i) != testcase.charAt(i)) {
                dayNeedChange++;
            }
        }
        System.out.println(dayNeedChange);
    }
}
