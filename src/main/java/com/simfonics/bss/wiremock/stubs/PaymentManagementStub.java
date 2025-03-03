package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class PaymentManagementStub implements IWireMockStubs{
    @Stub
    public void getPaymentsByCustomerId(WireMockServer server) {
        server.stubFor(get(urlMatching("/payment/getPaymentsByCustomerId.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("PaymentManagement/getPaymentsByCustomerId.json")));
    }

    @Stub
    public void getPaymentProperties(WireMockServer server) {
        server.stubFor(get(urlMatching("/payment/getPaymentProperties.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("PaymentManagement/getPaymentProperties.json")));
    }

    @Stub
    public void getPaymentByOrderId(WireMockServer server) {
        server.stubFor(get(urlMatching("/payment/getPaymentByOrderId.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("PaymentManagement/getPaymentByOrderId.json")));
    }
}
