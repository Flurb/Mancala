/*
 * © 2019 Flurb
 */
package nl.flurb;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MancalaTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MancalaTest.class);

    private Mancala game;

    @Before
    public void doBefore() {
        LOGGER.debug("doBefore: creating Mancala game");
        game = new Mancala();
    }

    @After
    public void doAfter() {
        LOGGER.debug("doAfter: done");
    }

    @Test
    public void someTest() {
        LOGGER.debug("someTest: true == true?");
        Assert.assertTrue(true);
    }
}
