
public class Bed {

    // * Initialize variables
    private int pillows;
    private int blankets;
    private String size;


    // * Constructor
    public Bed(int pillows, int blankets, String size) {

        this.pillows = pillows;
        this.blankets = blankets;
        this.size = size;

    }

    // * Methods
    public void make() {

        System.out.println("Bed -> Making");

    }


    // * Getters & setters
    public int getPillows() {
        return this.pillows;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public int getBlankets() {
        return this.blankets;
    }

    public void setBlankets(int blankets) {
        this.blankets = blankets;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}
