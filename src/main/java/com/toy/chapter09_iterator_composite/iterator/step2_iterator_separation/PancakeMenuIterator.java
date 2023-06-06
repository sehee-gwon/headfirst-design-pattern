package com.toy.chapter09_iterator_composite.iterator.step2_iterator_separation;

import com.toy.chapter09_iterator_composite.MenuItem;

import java.util.List;

public class PancakeMenuIterator implements Iterator {
    List<MenuItem> items;
    int position;

    public PancakeMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.items.size()
                && this.items.get(this.position) != null;
    }

    @Override
    public MenuItem next() {
        return this.items.get(this.position++);
    }
}
