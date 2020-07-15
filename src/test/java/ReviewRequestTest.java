import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import player.Player;
import request.RequestJoin;
import request.ReviewRequest;

public class ReviewRequestTest {
	private Player pl;
	private RequestJoin rj;

	@Before
	public void setUp(){

	}

	@Test
	public void check_fisrtName_on_empty() {
		pl = new Player("", "Morgan", 18, 3);
		rj = new RequestJoin(pl);
		
		assertEquals(ReviewRequest.review(rj), false);
	}

	@Test
	public void check_secondName_on_empty() {
		pl = new Player("Jack", "", 18, 3);
		rj = new RequestJoin(pl);

		assertEquals(ReviewRequest.review(rj), false);
	}

	@Test
	public void check_ageDownBorder_on_empty() {
		pl = new Player("Jack", "Kongo", 17, 3);
		rj = new RequestJoin(pl);

		assertEquals(ReviewRequest.review(rj), false);
	}

	@Test
	public void check_ageHighBorder_on_empty() {
		pl = new Player("Jack", "Kongo", 28, 3);
		rj = new RequestJoin(pl);

		assertEquals(ReviewRequest.review(rj), false);
	}

	@Test
	public void check_experienceYear_on_empty() {
		pl = new Player("Jack", "Kongo", 18, 2);
		rj = new RequestJoin(pl);

		assertEquals(ReviewRequest.review(rj), false);
	}

}
