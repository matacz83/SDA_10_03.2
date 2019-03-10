public class PasswordBreaker {

    private final static String SECRET = "cbac";

    private final static char[] DICTIONARY = new char[]{'a', 'b', 'c'};
    private static boolean found = false;

    private static boolean checkPassword(String input) {
        System.out.println(input);
        return input.equals(SECRET);
    }

    private static void bruteForce(String input, final int n) {

        if (checkPassword(input)) {
            found = true;
            System.out.println(input + " <- To jest szukane hasło!");
        } else {
            if (n != 0) {
                for (char character : DICTIONARY) {
                    if (!found) {
                        String newInput = input + character;
                        bruteForce(newInput, n - 1);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        bruteForce("", 4);
    }
}

