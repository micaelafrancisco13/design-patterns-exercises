package com.example.handlers;

import com.example.SupportRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class SupportRequestHandler {
    private final SupportRequestHandler next;
//    private boolean isEscalated = false;

    public void handle(SupportRequest request) {
        if (request.getType().name().equals(getRequestType())) {
            processRequest(request);
            return;
        }

        if (next != null)
            next.handle(request);
        else
            throw new UnsupportedOperationException("Operation not supported.");
    }

    protected abstract String getRequestType();

    protected abstract void processRequest(SupportRequest request);
}
