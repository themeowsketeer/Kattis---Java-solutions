import java.util.Scanner;
import java.util.*;

public class parking_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int parkingCost[] = new int[4];
        parkingCost[0] = 0;
        for (int i = 1; i < 4; i++) {
            parkingCost[i] = input.nextInt();
        }
        List<Integer> parkingTime = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            parkingTime.add(input.nextInt());
        }
        input.close();
        int result = 0;
        int currentcarParked = 0;
        for (int i = Collections.min(parkingTime); i < Collections.max(parkingTime); i++) {
            if (i == parkingTime.get(0)) {
                currentcarParked++;
            }
            if (i == parkingTime.get(2)) {
                currentcarParked++;
            }
            if (i == parkingTime.get(4)) {
                currentcarParked++;
            }
            if (i == parkingTime.get(1)) {
                currentcarParked--;
            }
            if (i == parkingTime.get(3)) {
                currentcarParked--;
            }
            if (i == parkingTime.get(5)) {
                currentcarParked--;
            }
            result += currentcarParked * parkingCost[currentcarParked];
        }
        System.out.println(result);
    }
}
