public class ClassesPartOne {

    public static void main(String[] args) {

        Car1 porche = new Car1(); 

        // * Valid Model
        // porche.setModel("Carrera");
        // System.out.println("The model is " + porche.getModel());

        // * Invalid Model
        porche.setModel("holden");
        System.out.println("The model is " + porche.getModel());
        
    };
    
};
