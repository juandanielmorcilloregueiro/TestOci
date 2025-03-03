package com.simfonics.bss.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.simfonics.bss.wiremock.stubs.IWireMockStubs;
import com.simfonics.bss.wiremock.stubs.Stub;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WireMockStubsExecutor {
    public static WireMockServer execute(IWireMockStubs stubs, WireMockServer server) throws InvocationTargetException, IllegalAccessException {
        Class<?> wireMockStub = stubs.getClass();
        for (Method method : wireMockStub.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Stub.class)) {
                method.setAccessible(true);
                System.out.println("\tRunning stub "+method.getName());
                method.invoke(stubs, server);
            }
        }
        return server;
    }
}
