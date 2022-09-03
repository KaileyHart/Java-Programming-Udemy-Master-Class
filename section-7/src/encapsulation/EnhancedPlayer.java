
public class EnhancedPlayer {

    // * Initialize variables
    public String name;
    public String weapon;
    public int health = 100;
   

    // * Constructor
    public EnhancedPlayer(String weapon, int health, String name) {

        this.name = name;
        this.weapon = weapon;

        if (health > 0 && health <= 100) {

            this.health = health;

        }

    }


    // * Getters & Setts
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
