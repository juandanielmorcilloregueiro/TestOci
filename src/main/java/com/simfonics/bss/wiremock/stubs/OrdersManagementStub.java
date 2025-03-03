package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class OrdersManagementStub implements IWireMockStubs{
    @Stub
    public void getMenuCategories(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getMenuCategories.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/GetMenuCategories.json")));
    }

    @Stub
    public void getLinkedResources(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getLinkedResources.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getLinkedResources.json")));
    }

    @Stub
    public void getPricePlan(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getPricePlan.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getPricePlan.json")));
    }

    @Stub
    public void isHoliday(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/isHoliday.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/isHoliday.json")));
    }

    @Stub
    public void getParentPlan(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getParentPlan.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getParentPlan.json")));
    }

    @Stub
    public void getPortabilityOperators(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getPortabilityOperators.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getPortabilityOperators.json")));
    }

    @Stub
    public void getPortabilityTypes(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getPortabilityTypes.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getPortabilityTypes.json")));
    }

    @Stub
    public void getSIMCardTypes(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getSIMCardTypes.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getSIMCardTypes.json")));
    }

    @Stub
    public void getOrderTypes(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getOrderTypes.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getTypes.json")));
    }

    @Stub
    public void getOrderCategories(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getOrderCategories.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getCategories.json")));
    }

    @Stub
    public void getOrderSubcategories(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getOrderSubcategories.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getSubcategories.json")));
    }

    @Stub
    public void getOrderStatus(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getOrderStatus.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getStatus.json")));
    }

    @Stub
    public void getOrderProgress(WireMockServer server) {
        server.stubFor(get(urlMatching("/order-management/order-progress.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)
                        .withBodyFile("OrderManagement/getOrderProgress.json")));
    }

    @Stub
    public void getOrderItemsProgress(WireMockServer server) {
        server.stubFor(get(urlMatching("/order-management/order-items.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getOrderItems.json")));
    }

    @Stub
    public void getOrdersByCustomerId(WireMockServer server) {
        server.stubFor(get(urlMatching("/order-management/orders.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getOrdersByCustomerId.json")));
    }

    @Stub
    public void executeOrderOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/orders/executeOrder"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void executeOrder(WireMockServer server) {
        server.stubFor(post(urlMatching("/orders/executeOrder.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void getRechargeOrders(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getRechargeOrders.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getRechargeOrders.json")));
    }

    @Stub
    public void getRetryOrders(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getRetryOrders.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getRetryOrders.json")));
    }

    @Stub
    public void retryOrderOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/orders/retryOrder"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void retryOrder(WireMockServer server) {
        server.stubFor(post(urlMatching("/orders/retryOrder.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void getListRetryOrders(WireMockServer server) {
        server.stubFor(get(urlMatching("/orders/getListRetryOrders.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("OrderManagement/getRetryOrders.json")));
    }

    @Stub
    public void retryListOrdersOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/orders/retryListOrders"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void retryListOrders(WireMockServer server) {
        server.stubFor(post(urlMatching("/orders/retryListOrders.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }
}
