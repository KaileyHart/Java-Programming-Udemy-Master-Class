package composition;
public class Dimensions {

    // * Initialize variables
    private int width;
    private int height;
    private int depth;


     // * Constructor
    public Dimensions(int width, int height, int depth) {

        this.width = width;
        this.height = height;
        this.depth = depth;

    }


    // * Getters & Setters
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

    public int getDepth() {
        return this.depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    
}
