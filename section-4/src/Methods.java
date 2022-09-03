public class Methods {

    public static void main(String[] args) {

        // * From CodeBlocksAndControlStatements.java
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        // * Challenge Code
        String playerNameOne = "Kailey";
        int playerScoreOne = 1500;
        int highScorePosition = calculateHighScorePosition(playerScoreOne);
        displayHighScorePosition(playerNameOne, highScorePosition);

        String playerNameTwo = "Darrell";
        int playerScoreTwo = 900;
        highScorePosition = calculateHighScorePosition(playerScoreTwo);
        displayHighScorePosition(playerNameTwo, highScorePosition);

        String playerNameThree = "Hannah";
        int playerScoreThree = 400;
        highScorePosition = calculateHighScorePosition(playerScoreThree);
        displayHighScorePosition(playerNameThree, highScorePosition);

        String playerNameFour = "Nick";
        int playerScoreFour = 50;
        highScorePosition = calculateHighScorePosition(playerScoreFour);
        displayHighScorePosition(playerNameFour, highScorePosition);

    };


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;

        };

        return -1;

    };


    // * Challenge Code
    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            position = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            position = 3;
        };

        return position;

    };


    // * Challenge Code
    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");

    };

};
