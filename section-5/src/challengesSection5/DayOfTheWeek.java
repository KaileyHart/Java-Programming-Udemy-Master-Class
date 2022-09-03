public class DayOfTheWeek {

    public static void main(String[] args) {
        
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);

        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(-01);
        printDayOfTheWeek(29);

    };

    
    public static void printDayOfTheWeek(int day) {

        switch(day) {

            case 0:
                System.out.println("Sunday " + day);
                break;
            case 1:
                System.out.println("Monday " + day);
                break;  
            case 2:
                System.out.println("Tuesday " + day);
                break;
            case 3:
                System.out.println("Wednesday " + day);
                break;
            case 4:
                System.out.println("Thursday " + day);
                break;
            case 5:
                System.out.println("Friday " + day);
                break;
            case 6:
                System.out.println("Saturday " + day);
                break;
            default:
                System.out.println("Invalid day! " + day);
                break;

        };

    };
    
};
