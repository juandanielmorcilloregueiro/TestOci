package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

public class HabilitacaoManagementStub implements IWireMockStubs{
    @Stub
    public void reagendarPortInOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/habilitacao/reagendarPortIn"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void reagendarPortIn(WireMockServer server) {
        server.stubFor(post(urlMatching("/habilitacao/reagendarPortIn.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void atualizarStatusSolicitacaoOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/habilitacao/atualizarStatusSolicitacao"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void atualizarStatusSolicitacao(WireMockServer server) {
        server.stubFor(post(urlMatching("/habilitacao/atualizarStatusSolicitacao.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void cancelarPortInOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/habilitacao/cancelarPortIn"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void cancelarPortIn(WireMockServer server) {
        server.stubFor(post(urlMatching("/habilitacao/cancelarPortIn.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void getFraudTypes(WireMockServer server) {
        server.stubFor(get(urlMatching("/habilitacao/getFraudTypes.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("HabilitacaoManagement/getFraudTypes.json")));
    }

    @Stub
    public void getCancelationCodes(WireMockServer server) {
        server.stubFor(get(urlMatching("/habilitacao/getCancelationCodes.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("HabilitacaoManagement/getCancelationCodes.json")));
    }

}
