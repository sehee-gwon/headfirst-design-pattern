package com.toy.chapter09_iterator_composite.iterator.step4_expansion;

import com.toy.chapter09_iterator_composite.MenuItem;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        this.position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.items.length
                && this.items[this.position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem item = this.items[this.position];
        this.position += 2;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove() 는 지원하지 않습니다.");
    }
}
