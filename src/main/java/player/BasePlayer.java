package player;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class BasePlayer {
    private static final Logger logger = Logger.getLogger(BasePlayer.class.getSimpleName());
    private static List<Player> basePlayer = new ArrayList<Player>();

   public static void add(Player player){
       logger.debug("add player");
       basePlayer.add(player);
   }

   public static boolean remove(Player player){
       logger.debug("remove player");
       return basePlayer.remove(player);
   }

   public static List<Player> getBasePlayer(){
       return basePlayer;
   }
}
