import java.util.Scanner;
import java.util.*;

public class differentdistances {
    public static String distance_calc(double x1, double x2, double y1, double y2, double p) {
        double x_sum = Math.pow(Math.abs(x1 - x2), p);
        double y_sum = Math.pow(Math.abs(y1 - y2), p);
        double result = Math.pow((x_sum + y_sum), (1.0 / p));
        return (String.format("%.11g%n", result));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> sample_result = new ArrayList<String>();
        int i = 0;
        while (i == 0) {
            double x_1 = input.nextDouble();
            if ((int) Math.ceil(x_1) == 0) {
                break;
            }
            double y_1 = input.nextDouble();
            double x_2 = input.nextDouble();
            double y_2 = input.nextDouble();
            double p = input.nextDouble();
            sample_result.add(distance_calc(x_1, x_2, y_1, y_2, p));
        }
        for (int j = 0; j < sample_result.size(); j++) {
            System.out.println(sample_result.get(j));
        }
        input.close();
    }
}
