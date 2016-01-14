package org.example;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by tmkein on 14.01.2016.
 */
public class SimpleReferecneChangeTest {

    @Test
    public void referenceChangeTest() {
        Integer i = new Integer(5);
        assertEquals(5, (int) i);
        changeValue(i);
        assertEquals(5, (int) i);
    }

    private void changeValue(Integer i) {
        i = new Integer(7);
    }

    private void changeObjectValue(ObjectWithValue o) {
        o.setValue(7);
    }

    private void createNewReference(ObjectWithValue o) {
        o = new ObjectWithValue(7);
    }

    @Test
    public void objectValueChangeTest() {
        ObjectWithValue o = new ObjectWithValue(5);
        assertEquals(5, o.getValue());
        changeObjectValue(o);
        assertEquals(7, o.getValue());
    }

    @Test
    public void objectReferenceChangeTest() {
        ObjectWithValue o = new ObjectWithValue(5);
        assertEquals(5, o.getValue());
        createNewReference(o);
        assertEquals(5, o.getValue());
    }

    class ObjectWithValue {
        private int value;

        public ObjectWithValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
