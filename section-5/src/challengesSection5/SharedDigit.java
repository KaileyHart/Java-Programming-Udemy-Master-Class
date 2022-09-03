public class SharedDigit { 
    
    public static void main(String[] args) {
        
        System.out.println(hasSharedDigit(12, 23)); // should return true since the digit 2 appears in both numbers

        System.out.println(hasSharedDigit(9, 99)); // should return false since 9 is not within the range of 10-99

        System.out.println(hasSharedDigit(15, 55)); // should return true since the digit 5 appears in both numbers

    };


    private static boolean hasSharedDigit(int numberOne, int numberTwo) {

        if (numberOne >= 10 && numberOne <= 99 && numberTwo >= 10 && numberTwo <= 99) {

            int firstDigitNumberOne = numberOne / 10;
            int lastDigitNumberOne = numberOne % 10;
            int firstDigitNumberTwo = numberTwo / 10;
            int lastDigitNumberTwo = numberTwo % 10;
   

            return ((firstDigitNumberOne == lastDigitNumberTwo) || (lastDigitNumberOne == firstDigitNumberTwo));
            
        };

        return false;

    };

};