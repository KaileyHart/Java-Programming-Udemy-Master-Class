
public class Dresser {

    // * Initialize variables
    private int drawers;
    private String color;
    private boolean hasClothes;


    // * Constructor
    public Dresser(int drawers, String color, boolean hasClothes) {

        this.drawers = drawers;
        this.color = color;
        this.hasClothes = hasClothes;

    }


    // * Getters & setters
    public int getDrawers() {
        return this.drawers;
    }

    public void setDrawers(int drawers) {
        this.drawers = drawers;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasClothes() {
        return this.hasClothes;
    }

    public boolean getHasClothes() {
        return this.hasClothes;
    }

    public void setHasClothes(boolean hasClothes) {
        this.hasClothes = hasClothes;
    }
    
}
