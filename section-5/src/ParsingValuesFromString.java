public class ParsingValuesFromString {

    public static void main(String[] args) {

        String numberAsString = "2018";
        String doubleAsString = "2018.234";

        System.out.println("numberAsString = " + numberAsString);
        
        // * Integer is a "wrapper" class
        int number = Integer.parseInt(numberAsString);

        // * Double is a "wrapper" class
        double doubleNumber = Double.parseDouble(doubleAsString);

        System.out.println("number = " + number);

        // * When the variable is a string, the value will get concatenated versus when it is a number, the value gets added. 
        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("doubleAsString = " + doubleNumber);
        System.out.println("number = " + number);

    };
    
};
