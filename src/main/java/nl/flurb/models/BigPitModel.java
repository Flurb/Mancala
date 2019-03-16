/*
 * © 2019 Flurb
 */
package nl.flurb.models;

import nl.flurb.datatypes.PitType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BigPitModel extends AbstractPitModel {
    private static final Logger LOGGER = LoggerFactory.getLogger(BigPitModel.class);

    /**
     * Constructor
     *
     * @param identifier The identifier of the pit. Used for getting opposite pit's stones.
     */
    public BigPitModel(int identifier) {
        super(identifier, PitType.BIG, 0);

        LOGGER.trace("created with identifier {}", identifier);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
