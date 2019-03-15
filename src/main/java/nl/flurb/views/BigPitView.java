/*
 * © 2019 Flurb
 */
package nl.flurb.views;

import javax.swing.JLabel;

public class BigPitView extends JLabel implements PitView {

    public BigPitView() {
    }

    @Override
    public void updateState(int state) {
        String buttonText = Integer.toString(state);
        setText(buttonText);
    }
}
