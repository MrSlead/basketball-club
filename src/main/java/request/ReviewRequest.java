package request;

import org.apache.log4j.Logger;
import player.BasePlayer;

public class ReviewRequest {
    private static final Logger logger = Logger.getLogger(ReviewRequest.class.getSimpleName());
	public static boolean review(RequestJoin rj) {
	    logger.info("start review method");
		if(rj != null){
			if(rj.getPlayer().getFirstName() == null || rj.getPlayer().getFirstName().trim().length() == 0){
			    logger.debug("firstName null or length = 0");
				return false;
			}
			else if(rj.getPlayer().getSecondName() == null || rj.getPlayer().getSecondName().trim().length() == 0){
                logger.debug("secondName null or length = 0");
				return false;
			}
			else if(rj.getPlayer().getAge() < 18 || rj.getPlayer().getAge() > 27){
                logger.debug("age < 18 or age > 27");
				return false;
			}
			else if(rj.getPlayer().getExperience() < 3){
                logger.debug("experience < 3");
				return false;
			}
			BasePlayer.add(rj.getPlayer());
			return true;
		}
		logger.debug("RequestJoin object = null");
		return false;
	}
}
