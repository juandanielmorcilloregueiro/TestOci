package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class UsageStub implements IWireMockStubs{
    @Stub
    public void callUsage(WireMockServer server) {
        server.stubFor(get(urlMatching("/usage-management/call-usages.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("UsageManagement/callUsage.json")));
    }

    @Stub
    public void smsUsage(WireMockServer server) {
        server.stubFor(get(urlMatching("/usage-management/sms-usages.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("UsageManagement/smsUsage.json")));
    }

    @Stub
    public void padUsage(WireMockServer server) {
        server.stubFor(get(urlMatching("/usage-management/pad-usages.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("UsageManagement/padUsage.json")));
    }

    @Stub
    public void sendUsageByMailOptions(WireMockServer server) {
        server.stubFor(options(urlMatching("/usage/sendUsageByMail.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void sendUsageByMail(WireMockServer server) {
        server.stubFor(post(urlMatching("/usage/sendUsageByMail.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }
}
