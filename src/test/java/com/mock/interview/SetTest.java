package com.mock.interview;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1. List of elements (Add - DONE, Delete, Read - DONE, Update)
 * 2. Contains Unique elements - DONE
 * 3. Size - DONE
 * 4. Elements can be of a type and type can be String, Integer, Double, Character, Object etc.
 */

public class SetTest {

    // is Set contains any element?
    // - is Set empty?
    @Test
    public void isSetEmpty() {
        // given aka pre-routine aka pre-condition
        Set subject;

        // when aka routine aka action/event
        subject = new Set();

        // then aka post-routine aka post-condition
        assertTrue(subject.isEmpty());
    }

    // - is Set not empty?
    @Test
    public void isSetNotEmpty() {
        // given aka pre-routine aka pre-condition
        Set subject;

        // when aka routine aka action/event
        subject = new Set();
        subject.add(1);

        // then aka post-routine aka post-condition
        assertFalse(subject.isEmpty());
    }

    // - is Set having any element?
    @Test
    public void checkSize() {
        // given aka pre-routine aka pre-condition
        Set subject;

        // when aka routine aka action/event
        subject = new Set();

        // then aka post-routine aka post-condition
        assertEquals(0, subject.size());

        // when aka routine aka action/event
        subject.add(23);

        // then aka post-routine aka post-condition
        assertEquals(1, subject.size());

        // when aka routine aka action/event
        subject.add(5685);

        // then aka post-routine aka post-condition
        assertEquals(2, subject.size());
    }

    // check if added element exist or not
    // x = {23, 54, 90}
    // - is exist = true or false
    @Test
    public void isElementExist() {
        // given aka pre-routine aka pre-condition
        Set subject;

        // when aka routine aka action/event
        subject = new Set();

        // then aka post-routine aka post-condition
        assertFalse(subject.isExist(100));

        // when aka routine aka action/event
        subject.add(23);

        // then aka post-routine aka post-condition
        assertTrue(subject.isExist(23));

        // when aka routine aka action/event
        subject.add(54);

        // then aka post-routine aka post-condition
        assertTrue(subject.isExist(23));
        assertTrue(subject.isExist(54));
        assertFalse(subject.isExist(100));
    }

    // - show existing element
    // x = {23, 54, 90}
    @Test
    public void showExistingElement() {
        // given aka pre-routine aka pre-condition
        Set subject;

        // when aka routine aka action/event
        subject = new Set();

        // index = [0,1,2,3,4]
        // value = [0,0,0,0,0]
        // then aka post-routine aka post-condition
        assertEquals(-1, subject.elementAt(0));

        // when aka routine aka action/event
        subject.add(23);

        // index = [0, 1,2,3,4]
        // value = [23,0,0,0,0]
        // then aka post-routine aka post-condition
        assertEquals(23, subject.elementAt(0));


        // when aka routine aka action/event
        subject.add(54);

        // index = [0, 1, 2,3,4]
        // value = [23,54,0,0,0]
        // then aka post-routine aka post-condition
        assertEquals(23, subject.elementAt(0));
        assertEquals(54, subject.elementAt(1));
    }

    // - mathematical set always contains unique element
    // x = {30, 20, 40}
    // Duplicate element  = size will not change
    // Unique element  = size will change
    @Test
    public void addOnlyUniqueElement() {
        // given aka pre-routine aka pre-condition
        Set subject;

        // when aka routine aka action/event
        subject = new Set();
        subject.add(30);
        subject.add(20);
        subject.add(40);

        // then aka post-routine aka post-condition
        assertEquals(3, subject.size());

        // when aka routine aka action/event
        subject.add(30);

        // then aka post-routine aka post-condition
        assertEquals(3, subject.size());

        // when aka routine aka action/event
        subject.add(50);

        // then aka post-routine aka post-condition
        assertEquals(4, subject.size());
    }
}
