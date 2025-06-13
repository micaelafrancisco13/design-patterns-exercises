package com.codewithmosh;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void removeById(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    public Iterator<Product> createIterator() {
        return new ListIterator(this);
    }

    private static class ListIterator implements Iterator<Product> {
        private final ProductCollection collection;
        private int index = 0;

        private ListIterator(ProductCollection products) {
            this.collection = products;
        }

        @Override
        public boolean hasNext() {
            return index < collection.products.size();
        }

        @Override
        public void next() {
            ++index;
        }

        @Override
        public Product current() {
            return collection.products.get(index);
        }
    }
}
