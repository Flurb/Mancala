/*
 * © 2019 Flurb
 */
package nl.flurb.views;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class SmallPitViewTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(SmallPitViewTest.class);

    private static final String SMALL_PIT_VIEW_NAME = "smallPitView";

    private SmallPitView smallPitView;

    @Before
    public void doBefore() {
        smallPitView = new SmallPitView(SMALL_PIT_VIEW_NAME,
                listener -> LOGGER.debug("got an action"));

        LOGGER.debug("doBefore: done");
    }

    @After
    public void doAfter() {
        LOGGER.debug("doAfter: done");
    }

    @Test
    public void testState() throws InterruptedException {
        LOGGER.debug("testState: updating state with \"2\", expecting \"2\" as state");
        smallPitView.updateState("2");
        // TODO: Maybe be waiting too long. Please don't use Thread.sleep
        Thread.sleep(100);
        assertEquals("2", smallPitView.getText());
    }
}
