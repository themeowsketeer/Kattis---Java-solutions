import java.util.Scanner;
import java.util.*;

public class yoda {
    public static void main(String[] args) {
        List<Integer> sample = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int figure = input.nextInt();
        int size = 0;
        int temp = figure;
        while (temp > 0) {
            temp = temp / 10;
            size++;
        }
        while (size > 0) {
            figure = figure % 10;
            size--;
        }
    }
}
