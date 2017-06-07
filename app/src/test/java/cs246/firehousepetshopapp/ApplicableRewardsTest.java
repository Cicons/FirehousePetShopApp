package cs246.firehousepetshopapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by cutlerhollist on 6/7/17.
 */

public class ApplicableRewardsTest {
    @Test
    public void addition_isCorrect() throws Exception {
        Customer c = new Customer();
        c.setPoints(0);
        c.addPoints(100);

        Reward r = new Reward();
        r.setPoints(35);

        assertTrue(c.getPoints() >= r.getPoints());
    }
}
