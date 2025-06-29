package com.example.handlers;

import com.example.SupportRequest;

public class TechnicalSupportHandler extends SupportRequestHandler {
    public TechnicalSupportHandler(SupportRequestHandler next) {
        super(next);
    }

    @Override
    protected String getRequestType() {
        return RequestType.TECHNICAL.name();
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("Process technical support request");
    }
}
