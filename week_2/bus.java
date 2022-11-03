import java.util.Scanner;

public class bus {
    public static int calc(int test) {
        int answers[] = new int[test];
        answers[0] = 1;
        int result = 0;
        if (test > 1) {
            for (int j = 1; j < test; j++) {
                answers[j] += answers[j - 1] * 2;
            }
            for (int i = 0; i < test; i++) {
                result += answers[i];
            }
        } else if (test == 1) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int results[] = new int[N];
        for (int i = 0; i < N; i++) {
            int test = input.nextInt();
            results[i] = calc(test);
        }
        input.close();
        for (int i = 0; i < N; i++) {
            System.out.println(results[i]);
        }
    }
}