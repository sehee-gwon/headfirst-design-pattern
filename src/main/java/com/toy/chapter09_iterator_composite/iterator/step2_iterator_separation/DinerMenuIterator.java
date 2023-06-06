package com.toy.chapter09_iterator_composite.iterator.step2_iterator_separation;

import com.toy.chapter09_iterator_composite.MenuItem;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.items.length
                && this.items[this.position] != null;
    }

    @Override
    public MenuItem next() {
        return this.items[this.position++];
    }
}
