import java.util.Scanner;

public class isithalloween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = input.next();
        int day = input.nextInt();
        input.close();
        if ((month.equals("OCT") && day == 31) || (month.equals("DEC") && day == 25)) {
            System.out.println("yup");
        } else
            System.out.println("nope");
    }
}