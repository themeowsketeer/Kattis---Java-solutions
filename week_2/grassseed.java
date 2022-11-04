import java.util.Scanner;

public class grassseed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double seedCostPerMetre = input.nextDouble();
        int numLawn = input.nextInt();
        double sumLawn = 0.0;
        for (int i = 0; i < numLawn; i++) {
            double width = input.nextDouble();
            double length = input.nextDouble();
            sumLawn += width * length;
        }
        input.close();
        sumLawn *= seedCostPerMetre;
        System.out.println(String.format("%.9g%n", sumLawn));
    }
}
