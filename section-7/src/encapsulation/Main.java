
public class Main {
    
    public static void main(String[] args) {
        
        Player player = new Player();

        player.name = "Kailey";
        player.health = 100;
        player.weapon = "Sword";

        player.loseHealth(25);

        System.out.println(player.name + "'s remaining health is " + player.healthRemaining());


        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Enhanced Sword", 50, "Enhanced Kailey");
        System.out.println(enhancedPlayer.getName() + "'s initial health is " + enhancedPlayer.getHealth());
        
    }

}
