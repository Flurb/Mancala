/*
 * © 2019 Flurb
 */
package nl.flurb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Getting the game properties.
 */
public class GamePropertyLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger(GamePropertyLoader.class);

    private static final Properties GAME_PROPERTIES;

    static {
        GAME_PROPERTIES = new Properties();
        InputStream propertiesStream = GamePropertyLoader.class.getResourceAsStream("/game.properties");
        try {
            GAME_PROPERTIES.load(propertiesStream);
        } catch (IOException e) {
            // TODO: Should be fancier.
            LOGGER.error("staticInitializer: Unable to load game properties");
        }
    }

    public static int getNumberOfPlayers() {
        String nrOfPlayers = GAME_PROPERTIES.getProperty("nrOfPlayers");
        return Integer.valueOf(nrOfPlayers);
    }

    public static int getDefaultNumberOfRocksInPit() {
        String defaultRocksInPit = GAME_PROPERTIES.getProperty("defaultNrOfRocksInPit");
        return Integer.valueOf(defaultRocksInPit);
    }

    public static int getDefaultNumberOfPits() {
        String defaultNrOfPits = GAME_PROPERTIES.getProperty("defaultNrOfPits");
        return Integer.valueOf(defaultNrOfPits);
    }

}
