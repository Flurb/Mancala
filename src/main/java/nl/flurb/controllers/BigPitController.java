/*
 * © 2019 Flurb
 */
package nl.flurb.controllers;

import nl.flurb.models.BigPitModel;
import nl.flurb.views.BigPitView;

/**
 * A single controller for a big pit.
 */
public class BigPitController implements PitController {

    private final BigPitModel model;
    private final BigPitView view;

    BigPitController(int identifier) {
        model = new BigPitModel(identifier);
        view = new BigPitView();
    }

    public void addRocks(int rocks) {
        model.addRocks(rocks);

        int totalNumberOfRocks = model.getNumberOfRocks();
        view.updateState(totalNumberOfRocks);
    }
}
