import java.util.Scanner;
import java.util.*;

public class scalingrecipe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        int port_made = input.nextInt();
        int port_need = input.nextInt();
        List<Integer> result_list = new ArrayList<Integer>(n);
        double ratio = (double) port_need / (double) port_made;
        while (i < n) {
            int ingredient = input.nextInt();
            double result = (double) ingredient * ratio;
            result_list.add((int) Math.round(result));
            i++;
        }
        i -= i;
        while (i < n) {
            System.out.println(result_list.get(i));
            i++;
        }
        input.close();
    }
}
