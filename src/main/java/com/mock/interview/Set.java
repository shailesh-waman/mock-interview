package com.mock.interview;

public class Set {
    private int size = 0;
    private int elements[] = new int[5];

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int element) {
        if(!isExist(element)){
            elements[size++] = element;
        }
    }

    public int size() {
        return size;
    }

    public boolean isExist(int searchElement) {
        for (int element : elements) {
            if (element == searchElement) {
                return true;
            }
        }
        return false;
    }

    public int elementAt(int atIndex) {
        if(isEmpty()) {
            return -1;
        }

        return elements[atIndex];
    }
}
