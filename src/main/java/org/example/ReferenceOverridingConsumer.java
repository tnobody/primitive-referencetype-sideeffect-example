package org.example;

public class ReferenceOverridingConsumer implements Consumer<Boolean> {

    public void accept(Boolean value) {
        value = true;
    }
}
