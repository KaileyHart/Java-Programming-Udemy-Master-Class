
public class Bedroom {

    // * Initialize variables
    private int walls;
    private int ceiling;
    private int closets;
    private String owner;
    private Bed bed;
    private Dresser dresser;
    private Lamp lamp;


    // * Constructor
    public Bedroom(int walls, int ceiling, int closets, String owner, Bed bed, Dresser dresser, Lamp lamp) {
        this.walls = walls;
        this.ceiling = ceiling;
        this.closets = closets;
        this.owner = owner;
        this.bed = bed;
        this.dresser = dresser;
        this.lamp = lamp;
    }


    // * Methods
    public void makeBed() {

        System.out.println("Bedroom -> Making Bed");
        bed.make();

    }

    // * Getters & setters
    public int getWalls() {
        return this.walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getCeiling() {
        return this.ceiling;
    }

    public void setCeiling(int ceiling) {
        this.ceiling = ceiling;
    }

    public int getClosets() {
        return this.closets;
    }

    public void setClosets(int closets) {
        this.closets = closets;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
