package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class ExternalStub implements IWireMockStubs{

    @Stub
    public void validateHLROptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/external/validateHLR"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void validateHLR(WireMockServer server) {
        server.stubFor(post(urlMatching("/external/validateHLR.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void identificarLinhaOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/external/identificarLinha"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void identificarLinha(WireMockServer server) {
        server.stubFor(post(urlMatching("/external/identificarLinha.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ExternalManagement/identificarLinha.json")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void informarFuncaoChipOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/external/informarFuncaoChip"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void informarFuncaoChip(WireMockServer server) {
        server.stubFor(post(urlMatching("/external/informarFuncaoChip.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ExternalManagement/informarFuncaoChip.json")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void getCadastroCustomerInfoOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/external/getCadastroCustomerInfo"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void getCadastroCustomerInfo(WireMockServer server) {
        server.stubFor(post(urlMatching("/external/getCadastroCustomerInfo.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ExternalManagement/getCadastroCustomerInfo.json")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void getNumerosOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/external/getNumeros"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void getNumeros(WireMockServer server) {
        server.stubFor(post(urlMatching("/external/getNumeros.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ExternalManagement/getNumeros.json")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void lockearNumeroOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/external/lockearNumero"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void lockearNumero(WireMockServer server) {
        server.stubFor(post(urlMatching("/external/lockearNumero.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void reservarNumeroOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/external/reservarNumero"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void reservarNumero(WireMockServer server) {
        server.stubFor(post(urlMatching("/external/reservarNumero.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void validaSimCardOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/external/validaSimCard"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void validaSimCard(WireMockServer server) {
        server.stubFor(post(urlMatching("/external/validaSimCard.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ExternalManagement/validaSimCard.json")
                        .withFixedDelay(5000)));
    }
}
