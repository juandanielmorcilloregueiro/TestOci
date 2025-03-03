package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class SubscriptionStub implements IWireMockStubs{
    @Stub
    public void getSubscriptions(WireMockServer server) {
        server.stubFor(get(urlMatching("/subscription-management/subscriptions"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("SubscriptionManagement/getSubscriptions.json")));
    }

    @Stub
    public void getSubscriptionsByMsisdn(WireMockServer server) {
        server.stubFor(get(urlMatching("/subscription-management/subscriptions.*msisdn=.*"))
                .willReturn(aResponse()
                        .withTransformers("getSubscription")));
    }

    @Stub
    public void getSubscriptionsByIcc(WireMockServer server) {
        server.stubFor(get(urlMatching("/subscription-management/subscriptions.*icc=.*"))
                .willReturn(aResponse()
                        .withTransformers("getSubscription")));
    }

    @Stub
    public void getSubscriptionsByImsi(WireMockServer server) {
        server.stubFor(get(urlMatching("/subscription-management/subscriptions.*imsi=.*"))
                .willReturn(aResponse()
                        .withTransformers("getSubscription")));
    }

    @Stub
    public void getSubscriptionsByCustomerId(WireMockServer server) {
        server.stubFor(get(urlMatching("/subscription-management/subscriptions.*customerId=.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("SubscriptionManagement/getSubscriptions.json")));
    }

    @Stub
    public void validateIcc(WireMockServer server) {
        server.stubFor(get(urlMatching("/subscription/validateIcc.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("SubscriptionManagement/validateIcc.json")));
    }

    @Stub
    public void getBrandIdByMsisdn(WireMockServer server) {
        server.stubFor(get(urlMatching("/subscription/getBrandIdByMsisdn.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("SubscriptionManagement/getBrandIdByMsisdn.json")));
    }

    @Stub
    public void getTypeNames(WireMockServer server) {
        server.stubFor(get(urlMatching("/subscription/getTypeNames.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("SubscriptionManagement/getTypeNames.json")));
    }
}
