package composition;
public class Motherboard {

    // * Initialize variables
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;


    // * Constructor
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }


    // * Methods
    public void loadProgram(String programName) {

        System.out.println("Program " + programName + " is now loading...");

    }


    // * Getters & Setters
    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSlots() {
        return this.ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardSlots() {
        return this.cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public String getBios() {
        return this.bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

}
