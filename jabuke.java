import java.util.Scanner;
import java.util.*;

public class jabuke {
    static double area_calc(double x_1, double y_1, double x_2, double y_2, double x_3, double y_3) {
        double result = Math.abs(((x_1 * (y_2 - y_3)) + (x_2 * (y_3 - y_1)) + (x_3 * (y_1 - y_2))) / 2);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x_A = input.nextInt();
        int y_A = input.nextInt();
        int x_B = input.nextInt();
        int y_B = input.nextInt();
        int x_C = input.nextInt();
        int y_C = input.nextInt();
        int tree_num = input.nextInt();
        int count = 0;
        List<Integer> x_list = new ArrayList<Integer>();
        List<Integer> y_list = new ArrayList<Integer>();
        for (int i = 0; i < tree_num; i++) {
            x_list.add(input.nextInt());
            y_list.add(input.nextInt());
        }
        double area_sample = area_calc(x_A, y_A, x_B, y_B, x_C, y_C);
        for (int i = 0; i < tree_num; i++) {
            double area_1 = area_calc(x_list.get(i), y_list.get(i), x_B, y_B, x_C, y_C);
            double area_2 = area_calc(x_A, y_A, x_list.get(i), y_list.get(i), x_C, y_C);
            double area_3 = area_calc(x_A, y_A, x_B, y_B, x_list.get(i), y_list.get(i));
            if ((area_1 + area_2 + area_3) <= area_sample) {
                count++;
            }
        }
        double result = Math.round(area_sample * (Math.pow(10, 2))) / (Math.pow(10, 2));
        System.out.println(result);
        System.out.println(count);
        input.close();
    }
}
