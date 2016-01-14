package org.example;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReferenceOverridingConsumerTest {

    private Consumer<Boolean> consumer;

    @Before
    public void setUp() throws Exception {
        consumer = new LoggingConsumerDecorator<>(new ReferenceOverridingConsumer());
    }

    @Test
    public void testShouldNotChangeValueIfPassedAsReferenceType() throws Exception {

        final Boolean value = Boolean.FALSE;

        consumer.accept(value);

        Assert.assertThat(value, is(false));
    }

    @Test
    public void testShouldNotChangeValueIfPassedAsValueType() throws Exception {

        final boolean value = false;

        consumer.accept(value);

        Assert.assertThat(value, is(false));
    }
}
