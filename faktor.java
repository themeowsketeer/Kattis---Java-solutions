import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int articles_num = input.nextInt();
        int impact_factor = input.nextInt();
        int cits_count = (articles_num * (impact_factor - 1)) + 1;
        System.out.println(cits_count);
        input.close();
    }
}
