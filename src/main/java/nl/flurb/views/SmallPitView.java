/*
 * © 2019 Flurb
 */
package nl.flurb.views;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class SmallPitView extends JButton implements PitView {

    public SmallPitView(ActionListener commandListener) {
        addActionListener(commandListener);
    }

    @Override
    public void updateState(int state) {
        String buttonText = Integer.toString(state);
        setText(buttonText);
    }
}
