import java.util.Scanner;

public class server {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int T = input.nextInt();
        int tasks[] = new int[n];
        for (int i = 0; i < n; i++) {
            tasks[i] = input.nextInt();
        }
        input.close();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + tasks[i] <= T) {
                sum += tasks[i];
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
