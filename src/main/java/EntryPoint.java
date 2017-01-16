public class EntryPoint {
    public static void main(String[] args) {
        System.out.println("Start");
        EntryPoint ep = new EntryPoint();

        System.out.println("Palindrome");
        String text = "ikajaki";
        boolean isPalindrome = ep.checkIfPalindromeClassic(text);
        System.out.println("String " + text + "is palindrome: " + isPalindrome);


    }

    private boolean checkIfPalindromeClassic(String text) {
        boolean result = false;
        char[] chText = text.toCharArray();
        for (int i = 0; i < chText.length / 2; i++) {
            result = chText[i] == chText[chText.length-1 - i];
        }
        return result;
    }
}