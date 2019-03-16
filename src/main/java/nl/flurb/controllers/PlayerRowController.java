/*
 * © 2019 Flurb
 */
package nl.flurb.controllers;

import nl.flurb.GamePropertyLoader;
import nl.flurb.views.GameFrame;
import nl.flurb.views.PlayerRowView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Controller for the full pit row of 1 player.
 * This is always a couple of small pits, and 1 big pit.
 */
public class PlayerRowController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerRowController.class);

    private final PlayerRowView playerRowView;
    private final List<PitController> pitRow;

    PlayerRowController(GameFrame gameFrame, int playerIdentifier) {
        playerRowView = new PlayerRowView(playerIdentifier);
        gameFrame.addPlayerRow(playerRowView);

        pitRow = new LinkedList<>();

        int defaultNrOfPits = GamePropertyLoader.getDefaultNumberOfPits();
        initializePitRow(defaultNrOfPits);
    }

    private void initializePitRow(int nrOfPits) {
        IntStream.range(0, nrOfPits).forEach(identifier -> {
            SmallPitController controller = new SmallPitController(identifier);
            pitRow.add(controller);
            playerRowView.addSmallPit(controller.getView());
        });

        BigPitController bigPitController = new BigPitController(nrOfPits);
        pitRow.add(bigPitController);
        playerRowView.addBigPit(bigPitController.getView());
    }
}
