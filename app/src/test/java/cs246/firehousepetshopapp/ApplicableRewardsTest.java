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
        //c.points.setPoints(0);
        c.setPoints(100,true);

        Reward r = new Reward();
        r.setCost(35);

        assertTrue(c.getPoints() >= r.getCost());
    }
}
