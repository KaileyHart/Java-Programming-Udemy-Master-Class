package composition;
public class Computer {

    // * COMPOSITION: A computer HAS-A Case, HAS-A Monitor, and HAS-A Motherboard.

    // * Initialize variables
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;


    // * Constructor
    public Computer(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    // * Methods
    private void drawLogo() {

        theMonitor.drawPixelArt(5020, 2343, "yellow");

    }

    public void powerUp() {

        theCase.pressPowerButton();
        drawLogo();
    }


    // * Getters & Setters
    public Case getTheCase() {
        return this.theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public Monitor getTheMonitor() {
        return this.theMonitor;
    }

    public void setTheMonitor(Monitor theMonitor) {
        this.theMonitor = theMonitor;
    }

    public Motherboard getTheMotherboard() {
        return this.theMotherboard;
    }

    public void setTheMotherboard(Motherboard theMotherboard) {
        this.theMotherboard = theMotherboard;
    }



    
}
