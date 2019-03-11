/*
 * © 2019 Flurb
 */
package nl.flurb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mancala {
    private static final Logger logger = LoggerFactory.getLogger(Mancala.class);

    public static void main(String[] args) {
        logger.info("Starting Mancala game.");
        new Mancala();
    }
}