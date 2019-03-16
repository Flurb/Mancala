/*
 * © 2019 Flurb
 */
package nl.flurb.views;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;

public class PlayerRowView extends JPanel {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerRowView.class);

    private final JPanel smallPitPanel;
    private final JPanel bigPitPanel;

    public PlayerRowView(int playerIdentifier) {
        LOGGER.trace("initialize");
        setSize(900, 300);
        setLayout(new BorderLayout());
        setVisible(true);

        smallPitPanel = new JPanel();
        bigPitPanel = new JPanel();

        initializePlayerView(String.valueOf(playerIdentifier));
        initializeSmallPitPanel();
        initializeBigPitPanel();
    }

    public void addSmallPit(SmallPitView smallPit) {
        smallPitPanel.add(smallPit);
    }

    public void addBigPit(BigPitView bigPit) {
        bigPitPanel.add(bigPit);
    }

    private void initializePlayerView(String playerIdentifier) {
        SwingUtilities.invokeLater(() ->
                add(new PlayerView(playerIdentifier), BorderLayout.WEST));
    }

    private void initializeSmallPitPanel() {
        smallPitPanel.setLayout(new FlowLayout());
        SwingUtilities.invokeLater(() -> add(smallPitPanel, BorderLayout.CENTER));
    }

    private void initializeBigPitPanel() {
        bigPitPanel.setLayout(new FlowLayout());
        SwingUtilities.invokeLater(() -> add(bigPitPanel, BorderLayout.EAST));
    }
}
