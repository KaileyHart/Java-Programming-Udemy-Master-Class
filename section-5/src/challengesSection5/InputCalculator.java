import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        // * Get user input
        Scanner scanner = new Scanner(System.in);

          // * Initialize variables
          int sumOfInputs = 0;
          int averageOfInputs = 0;
          int inputCount = 1;


          // * Endless while loop
        while(true) {

            // * Prompt user
            System.out.println("___________________________");
            System.out.println("To end input, type 'break'.");
            System.out.println("Enter a number:");

            boolean isInt = scanner.hasNextInt();

             // * Error handling to ensure the user entered a number
            if (isInt == true) {

                int userNumber = scanner.nextInt();

                // * Get the sum of all numbers
                sumOfInputs = sumOfInputs + userNumber;

                // * Get the average of all numbers
                averageOfInputs = sumOfInputs / inputCount;

                inputCount++;

            } else {

                System.out.println("You entered an invalid number!");
                break;

            };

            // * Continue with loop
            scanner.nextLine();

        };

        System.out.println("The sum is: " + sumOfInputs );
        System.out.println("The average is: " + averageOfInputs);
        
        // * Close scanner when done with it.
        scanner.close();

    };
    
};
