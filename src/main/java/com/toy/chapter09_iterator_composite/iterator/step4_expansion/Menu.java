package com.toy.chapter09_iterator_composite.iterator.step4_expansion;

import com.toy.chapter09_iterator_composite.MenuItem;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
