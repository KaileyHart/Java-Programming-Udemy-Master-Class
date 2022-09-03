package composition;
public class Resolution {

    // * Initialize variables
    private int width;
    private int height;
    

    // * Constructor
    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }


    // * Setters & Getters
    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
