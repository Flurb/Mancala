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
    private static final Logger logger = LoggerFactory.getLogger(MancalaTest.class);

    private Mancala game;

    @Before
    public void doBefore() {
        logger.debug("doBefore: creating Mancala game");
        game = new Mancala();
    }

    @After
    public void doAfter() {
        logger.debug("doAfter: done");
    }

    @Test
    public void someTest() {
        logger.debug("someTest: true == true?");
        Assert.assertTrue(true);
    }
}