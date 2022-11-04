import java.util.Scanner;
import java.util.*;

public class parking {
    public static boolean check_3(List<Integer> test, int i) {
        boolean check = false;
        if ((test.get(0) <= i && i < test.get(1)) &&
                (test.get(2) <= i && i < test.get(3)) &&
                (test.get(4) <= i && i < test.get(5))) {
            check = true;
        }
        return check;
    }

    public static boolean check_2(List<Integer> test, int i) {
        boolean check = false;
        if ((test.get(0) <= i && i < test.get(1)) &&
                (test.get(2) <= i && i < test.get(3))) {
            check = true;
        } else if ((test.get(0) <= i && i < test.get(1)) &&
                (test.get(4) <= i && i < test.get(5))) {
            check = true;
        } else if ((test.get(2) <= i && i < test.get(3)) &&
                (test.get(4) <= i && i < test.get(5))) {
            check = true;
        }
        return check;
    }

    public static boolean check_1(List<Integer> test, int i) {
        boolean check = false;
        if ((test.get(0) <= i && i < test.get(1)) ||
                (test.get(2) <= i && i < test.get(3)) ||
                (test.get(4) <= i && i < test.get(5))) {
            check = true;
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time1Car = input.nextInt();
        int time2Car = input.nextInt();
        int time3Car = input.nextInt();
        int count_time1car = 0;
        int count_time2car = 0;
        int count_time3car = 0;
        List<Integer> parkingTime = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            parkingTime.add(input.nextInt());
        }
        input.close();
        for (int i = Collections.min(parkingTime); i < Collections.max(parkingTime); i++) {
            if (check_3(parkingTime, i)) {
                count_time3car += 3;
            } else if (check_2(parkingTime, i)) {
                count_time2car += 2;
            } else if (check_1(parkingTime, i)) {
                count_time1car++;
            }
        }
        int result = (time1Car * count_time1car) + (time2Car * count_time2car) + (time3Car * count_time3car);
        System.out.println(result);
    }
}
