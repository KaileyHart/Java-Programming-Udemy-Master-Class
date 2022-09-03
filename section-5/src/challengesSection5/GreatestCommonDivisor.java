public class GreatestCommonDivisor {

    public static void main(String[] args) {
        
        System.out.println(getGreatestCommonDivisor(25, 15)); // should return 5 since both can be divided by 5 without a remainder

        System.out.println(getGreatestCommonDivisor(12, 30)); // should return 6 since both can be divided by 6 without a remainder
        
        System.out.println(getGreatestCommonDivisor(9, 18)); // should return -1 since the first parameter is < 10
        
        System.out.println(getGreatestCommonDivisor(81, 153)); // should return 9 since both can be divided by 9 without a remainder


    };

    private static int getGreatestCommonDivisor(int first, int second) {

        // * If params are valid
        if ((first > 10) && second > 10) {

            // * While they two params do not equal eachother, subtract 
            while(first != second) {

                if (first > second) {

                    first = first - second;

                } else {

                    second = second - first;

                };

            };
            
            return second;

        };
        
        return -1;

    };

};