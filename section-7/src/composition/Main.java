package composition;
public class Main {

    public static void main(String[] args) {


        // * Composition example: 

        Dimensions dimensions = new Dimensions(20, 20, 5);
        
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        // * Putting all of the classes together.
        Computer theComputer = new Computer(theCase, theMonitor, theMotherboard);

        theComputer.powerUp();

    }
    
}
