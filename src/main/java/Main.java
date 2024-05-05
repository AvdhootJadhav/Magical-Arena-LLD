import services.Arena;
import models.Player;

public class Main {

    public static void main(String[] args) {
        try {
            Player firstPlayer = new Player(100, 10, 5);
            Player secondPlayer = new Player(50, 5, 10);

            Arena arena = new Arena();
            String results = arena.startMatch(firstPlayer, secondPlayer);
            System.out.println("Match Winner : "+results);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
