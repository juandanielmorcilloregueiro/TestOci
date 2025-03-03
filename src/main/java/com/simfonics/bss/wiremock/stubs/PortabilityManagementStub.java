package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class PortabilityManagementStub implements IWireMockStubs {
    @Stub
    public void getPortabilityOrders(WireMockServer server) {
        server.stubFor(get(urlMatching("/portability/getPortabilityOrders.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("PortabilityManagement/getPortabilityOrders.json")));
    }

    @Stub
    public void getPortabilityProperties(WireMockServer server) {
        server.stubFor(get(urlMatching("/portability/getPortabilityProperties.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("PortabilityManagement/getPortabilityProperties.json")));
    }

    @Stub
    public void getPortabilityProgress(WireMockServer server) {
        server.stubFor(get(urlMatching("/portability/getPortabilityProgress.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("PortabilityManagement/getPortabilityProgress.json")));
    }

    @Stub
    public void updatePortabilityPropertiesOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/portability/updatePortabilityProperties"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void updatePortabilityProperties(WireMockServer server) {
        server.stubFor(post(urlMatching("/portability/updatePortabilityProperties.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void changePortabilityStatusOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/portability/changePortabilityStatus"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void changePortabilityStatus(WireMockServer server) {
        server.stubFor(post(urlMatching("/portability/changePortabilityStatus.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void validatePortabilityParOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/portability/validatePortabilityPar"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void validatePortabilityPar(WireMockServer server) {
        server.stubFor(post(urlMatching("/portability/validatePortabilityPar.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void getPortabilityOperatorNames(WireMockServer server) {
        server.stubFor(get(urlMatching("/portability/getPortabilityOperatorNames.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("PortabilityManagement/getPortabilityOperatorNames.json")));
    }

    @Stub
    public void getSimCardTypeNames(WireMockServer server) {
        server.stubFor(get(urlMatching("/portability/getSimCardTypeNames.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("PortabilityManagement/getSimCardTypeNames.json")));
    }

    @Stub
    public void getCancellationReason(WireMockServer server) {
        server.stubFor(get(urlMatching("/portability/getCancellationReason.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("PortabilityManagement/getCancellationReason.json")));
    }
}
