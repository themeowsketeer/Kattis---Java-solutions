import java.util.Scanner;

public class unlockpattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrixPivot = new int[3][3];
        int[] pivot_1 = new int[2];
        double distance2Pivots = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                matrixPivot[row][col] = input.nextInt();
                if (matrixPivot[row][col] == 1) {
                    pivot_1[0] = row;
                    pivot_1[1] = col;
                }
            }
        }
        input.close();
        for (int digit = 1; digit < 9; digit++) {
            int[] pivot_2 = new int[2];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (matrixPivot[row][col] == digit + 1) {
                        pivot_2[0] = row;
                        pivot_2[1] = col;
                    }
                }
            }
            double x2Pivots = Math.pow((pivot_2[0] - pivot_1[0]), 2);
            double y2Pivots = Math.pow((pivot_2[1] - pivot_1[1]), 2);
            distance2Pivots += Math.sqrt(x2Pivots + y2Pivots);
            pivot_1 = pivot_2;
        }
        System.out.println(distance2Pivots);
    }
}