public class draft {
    public static Integer integerConvert(String input, int x, int y) {
        char[] input_char = new char[10];
        input.getChars(x, y, input_char, 0);
        String input_string = String.valueOf(input_char);
        int output = Integer.parseInt(input_string);
        return output;
    }

    public static void main(String[] args) {
        String sample = "12:34";
        System.out.println(Integer.parseInt(sample, 0, 2, 10));
    }
}
