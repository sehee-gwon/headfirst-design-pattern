package com.toy.chapter07_adapter_facade.adapter.step2_iterator;

import java.util.List;

public class EnumerationTestDrive {
    public static void main(String[] args) {
        List<Character> alphabets = List.of('A', 'B', 'C');
        IteratorEnumeration<Character> iteratorEnumeration = new IteratorEnumeration<>(alphabets.iterator());

        while (iteratorEnumeration.hasMoreElements()) {
            System.out.println("alphabet: " + iteratorEnumeration.nextElement());
        }
    }
}
