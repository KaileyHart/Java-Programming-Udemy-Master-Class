public class NumberPalindrome {

    // * NOTE: A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.

    public static void main(String[] args) {
        
        System.out.println(isPalindrome(-1221)); // should return true

        System.out.println(isPalindrome(707)); // should return true

        System.out.println(isPalindrome(11212)); // should return false because reverse is 21211 and that is not equal to 11212.

    };

    private static boolean isPalindrome(int number) {

        // * If number is negative, convert it to be positive
        number = Math.abs(number);
        int reversedNumber = 0;
        int tempNumber = number;
        
        while(tempNumber > 0) {

            reversedNumber = (tempNumber % 10) + (reversedNumber * 10);

            tempNumber /= 10;

        };

        // * Return true or false based on the condition
        return number == reversedNumber;

    };

};
