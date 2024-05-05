import services.Arena;
import models.Player;

public class Main {

    public static void main(String[] args) {
        try {
            Player firstPlayer = new Player(50, 5, 10);
            Player secondPlayer = new Player(100, 10, 5);
            Arena arena = new Arena();
            String winner = arena.startMatch(firstPlayer, secondPlayer);
            System.out.println("Match Winner : "+winner);
        } catch (Exception e) {
            System.out.println("Match Interrupted due to following exception : "+e.getLocalizedMessage());
        }
    }
}
