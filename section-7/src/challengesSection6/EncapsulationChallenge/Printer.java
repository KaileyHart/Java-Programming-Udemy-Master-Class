
public class Printer {

    // * Initialize variables
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean isDuplexPrinter;


    // * Constructor
    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplexPrinter) {

        if (this.tonerLevel > 0 && this.tonerLevel <= 100) {

            this.tonerLevel = tonerLevel;

        }

        this.pagesPrinted = pagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;

    }


    // * Methods
    public void fillToner(int tonerAdded) {

        if (tonerAdded > 0 && (this.tonerLevel + tonerAdded) <= 100) {

            this.tonerLevel = this.tonerLevel + tonerAdded;
            System.out.println("The new amount of toner is " + this.tonerLevel);

        } else {

            System.out.println("The amount of toner you would like to add is invalid. You cannot add less than 0% of toner and can  only fill up the toner to 100%. Please try again.");

        }

    }


    public void printPage(int numberOfPages) {

        if (this.isDuplexPrinter == true) {

            this.pagesPrinted = this.pagesPrinted + (numberOfPages / 2);

        } else {

            this.pagesPrinted = this.pagesPrinted + numberOfPages;

        }

        this.tonerLevel = this.tonerLevel - (numberOfPages * 2);

        System.out.println(this.pagesPrinted + " pages have been printed. Your toner level is at " + tonerLevel + "%.");

    }

    // * Getters & Setters
    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isIsDuplexPrinter() {
        return this.isDuplexPrinter;
    }

    public boolean getIsDuplexPrinter() {
        return this.isDuplexPrinter;
    }

    public void setIsDuplexPrinter(boolean isDuplexPrinter) {
        this.isDuplexPrinter = isDuplexPrinter;
    }
    
}
