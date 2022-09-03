
public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(100, 0, false);

        printer.printPage(23);
        printer.printPage(5);


        Printer duplexPrinter = new Printer(75, 12, true);

        duplexPrinter.printPage(23);
        duplexPrinter.printPage(5);
        
    }
    
}
