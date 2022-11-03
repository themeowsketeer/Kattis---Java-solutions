import java.util.Scanner;

public class planina {
    public static int recur_calc(int i) {
        if (i == 0) {
            return 2;
        } else
            return (2 * recur_calc(i - 1) - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();
        int result = recur_calc(N);
        System.out.println(result * result);
    }
}
