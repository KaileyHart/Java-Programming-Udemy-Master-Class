public class StatementsWhiteSpaceAndIndenting {

    public static void main(String[] args) {
        
        // * Example of a Java statements: 
        int myVar = 50;

        myVar++;
        myVar--;
        System.out.println("This is a test.");

        // * Statements can be on multiple lines
        System.out.println("This is" +
                    " anothers test.");

        // * Statements can be on one line
        int myVar2 = 50;  myVar2--; myVar2++;


        // * Whitespace example:
        // * When compiled, Java deletes whitespaces. 
        
        int myVar3 = 50;
        // * When compiled:
        // int myVar3=50;


        // * Indentations
        // * don't matter within a code block, but without the brackets it's a problem
        if (myVar == 50) {
    System.out.println("Here");
        };

    };
    
};
