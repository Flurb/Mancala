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

    private static Properties gameProperties;

    static {
        gameProperties = new Properties();
        InputStream propertiesStream = ClassLoader.class.getResourceAsStream("resources/game.properties");
        try {
            gameProperties.load(propertiesStream);
        } catch (IOException e) {
            // TODO: Should be fancier.
            LOGGER.error("staticInitializer: Unable to load game properties");
        }
    }

    public static int getNumberOfPlayers() {
        String nrOfPlayers = gameProperties.getProperty("nrOfPlayers");
        return Integer.valueOf(nrOfPlayers);
    }

    public static int getDefaultRocksInPit() {
        String defaultRocksInPit = gameProperties.getProperty("defaultRocksInPit");
        return Integer.valueOf(defaultRocksInPit);
    }

}
