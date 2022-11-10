import java.util.Scanner;

public class areal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area = input.nextDouble();
        input.close();
        double perimeter = Math.sqrt(area) * 4;
        System.out.println(perimeter);
    }
}
