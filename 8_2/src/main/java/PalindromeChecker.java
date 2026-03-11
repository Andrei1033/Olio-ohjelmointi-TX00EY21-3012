public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        // remove spaces and punctuation, convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // reverse string
        String reversed = new StringBuilder(cleaned).reverse().toString();
        // compare
        return cleaned.equals(reversed);
    }
}
