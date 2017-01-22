import Sort.BubbleSort;
import Sort.InsertionSort;

import java.util.Arrays;
import java.util.List;

public class EntryPoint {
    public static void main(String[] args) {
        System.out.println("Start");
        EntryPoint ep = new EntryPoint();

        System.out.println("Palindrome");
        String text = "bkajaki";
        boolean isPalindrome = ep.checkIfPalindromeClassic(text);
        System.out.println("String " + text + " is palindrome: " + isPalindrome);

        String text2 = "abbaakkaabba";
        boolean isPalindrome2 = ep.checkIfPalindromeClassic(text2);
        System.out.println("String " + text2 + " is palindrome: " + isPalindrome2);

//        ep.fizzBuzz();

        System.out.println("Factorial: " + ep.factorial(15));

        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayToSort = { 33, 19, 13, 3, 20, 9, 4, 5, 1, 5, 11, 8, 1, 11, 14, 15, 1 };
//        int[] sortedBubble = bubbleSort.start(arrayToSort);

        InsertionSort insertionSort = new InsertionSort();
        int[] sortedInsertion = insertionSort.start(arrayToSort);
    }

    private boolean checkIfPalindromeClassic(String text) {
        boolean result = true;
        char[] chText = text.toCharArray();
        for (int i = 0; i < chText.length / 2; i++) {
            if (chText[i] != chText[chText.length-1 - i]){
                result = false;
                break;
            }
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

    private int sumOfOddNumbers() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
        int result = 0;

/*
        // Old fashioned way
        for(int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) result += i;
        }
*/

        result = Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .sum();

        return result;
    }

}