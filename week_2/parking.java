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
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int count_1 = 0;
        int count_2 = 0;
        int count_3 = 0;
        List<Integer> sample = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            sample.add(input.nextInt());
        }
        input.close();
        for (int i = Collections.min(sample); i < Collections.max(sample); i++) {
            if (check_3(sample, i)) {
                count_3 += 3;
            } else if (check_2(sample, i)) {
                count_2 += 2;
            } else if (check_1(sample, i)) {
                count_1++;
            }
        }
        int result = (A * count_1) + (B * count_2) + (C * count_3);
        System.out.println(result);
    }
}
