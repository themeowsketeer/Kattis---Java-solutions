import java.util.Scanner;

public class planina {
    public static int pointsCount(int i) {
        if (i == 0) {
            return 2;
        } else
            return (2 * pointsCount(i - 1) - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iterationCount = input.nextInt();
        input.close();
        int result = pointsCount(iterationCount);
        System.out.println(result * result);
    }
}
