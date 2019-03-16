/*
 * © 2019 Flurb
 */
package nl.flurb.controllers;

import nl.flurb.models.BigPitModel;
import nl.flurb.views.BigPitView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A single controller for a big pit.
 */
public class BigPitController implements PitController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BigPitController.class);

    private final BigPitModel model;
    private final BigPitView view;

    BigPitController(int identifier) {
        model = new BigPitModel(identifier);

        view = new BigPitView();
        updateView();
    }

    public void addRocks(int rocks) {
        model.addRocks(rocks);
        updateView();
    }

    public BigPitView getView() {
        return view;
    }

    private void updateView() {
        view.updateState(String.valueOf(model.getNumberOfRocks()));
    }
}
