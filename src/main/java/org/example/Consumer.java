package org.example;

/**
 * @author Thomas Eizinger, Senacor Technologies AG.
 */
public interface Consumer<T> {

    void accept(T value);

}
