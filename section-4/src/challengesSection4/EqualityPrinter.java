public class EqualityPrinter {

    public static void main(String[] args) {

        printEqual(1, 1, 1); // should print text All numbers are equal

        printEqual(1, 1, 2); // should print text Neither all are equal or different
        
        printEqual(-1, -1, -1); // should print text Invalid Value
        
        printEqual(1, 2, 3); // should print text All numbers are different

    };


    public static void printEqual(int numberOne, int numberTwo, int numberThree) {

        if (numberOne < 0 || numberTwo < 0 || numberThree < 0) {

            System.out.println("Invalid Value");

        } else if (numberOne == numberTwo && numberTwo == numberThree) {

            System.out.println("All numbers are equal");

        } else if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree) {

            System.out.println("All numbers are different");

        } else {

            System.out.println("Neither all are eqal or different");

        };

    };
    
};
