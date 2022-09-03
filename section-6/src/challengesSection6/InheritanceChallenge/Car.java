

public class Car extends Vehicle {

    // * Initialize Variables
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;


    // * Constructor
    public Car( String name, String size, int wheels, int doors, int gears, boolean isManual) {

        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;

    }


    // * Instance Methods

    // * Change the gears of the car
    public void changeGears(int currentGear) {

        this.currentGear = currentGear;
        System.out.println("Car.changeCurrentGears(): Changed to: " + this.currentGear + " gear.");

    }

    // * Changes the velocity in which the car is moving
    public void changeVelocity(int speed, int direction) {

        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity changed to: " + speed + " direction " + direction + ".");

    }

}
