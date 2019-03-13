/*
 * © 2019 Flurb
 */
package nl.flurb.models;

import nl.flurb.datatypes.PitType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BigPit extends Pit {
    private static final Logger LOGGER = LoggerFactory.getLogger(BigPit.class);

    /**
     * Constructor
     *
     * @param identifier The identifier of the pit. Used for getting opposite pit's stones.
     */
    BigPit(int identifier) {
        super(identifier, PitType.BIG);
    }
}
