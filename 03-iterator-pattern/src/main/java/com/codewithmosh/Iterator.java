package com.codewithmosh;

public interface Iterator<T> {
    public boolean hasNext();

    public void next();

    T current();
}
