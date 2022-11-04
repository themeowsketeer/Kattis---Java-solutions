import java.util.Scanner;

public class hissingmicrophone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int check = 1;
        input.close();
        for (int i = 0; i < word.length() - 1; i++) {
            char char_1 = word.charAt(i);
            char char_2 = word.charAt(i + 1);
            if (char_1 == 's' && char_2 == 's') {
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
