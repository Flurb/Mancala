/*
 * © 2019 Flurb
 */
package nl.flurb.views;

import nl.flurb.I18nLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.GridLayout;

public class GameFrame extends JFrame {
    private static final Logger LOGGER = LoggerFactory.getLogger(GameFrame.class);

    private boolean firstPlayerAdded;

    public GameFrame() {
        super(I18nLoader.getGameTitle());
        LOGGER.trace("initialize");
        initializeFrame();
    }

    public void addPlayerRow(JPanel pitRow) {
        LOGGER.trace("addPlayerRow: add {}", pitRow);
        SwingUtilities.invokeLater(() -> {
            if (firstPlayerAdded) {
                add(pitRow, 1);
            } else {
                add(pitRow, 0);
                firstPlayerAdded = true;
            }
        });
    }

    private void initializeFrame() {
        LOGGER.trace("initializeFrame");
        setPreferredSize(new Dimension(900, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(2, 1));
        setVisible(true);
        pack();
    }
}
