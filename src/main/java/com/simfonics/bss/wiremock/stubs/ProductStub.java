package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class ProductStub implements IWireMockStubs{
    @Stub
    public void getPromotionalProducts(WireMockServer server) {
        server.stubFor(get(urlMatching("/product/getPromotionalProducts.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProductManagement/getPromotionalProducts.json")));
    }

    @Stub
    public void getAvailableProducts(WireMockServer server) {
        server.stubFor(get(urlMatching("/product/getAvailableProducts.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProductManagement/getAvailableProducts.json")));
    }

    @Stub
    public void getProductsFU(WireMockServer server) {
        server.stubFor(get(urlMatching("/product-management/products-follow-up.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProductManagement/getProductsFU.json")));
    }

    @Stub
    public void getProductsItemFU(WireMockServer server) {
        server.stubFor(get(urlMatching("/product-management/product-items-follow-up.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProductManagement/getProductsItemFU.json")));
    }

    @Stub
    public void getProductTypes(WireMockServer server) {
        server.stubFor(get(urlMatching("/product/getProductTypes.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProductManagement/getProductTypes.json")));
    }

    @Stub
    public void getProductByIccStatus(WireMockServer server) {
        server.stubFor(get(urlMatching("/product/getProductByIccStatus.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProductManagement/getProductByIccStatus.json")));
    }

    @Stub
    public void listDefaultProductByIcc(WireMockServer server) {
        server.stubFor(get(urlMatching("/product/listDefaultProductByIcc.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("ProductManagement/listDefaultProductByIcc.json")));
    }
}
