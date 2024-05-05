import services.Arena;
import models.Player;

public class Main {

    public static void main(String[] args) {
        try {
            Player firstPlayer = new Player(10, 4, 1);
            Player secondPlayer = new Player(15, 3, 2);
            Arena arena = new Arena();
            String winner = arena.startMatch(firstPlayer, secondPlayer);
            System.out.println("Match Winner : "+winner);
        } catch (Exception e) {
            System.out.println("Match Interrupted due to following exception : "+e.getLocalizedMessage());
        }
    }
}
