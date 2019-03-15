/*
 * © 2019 Flurb
 */
package nl.flurb.controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Controller for the full pit row of 1 player.
 */
public class BoardRowController {

    private final List<PitController> pitRow;

    /**
     *
     * @param nrOfPits Number of pits inclusive the big pit.
     */
    BoardRowController(int nrOfPits) {
        pitRow = new LinkedList<>();
        initializePitRow(nrOfPits);
    }

    private void initializePitRow(int nrOfPits) {
        IntStream.range(0, nrOfPits).forEach(identifier -> pitRow.add(new SmallPitController(identifier)));
        pitRow.add(new BigPitController(nrOfPits));
    }
}
