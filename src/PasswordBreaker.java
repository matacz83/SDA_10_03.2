public class PasswordBreaker {

    private final static String SECRET = "cbac";

    private final static char[] DICTIONARY = new char[]{'a', 'b', 'c'};

    private static boolean checkPassword(String input) {
        return input.equals(SECRET);
    }

    private static void bruteForce(String input, int n) {
        if (n == 0) {
            if (checkPassword(input)) {
                System.out.println("Znalazlem hasło: " + input);
            }
        } else {
            for (char character : DICTIONARY) {
                String newInput = input + character;
                bruteForce(newInput, n-1);
            }
        }
    }
    public static void main(String[] args) {
        bruteForce("", 4);
    }
}

