public class SumOdd {

    public static void main(String[] args) {
        
        sumOdd(1, 100); // should return 2500

        sumOdd(-1, 100); // should return -1
        
        sumOdd(100, 100); // should return 0
        
        sumOdd(13, 13); // should return 13 (This set contains one number, 13, and it is odd)
        
        sumOdd(100, -100); // should return -1
        
        sumOdd(100, 1000); // should return 247500

    };


    // * Check if a number is odd
    public static boolean isOdd(int number) {

        if (number >= 0) {

            if (number % 2 != 0) {

                return true;

            };

        };

        return false;

    };


    // * Get the sums of all of the odd numbers between a range of start and end
    public static int sumOdd(int start, int end) {

        int sum = 0;

        if (start <= end && start > 0 && end > 0) {

            for (int i = start; i <= end; i++) {

                if (isOdd(i)) {

                    sum += i;

                };

            };

            System.out.println(sum);
            return sum;

        };

        System.out.println(-1);
        return -1;
    };
    
};
