import java.util.Scanner;
import java.util.*;

public class bijele {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> input_set = new ArrayList<Integer>();
        List<Integer> standard_set = List.of(1, 1, 2, 2, 2, 8);
        List<Integer> output_set = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            input_set.add(input.nextInt());
            output_set.add(input_set.get(i) - standard_set.get(i));
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(output_set.get(i) + " ");
        }
        input.close();
    }
}
