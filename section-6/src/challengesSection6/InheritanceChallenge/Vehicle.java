

public class Vehicle {

    // * Initialize Variables
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;


    // * Constructor
    public Vehicle(String name, String size) {

        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;

    }

    // * Instance Methods

    // * Get the current direction
    public void steer(int direction) {

        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");

    }

    // * Get how fast the vehicle is moving
    public void move(int velocity, int direction) {

        this.currentVelocity = direction;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection + ".");

    }

    // * Stops the vehicle
    public void stop() {
        
        this.currentVelocity = 0;
    
    }


    // * Getters
    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public int getCurrentVelocity() {
        return this.currentVelocity;
    }

    public int getCurrentDirection() {
        return this.currentDirection;
    }

}


