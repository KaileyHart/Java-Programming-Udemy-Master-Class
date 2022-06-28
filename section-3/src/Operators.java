public class Operators {

    public static void main(String[] args) {

        // * Operators: =, +, -, &, /, %

        int result = 1 + 2; // 3
        System.out.println(result);
        
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1;
        System.out.println(result);

        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 20
        System.out.println(result);
        
        result = result / 5; // 4
        System.out.println(result);

        result = result % 3; // 1
        System.out.println(result);


        // * Operator "Shortcuts": ++, --,+=, -=, *=, /= 

        result++; // 2
        System.out.println(result);

        result--; // 1
        System.out.println(result);

        result += 2; // 3
        System.out.println(result);

        result *= 10; // 30
        System.out.println(result);

        result /= 3; // 10
        System.out.println(result);

        result -= 2; // 8
        System.out.println(result);


        // * If/Then Statements

        boolean isAlien = true;

        if (isAlien == false) {
            System.out.println("Is is not an alien.");
        } else {
            System.out.println("Is is an alien!!!! :o");
        };


        // * Logical && Operator

        int topScore = 80;
        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than the second top score, but still less than 100 :(");
        };

        // * Logical || Operator
        // int topScore = 100;
        if(topScore > 90 || secondTopScore <= 90 ) {
            System.out.println("Either or both of the conditions are true ?");
        };

        // * Ternary Operators
        boolean isCar = true;

        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar? " + wasCar);


        // * Operator Challenge 
        double myVarOne = 20.00d;
        double myVarTwo = 80.00d;

        double myVarThree = (myVarOne + myVarTwo) * 100.00; 

        double myVarThreeRemainder = myVarThree % 40.00;
        
        boolean myVarFour = myVarThreeRemainder == 0 ? true : false;

        // if (myVarThreeRemainder == 0) {

        //     myVarFour = true;

        // } else {

        //     myVarFour = false;
        //     System.out.println("Got some Remainder");

        // };

        System.out.println(myVarFour);


    };
    
};
