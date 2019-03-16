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
 * Following the Game Score.
 */
public class GameController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GameController.class);

    private final List<BoardRowController> boardRowControllers;

    public GameController() {
        boardRowControllers = new LinkedList<>();

        int nrOfPlayers = GamePropertyLoader.getNumberOfPlayers();
        LOGGER.info("Created GameController: {} players", nrOfPlayers);

        initializeBoardRowControllers(nrOfPlayers);
    }

    private void initializeBoardRowControllers(int nrOfPlayers) {
        IntStream.range(0, nrOfPlayers).forEach(player -> boardRowControllers.add(new BoardRowController()));
    }
}
