import org.apache.log4j.Logger;
import player.BasePlayer;
import player.Player;
import request.RequestJoin;
import request.ReviewRequest;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {
        logger.info("Start main method");

        Player player = new Player("Morh", "Kovalt", 23, 3);
        RequestJoin requestPlayer = RequestJoin.createRequestJoin(player);

        System.out.println("Result request in basketball club for player: " + ReviewRequest.review(requestPlayer));


        Player player2 = new Player("Salah", "Zloy", 19, 10);
        System.out.println("Result request in basketball club for player2: " + ReviewRequest.review(RequestJoin.createRequestJoin(player2)));

        for(Player p : BasePlayer.getBasePlayer()){
            System.out.println(p);
        }
    }
}
