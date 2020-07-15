package request;

import org.apache.log4j.Logger;
import player.Player;

public class RequestJoin {
	private static final Logger logger = Logger.getLogger(RequestJoin.class.getSimpleName());

	private static int number = 0;
	private Player player;
	
	public RequestJoin(Player player) {
		logger.debug("start constructor RequestJoin");
		this.player = player;
		number++;
	}

	public Player getPlayer(){
		return player;
	}

	public int getNumber() {
		return number;
	}

	public static RequestJoin createRequestJoin(Player pl){
		logger.info("start method createRequestJoin");
		if(pl == null){
			return null;
		}
		return new RequestJoin(pl);
	}

	@Override
	public String toString() {
		return "RequestJoin{" +
				"player=" + player +
				'}';
	}
}
