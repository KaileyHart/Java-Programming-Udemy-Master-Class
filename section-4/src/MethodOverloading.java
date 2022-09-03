public class MethodOverloading {

    // Method Overloading: Using the same method name, but different parameters. It imropves readability and re-usability, easier to remember, provides consistency in naming, and flexible.

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500); 
        System.out.println("New Score is: " + newScore);

        calculateScore(75);
        calculateScore();
        
    };


    public static int calculateScore(String playerName, int score) {

        System.out.println("Player" + playerName + " scored " + score);
        return score * 100;

    };


    public static int calculateScore(int score) {

        System.out.println("Unnamed player scored " + score);
        return score * 100;

    };

    // * Must change paramater number, changing the return type will not affect it. 

    // public static int calculateScore() {

    //     System.out.println("Player name and score unavailable.");
    //     return 0;

    // };

    // public static void calculateScore() {

    //     System.out.println("Player name and score unavailable.");

    // };
    
};
