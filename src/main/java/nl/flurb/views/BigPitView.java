/*
 * © 2019 Flurb
 */
package nl.flurb.views;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class BigPitView extends JLabel implements PitView {
    private static final Logger LOGGER = LoggerFactory.getLogger(BigPitView.class);

    @Override
    public void updateState(String state) {
        LOGGER.debug("updateState: {}", state);
        SwingUtilities.invokeLater(() -> setText(state));
    }
}
