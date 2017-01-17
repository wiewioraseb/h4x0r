import Sort.BubbleSort;

import java.util.Arrays;

public class EntryPoint {
    public static void main(String[] args) {
        System.out.println("Start");
        EntryPoint ep = new EntryPoint();

        System.out.println("Palindrome");
        String text = "ikajaki";
        boolean isPalindrome = ep.checkIfPalindromeClassic(text);
        System.out.println("String " + text + " is palindrome: " + isPalindrome);

        String text2 = "abbaakkaabba";
        boolean isPalindrome2 = ep.checkIfPalindromeClassic(text2);
        System.out.println("String " + text2 + " is palindrome: " + isPalindrome2);

//        ep.fizzBuzz();

        System.out.println("Factorial: " + ep.factorial(15));

        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayToSort = { 19, 13, 3, 20, 9, 4, 5, 1, 5, 11, 8 };
        int[] sorted = bubbleSort.start(arrayToSort);
        System.out.println("Sorted array " + Arrays.toString(sorted));
    }

    private boolean checkIfPalindromeClassic(String text) {
        boolean result = false;
        char[] chText = text.toCharArray();
        for (int i = 0; i < chText.length / 2; i++) {
            result = chText[i] == chText[chText.length-1 - i];
        }
        return result;
    }

    /*
    * Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
    * instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples
    * of both three and five print “FizzBuzz”.
    * */
    private void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            System.out.println("");
        }
    }

    private int factorial(int param) {
        return param > 1 ? param * factorial(param - 1) : param;
    }

}