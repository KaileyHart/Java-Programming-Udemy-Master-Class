public class Switch {

    public static void main(String[] args) {

        int switchValue = 10;

        switch(switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Value was a 3, 4, or 5");
                break;
            default:
                System.out.println("The value was a " + switchValue);
                break;
        };

        // ! Challenge

        char charValue = 'K';

        switch(charValue) {

            case 'A':case 'B': case 'C':case 'D':case 'E':
                System.out.println("An " + charValue + " was found.");
                break;
         
            default:
                System.out.println("An A, B, C, D, or E were not found.");
                break;

        };

        // String switch pays attention to capitalizations.
        // To avoid this, use toLowerCase() or toUpperCase()

        String month = "AUGUST";

        switch(month.toLowerCase()) {

            case "august":
                System.out.println("It is my birthday month! " + month);
                break;

            case "june":
                System.out.println("It's " + month);
                break;

            default:
                System.out.println("I'm not sure what month it is.");
                break;

        };
        
    };
    
};
