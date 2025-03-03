package com.simfonics.bss.wiremock.stubs;

import com.github.tomakehurst.wiremock.WireMockServer;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

public class UserStub implements IWireMockStubs{
    @Stub
    public void getUserList(WireMockServer server) {
        server.stubFor(get(urlMatching("/user-management/users.*"))
                .willReturn(aResponse()
                        .withTransformers("getUserList")));
    }

    @Stub
    public void getUserListOptions(WireMockServer server) {
        server.stubFor(options(urlMatching("/user-management/users.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token, userName, session")));
    }

    @Stub
    public void getRoleList(WireMockServer server) {
        server.stubFor(get(urlMatching("/user-management/roles.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Headers", "*")
                        .withBodyFile("UserManagement/getRoleList.json")));
    }

    @Stub
    public void getRoleListOptions(WireMockServer server) {
        server.stubFor(options(urlMatching("/user-management/roles.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token, userName, session")));
    }

    @Stub
    public void getLanguageList(WireMockServer server) {
        server.stubFor(get(urlMatching("/user-management/languages.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Headers", "*")
                        .withBodyFile("UserManagement/getLanguageList.json")));
    }

    @Stub
    public void getLanguageListOptions(WireMockServer server) {
        server.stubFor(options(urlMatching("/user-management/languages.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token, userName, session")));
    }

    @Stub
    public void getTimezoneList(WireMockServer server) {
        server.stubFor(get(urlMatching("/user-management/timezones.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Headers", "*")
                        .withBodyFile("UserManagement/getTimezoneList.json")));
    }

    @Stub
    public void getTimezoneListOptions(WireMockServer server) {
        server.stubFor(options(urlMatching("/user-management/timezones.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token, userName, session")));
    }

    @Stub
    public void deleteUserOptions(WireMockServer server) {
        server.stubFor(options(urlMatching("/user/deleteUser.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void deleteUser(WireMockServer server) {
        server.stubFor(delete(urlMatching("/user/deleteUser.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void updateUserOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/user/updateUser"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void updateUser(WireMockServer server) {
        server.stubFor(put(urlEqualTo("/user/updateUser"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)
                        .withBodyFile("UserManagement/updateUser.json")));
    }

    @Stub
    public void createUserOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/user/createUser"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void createUserPost(WireMockServer server) {
        server.stubFor(post(urlEqualTo("/user/createUser"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)
                        .withBodyFile("UserManagement/createUser.json")));
    }

    @Stub
    public void changePasswordOptions(WireMockServer server) {
        server.stubFor(options(urlEqualTo("/user/updatePassword"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "*")
                        .withHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Auth-Token")));
    }

    @Stub
    public void changePasswordPost(WireMockServer server) {
        server.stubFor(post(urlEqualTo("/user/updatePassword"))
                .willReturn(aResponse()
                        .withStatus(400)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withFixedDelay(5000)));
    }

    @Stub
    public void getIfUserBlocked(WireMockServer server) {
        server.stubFor(get(urlMatching("/user/getIfUserBlocked.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")));
    }

    @Stub
    public void passwordExpirationValidation(WireMockServer server) {
        server.stubFor(get(urlMatching("/user/passwordExpirationValidation.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json; charset=UTF-8")
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withBodyFile("UserManagement/passwordExpirationValidation.json")));
    }
}
