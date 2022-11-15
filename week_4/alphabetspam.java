import java.util.Scanner;

public class alphabetspam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sample = input.next();
        double uppercaseCount = 0.0;
        double lowercaseCount = 0.0;
        double spaceCount = 0.0;
        double symbolCount = 0.0;
        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) >= 'A' && sample.charAt(i) <= 'Z') {
                uppercaseCount++;
            } else if (sample.charAt(i) >= 'a' && sample.charAt(i) <= 'z') {
                lowercaseCount++;
            } else if (sample.charAt(i) == ('_')) {
                spaceCount++;
            } else {
                symbolCount++;
            }
        }
        input.close();
        System.out.println(spaceCount / sample.length());
        System.out.println(lowercaseCount / sample.length());
        System.out.println(uppercaseCount / sample.length());
        System.out.println(symbolCount / sample.length());
    }
}
