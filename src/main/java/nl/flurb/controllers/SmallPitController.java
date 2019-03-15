/*
 * © 2019 Flurb
 */
package nl.flurb.controllers;

import nl.flurb.models.SmallPitModel;
import nl.flurb.views.SmallPitView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A single controller for a small pit.
 */
public class SmallPitController implements PitController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SmallPitController.class);

    private final SmallPitModel model;
    private final SmallPitView view;

    SmallPitController(int identifier) {
        model = new SmallPitModel(identifier);
        view = new SmallPitView(listener -> LOGGER.info("Trying to get rocks from pit {}", model.getIdentifier()));
    }
}
