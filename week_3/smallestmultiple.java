import java.util.Scanner;
import java.math.BigInteger;
import java.util.*;

public class smallestmultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String testcases = input.nextLine();
            List<String> testcasesString = Arrays.asList(testcases.split(" "));
            List<Integer> testcasesInteger = new ArrayList<Integer>();
            BigInteger lcmResult = BigInteger.ONE;
            for (int i = 0; i < testcasesString.size(); i++) {
                int number = Integer.parseInt(testcasesString.get(i));
                testcasesInteger.add(number);
            }
            for (int i : testcasesInteger) {
                lcmResult = lcmResult.multiply(BigInteger.valueOf(i)).divide(lcmResult.gcd(BigInteger.valueOf(i)));
            }
            System.out.println(lcmResult);
        }
        input.close();
    }
}