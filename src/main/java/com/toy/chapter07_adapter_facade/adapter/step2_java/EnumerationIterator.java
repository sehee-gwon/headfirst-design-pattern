package com.toy.chapter07_adapter_facade.adapter.step2_java;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return this.enumeration.nextElement();
    }

    @Override
    public void remove() {
        // Iterator 인터페이스에 이미 default 로 구현되어 있음
        throw new UnsupportedOperationException("remove enumeration");
    }
}
