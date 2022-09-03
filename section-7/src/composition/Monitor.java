package composition;
public class Monitor {

    // * Initialize variables
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;


    // * Constructor
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {

        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;

    }

    // * Methods
    public void drawPixelArt(int x, int y, String color) {

        System.out.println("Drawing pixel at " + x + ", " + y + " with color " + color +".");

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

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Resolution getNativeResolution() {
        return this.nativeResolution;
    }

    public void setNativeResolution(Resolution nativeResolution) {
        this.nativeResolution = nativeResolution;
    }
    


}
