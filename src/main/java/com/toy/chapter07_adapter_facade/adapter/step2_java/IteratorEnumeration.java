package com.toy.chapter07_adapter_facade.adapter.step2_java;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration<E> implements Enumeration<E> {
    Iterator<E> iterator;

    public IteratorEnumeration(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    @Override
    public E nextElement() {
        return this.iterator.next();
    }
}
