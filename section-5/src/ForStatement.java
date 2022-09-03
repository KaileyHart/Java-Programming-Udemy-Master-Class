public class ForStatement {

    public static void main(String[] args) {

        // System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,
        // 2.0));

        for (int i = 2; i < 9; i++) {

            System.out
                    .println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));

        };

        System.out.println("**************************");

        // ! Challenge
        for (int i = 8; i >= 2; i--) {

            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));

        };

    };

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));

    };

    // ! Challenge
    public static boolean isPrime(int number) {

        if (number == 1) {

            return false;

        };

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {

                return false;

            };

        };

        return true;

    };

};
