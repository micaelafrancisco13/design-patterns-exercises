package com.example;

import com.example.handlers.RequestType;
import com.example.handlers.SupportRequestHandler;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SupportRequest {
    private final RequestType type;
    private final String description;
    private final SupportRequestHandler handler;

    public void process() {
        handler.handle(this);
    }
}
