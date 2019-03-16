/*
 * © 2019 Flurb
 */
package nl.flurb.controllers;

import nl.flurb.GamePropertyLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Controller for the full pit row of 1 player.
 */
public class BoardRowController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BoardRowController.class);

    private final List<PitController> pitRow;

    BoardRowController() {
        pitRow = new LinkedList<>();

        int defaultNrOfPits = GamePropertyLoader.getDefaultNumberOfPits();
        initializePitRow(defaultNrOfPits);
    }

    private void initializePitRow(int nrOfPits) {
        IntStream.range(0, nrOfPits).forEach(identifier -> pitRow.add(new SmallPitController(identifier)));
        pitRow.add(new BigPitController(nrOfPits));
    }
}
