public class App {
    public static void main(String[] args) {
        String text1 = "Anita lava la tina";
        String text2 = "Hola";

        System.out.println("\"" + text1 + "\" -> " + PalindromeChecker.isPalindrome(text1));
        System.out.println("\"" + text2 + "\" -> " + PalindromeChecker.isPalindrome(text2));
    }
}