package com.example.handlers;

import com.example.SupportRequest;

public class GeneralInquiryHandler extends SupportRequestHandler {
    public GeneralInquiryHandler(SupportRequestHandler next) {
        super(next);
    }

    @Override
    protected String getRequestType() {
        return RequestType.GENERAL.name();
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("Process general inquiry request");
    }
}
