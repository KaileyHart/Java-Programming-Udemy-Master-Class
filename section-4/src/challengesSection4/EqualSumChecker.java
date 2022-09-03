public class EqualSumChecker {

    public static void main(String[] args) {

        hasEqualSum(1, 1, 1); // should return false since 1 + 1 is not equal to 1

        hasEqualSum(1, 1, 2); // should return true since 1 + 1 is equal to 2

        hasEqualSum(1, -1, 0); // should return true since 1 + (-1) is 1 - 1 and is equal to 0

    };

    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree) {

        boolean isEqualSum = false;

        if (numberOne + numberTwo == numberThree) {

            isEqualSum = true;

        };

        // System.out.println(isEqualSum);
        return isEqualSum;

    };

};
