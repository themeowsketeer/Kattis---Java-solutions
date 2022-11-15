import java.util.Scanner;
import java.util.*;

public class everywhere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcasesNum = input.nextInt();
        for (int i = 0; i < testcasesNum; i++) {
            int numCities = input.nextInt();
            Set<String> visitedCities = new HashSet<String>();
            for (int j = 0; j < numCities; j++) {
                visitedCities.add(input.next());
            }
            System.out.println(visitedCities.size());
        }
        input.close();
    }
}