package com.toy.chapter09_iterator_composite.iterator.step2_iterator_separation;

import com.toy.chapter09_iterator_composite.iterator.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
}
