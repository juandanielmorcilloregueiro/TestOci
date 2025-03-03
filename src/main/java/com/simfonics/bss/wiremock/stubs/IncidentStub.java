package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class IncidentStub implements IWireMockStubs{
    @Stub
    public void getIncidentsByMsisdn(WireMockServer server) {
        server.stubFor(get(urlMatching("/incident-management/incidents.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("IncidentManagement/getIncidentsByMsisdn.json")));
    }

    @Stub
    public void getIncidentTypes(WireMockServer server) {
        server.stubFor(get(urlMatching("/incident-management/types.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("IncidentManagement/getIncidentTypes.json")));
    }

    @Stub
    public void getPriorities(WireMockServer server) {
        server.stubFor(get(urlMatching("/incident-management/priorities.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("IncidentManagement/getPriorities.json")));
    }

    @Stub
    public void getCategories(WireMockServer server) {
        server.stubFor(get(urlMatching("/incident-management/categories.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("IncidentManagement/getCategories.json")));
    }

    @Stub
    public void getSubcategories(WireMockServer server) {
        server.stubFor(get(urlMatching("/incident-management/subcategories.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("IncidentManagement/getSubcategories.json")));
    }

    @Stub
    public void getInteractions(WireMockServer server) {
        server.stubFor(get(urlMatching("/incident-management/interactions.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("IncidentManagement/getInteractions.json")));
    }

    @Stub
    public void getInteractionTypes(WireMockServer server) {
        server.stubFor(get(urlMatching("/incident-management/interaction-types.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("IncidentManagement/getInteractionTypes.json")));
    }

    @Stub
    public void getIncidentStatus(WireMockServer server) {
        server.stubFor(get(urlMatching("/incident-management/status.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("IncidentManagement/getIncidentStatus.json")));
    }

    @Stub
    public void hasIncident(WireMockServer server) {
        server.stubFor(get(urlMatching("/incidents/hasIncident.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBody("{\"incidents\": true}")));
    }

    @Stub
    public void createIncidentOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/incident-management/createIncident"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void createIncident(WireMockServer server) {
        server.stubFor(post(urlMatching("/incident-management/createIncident.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void createInteractionOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/incident-management/createInteraction"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void createInteraction(WireMockServer server) {
        server.stubFor(post(urlMatching("/incident-management/createInteraction.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void updateStatusOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/incident-management/updateStatus"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void updateStatus(WireMockServer server) {
        server.stubFor(post(urlMatching("/incident-management/updateStatus.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void updatePriorityOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/incident-management/updatePriority"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void updatePriority(WireMockServer server) {
        server.stubFor(post(urlMatching("/incident-management/updatePriority.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }
}
