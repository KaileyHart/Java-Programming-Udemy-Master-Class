import java.util.Scanner;

public class MinMaxInput {

    public static void main(String[] args) {

        // * Get user input
        Scanner scanner = new Scanner(System.in);

        // * Initialize variables
        int minNumber = 0;
        int maxNumber = 0;

        // * Create a flag to get first user input
        boolean firstNumber = true;

        // * Endless while loop
        while(true) {

            // * Prompt user
            System.out.println("Enter a number:");

            boolean isInt = scanner.hasNextInt();

            if (isInt == true) {

                int userNumber = scanner.nextInt();

                // * Ensures that minNumber and maxNumber get set on first input
                if(firstNumber == true) {

                    firstNumber = false;
                    minNumber = userNumber;
                    maxNumber = userNumber;

                };

                // * Ensures maxNumber always has the largest number that the user has entered
                if(userNumber > maxNumber) {

                    maxNumber = userNumber;

                };

                // * Ensures minNumber always has the smallest number that the user has entered
                if(userNumber < minNumber) {

                    minNumber = userNumber;

                };

            } else {

                System.out.println("You entered an invalid number!");
                break;

            };

            // * Continue with loop
            scanner.nextLine();

        };

        System.out.println("Min = " + minNumber );
        System.out.println("Max = " + maxNumber );

        // * Close scanner when done with it.
        scanner.close();
        
    };
    
};
