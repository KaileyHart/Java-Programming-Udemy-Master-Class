public class Car1 {

    // * Initialize "Car" variables
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // * Setter
    public void setModel(String model) {

        // * Make all model names lowercase
        String validModel = model.toLowerCase();

        // * If the model is not "valid", print "Unknown"
        if (validModel.equals("carrera")) {

            this.model = model;

        } else {

            this.model = "Unknown";

        };

    };

    // * Getter
    public String getModel() {

        return this.model;

    };
        
};
