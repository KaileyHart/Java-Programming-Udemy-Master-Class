
public class Lamp {

    // * Initialize variables
    private int lightBulbs;
    private boolean isOn;
    private boolean isPluggedIn;
    private String color;


    // * Constructor
    public Lamp(int lightBulbs, boolean isOn, boolean isPluggedIn, String color) {
        this.lightBulbs = lightBulbs;
        this.isOn = isOn;
        this.isPluggedIn = isPluggedIn;
        this.color = color;
    }


    // * Methods
    public void turnOn() {

        System.out.println("Lamp -> Turning on");
        this.isOn = true;

    }


    // * Getters & setters
    public int getLightBulbs() {
        return this.lightBulbs;
    }

    public void setLightBulbs(int lightBulbs) {
        this.lightBulbs = lightBulbs;
    }

    public boolean isIsOn() {
        return this.isOn;
    }

    public boolean getIsOn() {
        return this.isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isIsPluggedIn() {
        return this.isPluggedIn;
    }

    public boolean getIsPluggedIn() {
        return this.isPluggedIn;
    }

    public void setIsPluggedIn(boolean isPluggedIn) {
        this.isPluggedIn = isPluggedIn;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
