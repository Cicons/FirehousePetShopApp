package cs246.firehousepetshopapp;

import org.junit.Test;

import static java.sql.Types.NULL;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by cutlerhollist on 6/7/17.
 */

public class CheckForLoginTest {
    @Test
    public void userName_isOnFile() throws Exception {
        Customer c = new Custormer();
        c.setUserName("Bob");

        assertEquals(c.getUserName(), "Bob");
        assertTrue(c.getUserName() != NULL);
    }
}
