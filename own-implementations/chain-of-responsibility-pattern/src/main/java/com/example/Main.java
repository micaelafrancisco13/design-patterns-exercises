package com.example;

import com.example.handlers.BillingSupportHandler;
import com.example.handlers.GeneralInquiryHandler;
import com.example.handlers.RequestType;
import com.example.handlers.TechnicalSupportHandler;

public class Main {
    public static void main(String[] args) {
        var generalInquiryHandler = new GeneralInquiryHandler(null);
        var billingSupportHandler = new BillingSupportHandler(generalInquiryHandler);
        var technicalSupportHandler = new TechnicalSupportHandler(billingSupportHandler);

        var request = new SupportRequest(
                RequestType.GENERAL,
                "Technical description",
                technicalSupportHandler);
        request.process();
    }
}
