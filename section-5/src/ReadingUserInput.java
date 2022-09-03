import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        // * Get user input.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        // * Error handling to ensure the year of birth is a numbner
        if (hasNextInt == true) {

            int yearOfBirth = scanner.nextInt();
            int age = 2022 - yearOfBirth;

            // * Error handling to ensure the year of birth is in a valid range
            if (age >= 0 && age <= 100) {

                System.out.println("Your name is " + name + " and you are " + age + " years old?");

            } else {

                System.out.println("Invalid year of birth!");

            };

        } else {

            System.out.println("Your year of birth needs to be a number!");

        };

        // * Close scanner when done with it.
        scanner.close();

    };
    
};


