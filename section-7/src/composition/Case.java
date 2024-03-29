package composition;
public class Case {

    // * Initialize variables
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;


    // * Constructor
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {

        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;

    }


    // * Methods
    public void pressPowerButton() {

        System.out.println("Power button pressed.");

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

    public String getPowerSupply() {
        return this.powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimensions() {
        return this.dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    
}
