import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        // * Get user input
        Scanner scanner = new Scanner(System.in);

        // * Count the number of inputs
        int inputCount = 0;

        // * Get the sum of all 10 numbers
        int sum = 0;

        while(inputCount < 10) {

            System.out.println("Enter number #" + (inputCount + 1) + ": ");

            boolean hasNextInt = scanner.hasNextInt();

            // * Error handling to ensure the year of birth is a numbner
            if (hasNextInt == true) { 

                int number = scanner.nextInt();

                // * Get the sum of all 10 numbers
                sum = sum + number;

                inputCount++;
    
            } else {

                System.out.println("Invalid number!");

            };

        };

        System.out.println("The sum is: " + sum);

        // * Close scanner when done with it.
        scanner.close();

    };

};
