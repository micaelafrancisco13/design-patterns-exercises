package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
        var productCollection = new ProductCollection();
        productCollection.add(new Product(1, "Apple 1"));
        productCollection.add(new Product(2, "Apple 2"));
        productCollection.add(new Product(3, "Apple 3"));

        var iterator1 = productCollection.createIterator();
        while (iterator1.hasNext()) {
            System.out.println("Current product " + iterator1.current());
            iterator1.next();
        }

        productCollection.removeById(1);
        var iterator2 = productCollection.createIterator();
        while (iterator2.hasNext()) {
            System.out.println("Current product " + iterator2.current());
            iterator2.next();
        }
    }
}