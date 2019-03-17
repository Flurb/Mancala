/*
 * © 2019 Flurb
 */
package nl.flurb.views;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.awt.event.ActionListener;

public class SmallPitView extends JButton implements PitView {
    private static final Logger LOGGER = LoggerFactory.getLogger(SmallPitView.class);

    public SmallPitView(ActionListener commandListener) {
        addActionListener(commandListener);
    }

    public SmallPitView(String name, ActionListener commandListener) {
        SwingUtilities.invokeLater(() -> setName(name));
        addActionListener(commandListener);
    }

    @Override
    public void updateState(String state) {
        LOGGER.debug("updateState: {}", state);
        SwingUtilities.invokeLater(() -> setText(state));
    }
}
