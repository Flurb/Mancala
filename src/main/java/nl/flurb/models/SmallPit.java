/*
 * © 2019 Flurb
 */
package nl.flurb.models;

import nl.flurb.datatypes.PitType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmallPit extends Pit {
    private static final Logger LOGGER = LoggerFactory.getLogger(SmallPit.class);

    /**
     * Constructor
     *
     * @param identifier The identifier of the pit. Used for getting opposite pit's stones.
     */
    SmallPit(int identifier) {
        super(identifier, PitType.SMALL);
    }

    /**
     * Get the rocks and clear the pit.
     *
     * @return the rocks you just got.
     */
    public int removeRocksFromPit() {
        int oldNumberOfRocks = getNumberOfRocks();
        LOGGER.trace("removeRocks: got {} rocks before removing", oldNumberOfRocks);

        clearRocks();
        return oldNumberOfRocks;
    }
}
