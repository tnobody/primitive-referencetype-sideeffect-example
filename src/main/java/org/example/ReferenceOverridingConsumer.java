package org.example;

/**
 * @author Thomas Eizinger, Senacor Technologies AG.
 */
public class ReferenceOverridingConsumer implements Consumer<Boolean> {

    public void accept(Boolean value) {
        value = true;
    }
}
