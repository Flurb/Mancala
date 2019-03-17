/*
 * © 2019 Flurb
 */
package nl.flurb.models;

import nl.flurb.GamePropertyLoader;
import nl.flurb.datatypes.PitType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class SmallPitModelTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(SmallPitModelTest.class);

    private static final int MODEL_IDENTIFIER = 1;

    private SmallPitModel model;

    @Before
    public void doBefore() {
        model = new SmallPitModel(MODEL_IDENTIFIER);

        LOGGER.debug("doBefore: assert default number of rocks in pit");
        assertEquals(GamePropertyLoader.getDefaultNumberOfRocksInPit(), model.getNumberOfRocks());
        assertEquals(MODEL_IDENTIFIER, model.getIdentifier());
        assertEquals(PitType.SMALL, model.getPitType());

        LOGGER.debug("doBefore: done");
    }

    @After
    public void doAfter() {
        LOGGER.debug("doAfter: done");
    }

    @Test
    public void testRemoveRocks() {
        LOGGER.debug("testRemoveRocks: removing rocks from pit, expecting 0 rocks in pit");
        model.removeRocksFromPit();
        assertEquals(0, model.getNumberOfRocks());
    }

    @Test
    public void testAddRocks() {
        LOGGER.debug("testAddRocks: adding 1 rock to the default number of rocks");
        model.addRocks(1);

        LOGGER.debug("testAddRocks: expecting one more than the default");
        int expectedNumberOfRocks = GamePropertyLoader.getDefaultNumberOfRocksInPit() + 1;
        assertEquals(expectedNumberOfRocks, model.getNumberOfRocks());
    }
}
