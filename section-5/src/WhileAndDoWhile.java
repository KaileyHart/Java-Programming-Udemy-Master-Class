public class WhileAndDoWhile {

    public static void main(String[] args) {

        // * While Example
        int count = 0;

        while (count != 5) {

            System.out.println("Count value is " + count);
            count++;

        };


        // * Do While Example
        //NOTE: The count value will always be executed at least once

        do {

            System.out.println("Count value was " + count);
            count++;

            if (count > 10) {
                break;
            };

        } while (count != 100);


        // * Another while example
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {

            number++;

            if (!isEvenNumber(number)) {

                continue;

            };

            System.out.println("Even number " + number);

        };

    };


    // * Challenge

    public static boolean isEvenNumber(int number) {

        if (number % 2 == 0) {

            return true;
        };

        return false;

    };
    
};
