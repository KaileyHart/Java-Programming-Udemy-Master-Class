public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit (41, 22, 71)); // should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit (23, 32, 42)); // should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit (9, 99, 999)); // should return false since 9 is not within the range of 10-1000

        
    };

    private static boolean hasSameLastDigit(int x, int y, int z) {

        // * If the numbers are in range
        if (isValid(x) && isValid(y) && isValid(z)) {

            // * Get the last digits
            x %= 10;
            y %= 10;
            z %=10;

            return (( x== y) || (x == z) || (y == z));

        };

        return false;

    };


    private static boolean isValid(int x) {

        return (x >= 10 && x <= 1000);

    };
    
};
