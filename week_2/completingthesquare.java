import java.util.Scanner;

public class completingthesquare {
    public static class Coord {
        public int x;
        public int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static void calcFinalCoord(Coord A, Coord B, Coord C) {
            int x = A.x + B.x - C.x;
            int y = A.y + B.y - C.y;
            System.out.println(x + " " + y);
        }

        public static double distance(Coord A, Coord B) {
            return Math.sqrt(Math.pow((A.x - B.x), 2) + Math.pow((A.y - B.y), 2));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Coord A = new Coord(input.nextInt(), input.nextInt());
        Coord B = new Coord(input.nextInt(), input.nextInt());
        Coord C = new Coord(input.nextInt(), input.nextInt());
        double AB = Coord.distance(A, B);
        double AC = Coord.distance(A, C);
        double BC = Coord.distance(B, C);
        double max = Math.max(Math.max(AB, AC), BC);
        if (max == AB) {
            Coord.calcFinalCoord(A, B, C);
        } else if (max == AC) {
            Coord.calcFinalCoord(A, C, B);
        } else {
            Coord.calcFinalCoord(B, C, A);
        }
        input.close();
    }
}