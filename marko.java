import java.util.Scanner;
import java.util.*;
import java.util.HashMap;

public class marko {
    public static void main(String[] args) {
        HashMap<Character, Character> keyboard = new HashMap<>();
        keyboard.put('a', '2');
        keyboard.put('b', '2');
        keyboard.put('c', '2');
        keyboard.put('d', '3');
        keyboard.put('e', '3');
        keyboard.put('f', '3');
        keyboard.put('g', '4');
        keyboard.put('h', '4');
        keyboard.put('i', '4');
        keyboard.put('j', '5');
        keyboard.put('k', '5');
        keyboard.put('l', '5');
        keyboard.put('m', '6');
        keyboard.put('n', '6');
        keyboard.put('o', '6');
        keyboard.put('p', '7');
        keyboard.put('q', '7');
        keyboard.put('r', '7');
        keyboard.put('s', '7');
        keyboard.put('t', '8');
        keyboard.put('u', '8');
        keyboard.put('v', '8');
        keyboard.put('w', '9');
        keyboard.put('x', '9');
        keyboard.put('y', '9');
        keyboard.put('z', '9');
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int count = 0;
        List<String> list_testcase = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            list_testcase.add(input.next());
        }
        String S = input.next();
        input.close();
        for (int i = 0; i < N; i++) {
            boolean check_equal = true;
            if (list_testcase.get(i).length() != S.length()) {
                continue;
            }
            for (int j = 0; j < list_testcase.get(i).length(); j++) {
                if (keyboard.get(list_testcase.get(i).charAt(j)) != S.charAt(j)) {
                    check_equal = false;
                    break;
                }
            }
            if (check_equal) {
                count++;
            }
        }
        System.out.println(count);
    }
}
