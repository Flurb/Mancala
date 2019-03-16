/*
 * © 2019 Flurb
 */
package nl.flurb.models;

import nl.flurb.GamePropertyLoader;
import nl.flurb.datatypes.PitType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmallPitModel extends AbstractPitModel {
    private static final Logger LOGGER = LoggerFactory.getLogger(SmallPitModel.class);

    /**
     * Constructor
     *
     * @param identifier The identifier of the pit. Used for getting opposite pit's stones.
     */
    public SmallPitModel(int identifier) {
        super(identifier, PitType.SMALL, GamePropertyLoader.getDefaultNumberOfRocksInPit());

        LOGGER.trace("created with identifier {}", identifier);
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

    @Override
    public String toString() {
        return super.toString();
    }
}
