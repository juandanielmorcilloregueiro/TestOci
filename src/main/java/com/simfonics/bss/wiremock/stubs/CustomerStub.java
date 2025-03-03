package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class CustomerStub implements IWireMockStubs{
    @Stub
    public void getCustomer(WireMockServer server) {
        server.stubFor(get(urlMatching("/customer-management/customers.*"))
                .willReturn(aResponse()
                        .withTransformers("getCustomer")));
    }

    @Stub
    public void getCustomerOptions(WireMockServer server) {
        server.stubFor(options(urlMatching("/customer-management/customers.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token, userName, session")));
    }

    @Stub
    public void getCustomerProperties(WireMockServer server) {
        server.stubFor(get(urlMatching("/customer-management/customerProperties.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("CustomerManagement/getCustomerProperties.json")));
    }

    @Stub
    public void getCustomerPropertiesOptions(WireMockServer server) {
        server.stubFor(options(urlMatching("/customer-management/customerProperties.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token, userName, session")));
    }
}
