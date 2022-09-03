
public class Player {

    // * Initialize variables
    public String name;
    public String weapon;
    public int health;
   

    public void loseHealth(int damage) {

        this.health = this.health - damage;

        if(this.health <=0) {

            System.out.println(name + " has been knocked out!");
            // * Reduce number of lives for player;

        }

    }

    public int healthRemaining() {

        return this.health;

    }
    
}
