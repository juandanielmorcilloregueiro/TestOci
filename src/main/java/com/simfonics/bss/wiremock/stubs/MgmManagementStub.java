package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class MgmManagementStub implements IWireMockStubs{

    @Stub
    public void getTotalRewards(WireMockServer server) {
        server.stubFor(get(urlMatching("/mgm/getTotalRewards.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("MgmManagement/getTotalRewards.json")));
    }

    @Stub
    public void getRecruiter(WireMockServer server) {
        server.stubFor(get(urlMatching("/mgm/getRecruiter.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("MgmManagement/getRecruiter.json")));
    }

    @Stub
    public void getRecruit(WireMockServer server) {
        server.stubFor(get(urlMatching("/mgm/getRecruit.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("MgmManagement/getRecruit.json")));
    }
}
