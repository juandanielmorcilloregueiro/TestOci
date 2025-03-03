package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class SessionStub implements IWireMockStubs{

    @Stub
    public void login(WireMockServer server) {
        server.stubFor(post(urlMatching("/user-management/login.*"))
                .willReturn(aResponse()
                        .withTransformers("login")));
    }

    @Stub
    public void loginOptions(WireMockServer server) {
        server.stubFor(options(urlMatching("/user-management/login.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void validateSession(WireMockServer server) {
        server.stubFor(get(urlMatching("/user/checkSession.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("SessionManagement/validateSession.json")));
    }
}
