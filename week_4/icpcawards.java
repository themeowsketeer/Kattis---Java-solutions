import java.util.Scanner;
import java.util.*;

public class icpcawards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String teamsCount = input.nextLine();
        List<String> listCampus = new ArrayList<String>();
        List<String> listTeam = new ArrayList<String>();
        for (int i = 0; i < Integer.parseInt(teamsCount); i++) {
            String[] participant = input.nextLine().split(" ");
            if (!listCampus.contains(participant[0])) {
                listCampus.add(participant[0]);
                listTeam.add(participant[1]);
            } else {
                continue;
            }
        }
        input.close();
        for (int i = 0; i < 12; i++) {
            System.out.println(listCampus.get(i) + " " + listTeam.get(i));
        }
    }
}
