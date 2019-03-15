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
        int defaultNrOfRocksInPit = GamePropertyLoader.getDefaultRocksInPit();
        LOGGER.info("Created GameController: {} players, {} rocks in each pit", nrOfPlayers, defaultNrOfRocksInPit);

        initializeBoardRowControllers(nrOfPlayers, defaultNrOfRocksInPit);
    }

    private void initializeBoardRowControllers(int nrOfPlayers, int defaultNrOfRocksInPit) {
        IntStream.range(0, nrOfPlayers).forEach(player -> boardRowControllers.add(new BoardRowController(defaultNrOfRocksInPit)));
    }
}
