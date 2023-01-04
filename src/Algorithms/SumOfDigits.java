/*
Digital root is the recursive sum of all the digits in a number.
    Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until
a single-digit number is produced. The input will be a non-negative integer.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */
package Algorithms;

public class SumOfDigits {
    public static int sumOfDigits;
    public static int digitalRoot(int userDigit) {
        sumOfDigits = 0;
        for (int i = 0; i < digit2Array(userDigit).length; i++) {
            sumOfDigits += digit2Array(userDigit)[i];
        }
        if (sumOfDigits > 9) {
            digitalRoot(sumOfDigits);
        }
        return sumOfDigits;
    }

    private static int[] digit2Array(int userDigit) {
        String[] intermediateArray = String.valueOf(userDigit).split("");
        int[] outputArray = new int[intermediateArray.length];

        for (int i = 0; i < intermediateArray.length; i++) {
            outputArray[i] = Integer.parseInt(intermediateArray[i]);
        }
        return outputArray;
    }

}
