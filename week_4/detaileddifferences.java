import java.util.Scanner;

public class detaileddifferences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcasesNum = input.nextInt();
        for (int i = 0; i < testcasesNum; i++) {
            String Stringtest1 = input.next();
            String Stringtest2 = input.next();
            char[] charsList = new char[Stringtest1.length()];
            for (int j = 0; j < Stringtest1.length(); j++) {
                if (Stringtest1.charAt(j) == Stringtest2.charAt(j)) {
                    charsList[j] = '.';
                } else {
                    charsList[j] = '*';
                }
            }
            String result = String.valueOf(charsList);
            System.out.println(Stringtest1);
            System.out.println(Stringtest2);
            System.out.println(result);
            System.out.println();
        }
        input.close();
    }
}
