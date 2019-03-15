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

public class PitRowModel {
    private static final Logger LOGGER = LoggerFactory.getLogger(PitRowModel.class);

    private final List<AbstractPitModel> pitRow;

    PitRowModel(int numberOfSmallPits) {
        pitRow = new LinkedList<>();
        createPitRow(numberOfSmallPits);
    }

    private void createPitRow(int numberOfSmallPits) {
        LOGGER.trace("createPitRow: creating {} small pits", numberOfSmallPits);
        IntStream.range(0, numberOfSmallPits).forEach(identifier -> pitRow.add(new SmallPitModel(identifier)));

        int mancalaIndex = numberOfSmallPits + 1;
        pitRow.add(new BigPitModel(mancalaIndex));
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("pitRow", pitRow)
                .toString();
    }
}
