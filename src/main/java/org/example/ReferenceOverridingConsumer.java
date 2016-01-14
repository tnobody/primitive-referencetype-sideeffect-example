package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReferenceOverridingConsumer implements Consumer<Boolean> {

    private static final Logger LOGGER = LogManager.getLogger();

    public void accept(Boolean value) {

        final boolean newValue = !value;

        LOGGER.info("Changing value to: {}", newValue);

        value = newValue;
    }
}
