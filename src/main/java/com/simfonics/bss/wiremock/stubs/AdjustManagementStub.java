package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class AdjustManagementStub implements IWireMockStubs{
    @Stub
    public void getAdjustmentsBySubscription(WireMockServer server) {
        server.stubFor(get(urlMatching("/adjust/getAdjustmentsBySubscription.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("AdjustManagement/getAdjustmentsBySubscription.json")));
    }
}
