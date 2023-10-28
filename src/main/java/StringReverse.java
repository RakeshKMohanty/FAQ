public class StringReverse {

    public static void main(String[] args) {
        String input = "Rakesh";
        String reversedString = stringReverse(input);
        System.out.printf("Reversed String is %s for input string %s ", reversedString, input);
    }

    private static String stringReverse(String input) {
        if (input.length() <= 1)
            return input;
        return stringReverse(input.substring(1))+input.charAt(0);

    }
}
