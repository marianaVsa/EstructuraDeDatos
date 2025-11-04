public class PalindromeChecker {

    public static boolean isPalindrome(String text) {
        String cleaned = "";
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (Character.isLetterOrDigit(c)) {
                cleaned += c;
            }
        }

        MyStack<Character> stack = new MyStack<>(cleaned.length());

        for (int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }

        for (int i = 0; i < cleaned.length(); i++) {
            char fromStack = stack.pop();
            if (cleaned.charAt(i) != fromStack) {
                return false;
            }
        }

        return true;
    }
}
