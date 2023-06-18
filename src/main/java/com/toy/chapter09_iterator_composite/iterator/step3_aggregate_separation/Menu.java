package com.toy.chapter09_iterator_composite.iterator.step3_aggregate_separation;

import com.toy.chapter09_iterator_composite.iterator.MenuItem;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
