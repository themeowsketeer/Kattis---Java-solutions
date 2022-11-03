import java.util.Scanner;

public class hissingmicrophone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sample = input.next();
        int check = 1;
        input.close();
        for (int i = 0; i < sample.length() - 1; i++) {
            char test1 = sample.charAt(i);
            char test2 = sample.charAt(i + 1);
            if (test1 == 's' && test2 == 's') {
                check = 0;
                break;
            } else {
                check = 1;
            }
        }
        if (check > 0) {
            System.out.println("no hiss");
        } else {
            System.out.println("hiss");
        }
    }
}
