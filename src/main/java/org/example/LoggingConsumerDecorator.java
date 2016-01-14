package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingConsumerDecorator<T> implements Consumer<T> {

    private static final Logger LOGGER = LogManager.getLogger();

    private final Consumer<T> delegate;

    public LoggingConsumerDecorator(Consumer<T> delegate) {
        this.delegate = delegate;
    }

    public void accept(T value) {

        LOGGER.info("Value before calling delegate: {}", value);

        delegate.accept(value);

        LOGGER.info("Value after calling delegate: {}", value);
    }
}
