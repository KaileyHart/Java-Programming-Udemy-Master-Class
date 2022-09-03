
public class Main {

    public static void main(String[] args) {

        // * Initialize classes
        Bed bed = new Bed(4, 2, "King");
        Dresser dresser = new Dresser(6, "Gray", true);
        Lamp lamp = new Lamp(1, false, true, "Green");

        Bedroom bedroom = new Bedroom(4, 1, 1, "Kailey", bed, dresser, lamp);

        bedroom.makeBed();
        lamp.turnOn();

    }
    
}
