package cs246.firehousepetshopapp;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by cutlerhollist on 6/7/17.
 */

/**
 * Local unit test to check if the user's points are greater than zero, which will execute on the
 * development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class PointsGreaterThanZeroTest {
    @Test
    public void getValue_isCorrect() throws Exception {
        Points p = new Points(5);

        assertEquals(p.getValue(), 5);
    }

    public void _isCorrect() throws Exception {
        Points p = new Points(3);

        assertTrue(p.getValue() >= 0);
    }
}
