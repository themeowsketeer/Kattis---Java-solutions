import java.util.Scanner;

public class ladder {
    public static void main(String[] args) {
        Scanner figure = new Scanner(System.in);
        int height = figure.nextInt();
        int angle = figure.nextInt();
        double ladder = height / Math.sin(Math.toRadians((double) angle));
        System.out.println((int) Math.ceil(ladder));
        figure.close();
    }
}
