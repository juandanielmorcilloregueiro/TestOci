package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class ResourceManagementStub implements IWireMockStubs{
    @Stub
    public void getResourcesByFilter(WireMockServer server) {
        server.stubFor(get(urlMatching("/resources/getResourcesByFilter.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ResourceManagement/getResourcesByFilter.json")));
    }

    @Stub
    public void getLinkedResources(WireMockServer server) {
        server.stubFor(get(urlMatching("/resources/getLinkedResources.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ResourceManagement/getLinkedResources.json")));
    }

    @Stub
    public void getResourceStatus(WireMockServer server) {
        server.stubFor(get(urlMatching("/resources/getResourceStatus.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ResourceManagement/getResourceStatus.json")));
    }

    @Stub
    public void getResourceTypes(WireMockServer server) {
        server.stubFor(get(urlMatching("/resources/getResourceTypes.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ResourceManagement/getResourceTypes.json")));
    }

    @Stub
    public void getResourceProperties(WireMockServer server) {
        server.stubFor(get(urlMatching("/resources/getResourceProperties.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ResourceManagement/getResourceProperties.json")));
    }

    @Stub
    public void getResourceBySerialNum(WireMockServer server) {
        server.stubFor(get(urlMatching("/resources/getResourceBySerialNum.*"))
                .willReturn(aResponse()
                        .withTransformers("getResourceBySerialNum")));
    }

    @Stub
    public void getDocumentTypes(WireMockServer server) {
        server.stubFor(get(urlMatching("/resources/getDocumentTypes.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ResourceManagement/getDocumentTypes.json")));
    }

    @Stub
    public void getRegionCode(WireMockServer server) {
        server.stubFor(get(urlMatching("/resources/getRegionCode.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")));
    }
}
