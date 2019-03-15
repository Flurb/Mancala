/*
 * © 2019 Flurb
 */
package nl.flurb.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

public class PlayerModel {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerModel.class);

    /**
     * Identifier is generated now, range 1000 ... 9999.
     */
    private final int identifier;

    PlayerModel(int numberOfPits) {
        identifier = ThreadLocalRandom.current().nextInt(1000, 9999);

        LOGGER.info("PlayerModel: creating player with identifier {}", identifier);
    }

    int getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("identifier", identifier)
                .toString();
    }
}
