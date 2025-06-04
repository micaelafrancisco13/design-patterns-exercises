package com.codewithmosh;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Product {
    private final int id;
    private final String name;
}