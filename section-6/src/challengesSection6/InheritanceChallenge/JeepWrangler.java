

public class JeepWrangler extends Car {

    // * Initialize Variables
    private int roadServiceMonths;
    private boolean hasMods;
    private int numberOfDucks;

    // * Constructor
    public JeepWrangler(int roadServiceMonths, boolean hasMods, int numberOfDucks) {

        super("Jeep Wrangler", "Large", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
        this.hasMods = hasMods;
        this.numberOfDucks = numberOfDucks;

    }


    // * Instance Methods

    // * Change gears based on the speed of the Jeep
    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0) {

            stop();

        } else if (newVelocity > 0 && newVelocity <= 20) {

            changeGears(2);

        } else if (newVelocity > 20 && newVelocity < -40) {

            changeGears(4);

        } else if (newVelocity > 40 && newVelocity < -60) {

            changeGears(6);

        }

        if (newVelocity > 0) {

            changeVelocity(newVelocity, getCurrentDirection());

        }

    }

}
