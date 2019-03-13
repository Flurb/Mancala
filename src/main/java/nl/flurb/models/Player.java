/*
 * © 2019 Flurb
 */
package nl.flurb.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

public class Player {
    private static final Logger LOGGER = LoggerFactory.getLogger(Player.class);

    /**
     * Identifier is generated now, range 1000 ... 9999.
     */
    private final int identifier;

    Player(int numberOfPits) {
        identifier = ThreadLocalRandom.current().nextInt(1000, 9999);

        LOGGER.info("Player: creating player with identifier {}", identifier);
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
