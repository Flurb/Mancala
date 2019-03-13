/*
 * © 2019 Flurb
 */
package nl.flurb.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class PitRow {
    private static final Logger LOGGER = LoggerFactory.getLogger(PitRow.class);

    private final List<Pit> pitRow;

    PitRow(int numberOfSmallPits) {
        pitRow = new LinkedList<>();
        createPitRow(numberOfSmallPits);
    }

    private void createPitRow(int numberOfSmallPits) {
        LOGGER.trace("createPitRow: creating {} small pits", numberOfSmallPits);
        IntStream.range(0, numberOfSmallPits).forEach(identifier -> pitRow.add(new SmallPit(identifier)));

        int mancalaIndex = numberOfSmallPits + 1;
        pitRow.add(new BigPit(mancalaIndex));
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("pitRow", pitRow)
                .toString();
    }
}
