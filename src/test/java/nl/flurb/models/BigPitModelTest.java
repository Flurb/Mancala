/*
 * © 2019 Flurb
 */
package nl.flurb.models;

import nl.flurb.datatypes.PitType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class BigPitModelTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BigPitModelTest.class);

    private static final int MODEL_IDENTIFIER = 1;

    private BigPitModel model;

    @Before
    public void doBefore() {
        model = new BigPitModel(MODEL_IDENTIFIER);

        LOGGER.debug("doBefore: assert default number of rocks in pit");
        assertEquals(0, model.getNumberOfRocks());
        assertEquals(MODEL_IDENTIFIER, model.getIdentifier());
        assertEquals(PitType.BIG, model.getPitType());

        LOGGER.debug("doBefore: done");
    }

    @After
    public void doAfter() {
        LOGGER.debug("doAfter: done");
    }

    @Test
    public void testAddRocks() {
        LOGGER.debug("testAddRocks: adding 1 rock to the default number of rocks");
        model.addRocks(1);

        LOGGER.debug("testAddRocks: expecting one more than the default");
        assertEquals(1, model.getNumberOfRocks());
    }
}
