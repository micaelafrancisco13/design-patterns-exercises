package com.example.handlers;

import com.example.SupportRequest;

public class BillingSupportHandler extends SupportRequestHandler {
    public BillingSupportHandler(SupportRequestHandler next) {
        super(next);
    }

    @Override
    protected String getRequestType() {
        return RequestType.BILLING.name();
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("Process billing support request");
    }
}
