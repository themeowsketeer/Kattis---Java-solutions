import java.util.Scanner;
import java.util.*;

interface Shape {
    public boolean checkBelong(int x_test, int y_test);
}

class Rectangle implements Shape {
    private int x_botLeft;
    private int y_botLeft;
    private int x_topRight;
    private int y_topRight;

    public Rectangle(int x_1, int y_1, int x_2, int y_2) {
        this.x_botLeft = x_1;
        this.y_botLeft = y_1;
        this.x_topRight = x_2;
        this.y_topRight = y_2;
    }

    public boolean checkBelong(int x_test, int y_test) {
        if ((x_botLeft <= x_test && x_test <= x_topRight) &&
                (y_botLeft <= y_test && y_test <= y_topRight)) {
            return true;
        } else {
            return false;
        }
    }
}

class Circle implements Shape {
    private int x_centre;
    private int y_centre;
    private int radian;

    public Circle(int x_centre, int y_centre, int radian) {
        this.x_centre = x_centre;
        this.y_centre = y_centre;
        this.radian = radian;
    }

    public boolean checkBelong(int x_test, int y_test) {
        double left_equationCircle_1 = (x_test - this.x_centre) * (x_test - this.x_centre);
        double left_equationCircle_2 = (y_test - this.y_centre) * (y_test - this.y_centre);
        double right_equationCircle = radian * radian;
        if ((left_equationCircle_1 + left_equationCircle_2) <= right_equationCircle) {
            return true;
        } else {
            return false;
        }
    }
}

public class hittingtargets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int targetsNum = input.nextInt();
        List<Shape> targetsList = new ArrayList<Shape>();
        for (int i = 0; i < targetsNum; i++) {
            String targetShape = input.next();
            if (targetShape.equals("rectangle")) {
                int x_botLeft = input.nextInt();
                int y_botLeft = input.nextInt();
                int x_topRight = input.nextInt();
                int y_topRigt = input.nextInt();
                targetsList.add(new Rectangle(x_botLeft, y_botLeft, x_topRight, y_topRigt));
            } else if (targetShape.equals("circle")) {
                int x_centre = input.nextInt();
                int y_centre = input.nextInt();
                int radian = input.nextInt();
                targetsList.add(new Circle(x_centre, y_centre, radian));
            }
        }
        int hitsNum = input.nextInt();
        for (int i = 0; i < hitsNum; i++) {
            int x_test = input.nextInt();
            int y_test = input.nextInt();
            int targetHit = 0;
            for (int j = 0; j < targetsList.size(); j++) {
                if (targetsList.get(j).checkBelong(x_test, y_test)) {
                    targetHit++;
                }
            }
            System.out.println(targetHit);
        }
        input.close();
    }
}