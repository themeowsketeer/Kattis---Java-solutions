import java.util.Scanner;

public class gcds {
    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seqLength = input.nextInt();
    }
}
