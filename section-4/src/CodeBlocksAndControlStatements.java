public class CodeBlocksAndControlStatements {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // * Without a code block, only 1 line is executed .
        if (score < 5000 && score > 1000) {

            System.out.println("Your score was less than 5000 but greateer than 1000");

        } else if (score < 1000) {

            System.out.println("Your score was less than 1000");

        } else {

            System.out.println("This was executed");

        };

        if (gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        };

        // * This won't work because of SCOPE
        System.out.println(finalScore);

    };

};
