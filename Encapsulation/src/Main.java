public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//        int demage = 10;
//        player.loseHealth(demage);
//        System.out.println("Reamining health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Reamining health = " + player.healthRemaining());
        EnhancedPlayer tim = new EnhancedPlayer("Tim",200,
                "Sword");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
