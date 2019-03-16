/*
 * © 2019 Flurb
 */
package nl.flurb.models;

import nl.flurb.datatypes.PitType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract representation of a pit.
 * This can either be a small pit or a BigPitModel.
 */
public abstract class AbstractPitModel {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractPitModel.class);

    private final int identifier;
    private final PitType pitType;

    /**
     * Current number of rocks inside the pit.
     */
    private int rocks;

    /**
     * Constructor
     *
     * @param identifier The identifier of the pit. Used for getting opposite pit's stones.
     * @param pitType The type of pit, either big or small.
     * @param defaultNumberOfRocks the default number of rocks in this pit.
     */
    AbstractPitModel(int identifier, PitType pitType, int defaultNumberOfRocks) {
        this.identifier = identifier;
        this.pitType = pitType;
        rocks = defaultNumberOfRocks;
    }

    public PitType getPitType() {
        return pitType;
    }

    public int getIdentifier() {
        return identifier;
    }

    /**
     * Add rocks to the pit.
     *
     * @param rocks Number of rocks to add.
     */
    public void addRocks(int rocks) {
        LOGGER.trace("addRocks: adding {} rocks", rocks);
        this.rocks += rocks;
    }

    void clearRocks() {
        rocks = 0;
    }

    public int getNumberOfRocks() {
        return rocks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("identifier", identifier)
                .append("pitType", pitType)
                .append("rocks", rocks)
                .toString();
    }

}
