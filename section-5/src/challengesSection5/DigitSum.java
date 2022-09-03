public class DigitSum {

    public static void main(String[] args) {
        
        System.out.println("The sum of digits of 125 is " + sumDigits(125));
        System.out.println("The sum of digits of -125 is " + sumDigits(-125));
        System.out.println("The sum of digits of 4 is " + sumDigits(4));
        System.out.println("The sum of digits of 32123 is " + sumDigits(32123));

    };

    
    private static int sumDigits(int number) {

        int sum = 0;

        if (number < 10) {

            return -1; 

        };

        while(number > 0) {

            // * Get the least-significant digit
            int newNumber = number % 10;

            sum += newNumber;

            // * Drop the the least-significant digit (the remainder)
            number /= 10;

        };

        return sum;

    };
    
};
