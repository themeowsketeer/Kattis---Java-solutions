import java.util.Scanner;
import java.util.*;

public class sok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> bought = new ArrayList<Double>();
        List<Double> recipe = new ArrayList<Double>();
        List<Double> ratio = new ArrayList<Double>();
        for (int i = 0; i < 3; i++) {
            bought.add(input.nextDouble());
        }
        for (int i = 0; i < 3; i++) {
            recipe.add(input.nextDouble());
        }
        input.close();
        for (int i = 0; i < 3; i++) {
            ratio.add(bought.get(i) / recipe.get(i));
        }
        double min_val = Collections.min(ratio);
        double result_1 = bought.get(0) - (recipe.get(0) * min_val);
        double result_2 = bought.get(1) - (recipe.get(1) * min_val);
        double result_3 = bought.get(2) - (recipe.get(2) * min_val);
        System.out.print(Math.round(result_1 * Math.pow(10, 6)) / Math.pow(10, 6));
        System.out.print(" ");
        System.out.print(Math.round(result_2 * Math.pow(10, 6)) / Math.pow(10, 6));
        System.out.print(" ");
        System.out.print(Math.round(result_3 * Math.pow(10, 6)) / Math.pow(10, 6));
    }
}