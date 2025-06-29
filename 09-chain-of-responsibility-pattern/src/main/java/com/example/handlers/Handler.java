package com.example.handlers;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Handler {
    protected final DataReaderHandler next;
}
