import java.util.Scanner;
import java.util.*;

public class bela {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cardsperDeck = input.nextInt();
        String suit = input.next();
        List<Character> cardType = Arrays.asList(new Character[] { 'A', 'K', 'Q', 'J', 'T', '9', '8', '7' });
        List<Integer> dominantList = Arrays.asList(new Integer[] { 11, 4, 3, 20, 10, 14, 0, 0 });
        List<Integer> nondominantList = Arrays.asList(new Integer[] { 11, 4, 3, 2, 10, 0, 0, 0 });
        int totalPoint = 0;
        for (int i = 0; i < 4 * cardsperDeck; i++) {
            String cardTest = input.next();
            if (cardTest.charAt(1) == suit.charAt(0)) {
                int index = cardType.indexOf(cardTest.charAt(0));
                totalPoint += dominantList.get(index);
            } else {
                int index = cardType.indexOf(cardTest.charAt(0));
                totalPoint += nondominantList.get(index);
            }
        }
        System.out.println(totalPoint);
        input.close();
    }
}
