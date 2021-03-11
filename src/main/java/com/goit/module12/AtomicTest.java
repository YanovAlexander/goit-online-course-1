package com.goit.module12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AtomicTest {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        final Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            final String next = iterator.next();
            if (next.equals("Hello")) {
                //do something
            }
        }
    }
}
