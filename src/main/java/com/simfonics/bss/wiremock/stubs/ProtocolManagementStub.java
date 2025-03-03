package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class ProtocolManagementStub implements IWireMockStubs {
    @Stub
    public void getProtocolStatusNames(WireMockServer server) {
        server.stubFor(get(urlMatching("/protocol/getProtocolStatusNames.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProtocolManagement/getProtocolStatusNames.json")));
    }

    @Stub
    public void getProtocolsByMSISDN(WireMockServer server) {
        server.stubFor(get(urlMatching("/protocol/getProtocolsByMSISDN.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProtocolManagement/getProtocolsByMSISDN.json")));
    }

    @Stub
    public void getProtocolInterByProtocolId(WireMockServer server) {
        server.stubFor(get(urlMatching("/protocol/getProtocolInterByProtocolId.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProtocolManagement/getProtocolInterByProtocolId.json")));
    }

    @Stub
    public void openProtocolOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/protocol/openProtocol"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void openProtocol(WireMockServer server) {
        server.stubFor(post(urlMatching("/protocol/openProtocol.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProtocolManagement/openProtocol.json")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void closeProtocolOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/protocol/closeProtocol"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void closeProtocol(WireMockServer server) {
        server.stubFor(post(urlMatching("/protocol/closeProtocol.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void addProtocolInteractionListOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/protocol/addProtocolInteractionList"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void addProtocolInteractionList(WireMockServer server) {
        server.stubFor(post(urlMatching("/protocol/addProtocolInteractionList.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void getProtocolConfiguration(WireMockServer server) {
        server.stubFor(get(urlMatching("/protocol/getProtocolConfiguration.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProtocolManagement/getProtocolConfiguration.json")));
    }

    @Stub
    public void getProtocolLevel2(WireMockServer server) {
        server.stubFor(get(urlMatching("/protocol/getProtocolLevel2.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProtocolManagement/getProtocolLevel2.json")));
    }

    @Stub
    public void getProtocolLevel3(WireMockServer server) {
        server.stubFor(get(urlMatching("/protocol/getProtocolLevel3.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProtocolManagement/getProtocolLevel3.json")));
    }

    @Stub
    public void getProtocolLevel4(WireMockServer server) {
        server.stubFor(get(urlMatching("/protocol/getProtocolLevel4.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProtocolManagement/getProtocolLevel4.json")));
    }

    @Stub
    public void getProtocolByCustomer(WireMockServer server) {
        server.stubFor(get(urlMatching("/protocol/getProtocolByCustomer.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProtocolManagement/getProtocolByCustomer.json")));
    }
}
