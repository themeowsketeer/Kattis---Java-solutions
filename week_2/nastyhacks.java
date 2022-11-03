import java.util.*;

public class nastyhacks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> results = new ArrayList<String>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int r = input.nextInt();
            int e = input.nextInt();
            int c = input.nextInt();
            if (r < (e - c)) {
                results.add("advertise");
            } else if (r == (e - c)) {
                results.add("does not matter");
            } else {
                results.add("do not advertise");
            }
        }
        input.close();
        for (int i = 0; i < n; i++) {
            System.out.println(results.get(i));
        }
    }
}
