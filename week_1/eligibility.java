import java.util.Scanner;
import java.util.*;

public class eligibility {
    public static Integer integer_conversion(String year_input) {
        char[] year_char = new char[4];
        year_input.getChars(0, 4, year_char, 0);
        String year_string = String.valueOf(year_char);
        int year = Integer.parseInt(year_string);
        return year;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_cases = input.nextInt();
        List<String> names = new ArrayList<String>();
        List<String> dates_study = new ArrayList<String>();
        List<String> dates_born = new ArrayList<String>();
        List<Integer> courses = new ArrayList<Integer>();
        List<String> results = new ArrayList<String>();
        for (int i = 0; i < num_cases; i++) {
            names.add(input.next());
            dates_study.add(input.next());
            dates_born.add(input.next());
            courses.add(input.nextInt());
        }
        input.close();
        for (int i = 0; i < num_cases; i++) {
            String result;
            int year_study = integer_conversion(dates_study.get(i));
            int year_born = integer_conversion(dates_born.get(i));
            if (year_study >= 2010 || year_born >= 1991) {
                result = "eligible";
            } else if (courses.get(i) >= 41) {
                result = "ineligible";
            } else {
                result = "coach petitions";
            }
            results.add(result);
        }
        for (int i = 0; i < num_cases; i++) {
            System.out.println(names.get(i) + " " + results.get(i));
        }
    }
}
