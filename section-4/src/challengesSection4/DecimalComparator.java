public class DecimalComparator {

    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756, -3.175); // should return true

        areEqualByThreeDecimalPlaces(3.175, 3.176); // should return false

        areEqualByThreeDecimalPlaces(3.0, 3.0); // should return true

        areEqualByThreeDecimalPlaces(-3.123, 3.123); // should return false 

    };

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        boolean isEqualByThreeDecimalPlaces = false;

        if (((int) (firstNumber * 1000)) - ((int) (secondNumber * 1000)) == 0) {

            isEqualByThreeDecimalPlaces = true;

        };
        
        System.out.println(isEqualByThreeDecimalPlaces);
        return isEqualByThreeDecimalPlaces;

    };

};
