/*
 * © 2019 Flurb
 */
package nl.flurb;

import nl.flurb.controllers.GameController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mancala {
    private static final Logger LOGGER = LoggerFactory.getLogger(Mancala.class);

    public static void main(String[] args) {
        LOGGER.info("Starting Mancala game.");
        new GameController();
    }
}