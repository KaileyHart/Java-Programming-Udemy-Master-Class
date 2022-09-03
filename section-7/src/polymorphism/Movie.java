
public class Movie {

    // * Initialize variable
    private String name;


    // * Constructor
    public Movie(String name) {

        this.name = name;

    }


    // * Methods
    public String plot() {

        return "No plot here.";

    }


    // * Getters & Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }    
    
}


class Jaws extends Movie {

    public Jaws() {

        super("Jaws");

    }

    public String plot() {

        return "Sharks eat lots of people.";

    }
    
}

 
class IndependenceDay extends Movie {

    public IndependenceDay() {

        super("Independence Day");

    }

    public String plot() {

        return "Aliens attempt to take over the planet.";

    }
    
}


class MazeRunner extends Movie {

    public MazeRunner() {

        super("Maze Runner");

    }

    public String plot() {

        return "Kids try and escape a maze.";

    }
    
}


class StarWars extends Movie {

    public StarWars() {

        super("Star Wars");

    }

    public String plot() {

        return "Imperial Forces try to take over the universe.";

    }
    
}


class Forgetable extends Movie {

    public Forgetable() {

        super("Forgetable");

    }
    
}
