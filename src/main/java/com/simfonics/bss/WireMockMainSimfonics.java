package com.simfonics.bss;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.common.ConsoleNotifier;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.extension.ResponseDefinitionTransformer;
import com.simfonics.bss.wiremock.WireMockStubsExecutor;
import com.simfonics.bss.wiremock.stubs.IWireMockStubs;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class WireMockMainSimfonics {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException,
            InstantiationException {
        WireMockConfiguration wireMockConfig = WireMockConfiguration.wireMockConfig().port(9996).notifier(new ConsoleNotifier(true));
        Reflections transformationReflections = new Reflections("com.simfonics.bss.wiremock.transformations");
        Set<Class<? extends ResponseDefinitionTransformer>> transformations =
                transformationReflections.getSubTypesOf(ResponseDefinitionTransformer.class);
        for(Class c : transformations){
            wireMockConfig.extensions(c);
        }

        Reflections stubReflections = new Reflections("com.simfonics.bss.wiremock.stubs");
        Set<Class<? extends IWireMockStubs>> stubs =
                stubReflections.getSubTypesOf(IWireMockStubs.class);

        WireMockServer wireMockServer = new WireMockServer(wireMockConfig);

        for(Class c : stubs){
            System.out.println("Running class "+c.getName());
            WireMockStubsExecutor.execute((IWireMockStubs) c.getConstructor().newInstance(), wireMockServer);
        }
        wireMockServer.start();
    }
}
