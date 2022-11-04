import java.util.Scanner;

public class boundingrobots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        int length = input.nextInt();
        while (width != 0 && length != 0) {
            int stepsCount = input.nextInt();
            int x_robotPos = 0;
            int x_realPos = 0;
            int y_robotPos = 0;
            int y_realPos = 0;
            for (int i = 0; i < stepsCount; i++) {
                String order = input.next();
                int stepMeter = input.nextInt();
                if (order.equals("u")) {
                    y_robotPos += stepMeter;
                    y_realPos += stepMeter;
                    if (y_realPos < 0) {
                        y_realPos = 0;
                    } else if (y_realPos >= length) {
                        y_realPos = length - 1;
                    }
                } else if (order.equals("d")) {
                    y_robotPos -= stepMeter;
                    y_realPos -= stepMeter;
                    if (y_realPos < 0) {
                        y_realPos = 0;
                    } else if (y_realPos >= length) {
                        y_realPos = length - 1;
                    }
                } else if (order.equals("l")) {
                    x_robotPos -= stepMeter;
                    x_realPos -= stepMeter;
                    if (x_realPos < 0) {
                        x_realPos = 0;
                    } else if (x_realPos >= width) {
                        x_realPos = width - 1;
                    }
                } else if (order.equals("r")) {
                    x_robotPos += stepMeter;
                    x_realPos += stepMeter;
                    if (x_realPos < 0) {
                        x_realPos = 0;
                    } else if (x_realPos >= width) {
                        x_realPos = width - 1;
                    }
                }
            }
            width = input.nextInt();
            length = input.nextInt();
            System.out.println("Robot thinks " + x_robotPos + " " + y_robotPos);
            System.out.println("Actually at " + x_realPos + " " + y_realPos);
            System.out.println();
        }
        input.close();
    }
}
