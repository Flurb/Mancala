/*
 * © 2019 Flurb
 */
package nl.flurb.views;

import javax.swing.*;

public class PlayerView extends JLabel {

    private final String PLAYER_PREFIX = "Player: ";

    public PlayerView(String identifier) {
        SwingUtilities.invokeLater(() -> setText(PLAYER_PREFIX.concat(identifier)));
    }
}
