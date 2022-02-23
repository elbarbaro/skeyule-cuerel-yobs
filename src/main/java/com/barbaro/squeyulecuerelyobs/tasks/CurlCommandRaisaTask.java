package com.barbaro.squeyulecuerelyobs.tasks;

import org.springframework.beans.factory.annotation.Value;

public class CurlCommandRaisaTask {

    @Value("${schedule.curl.port}")
    private int port;

    @Value("${schedule.curl.initial-port}")
    private int initialPort;

    @Value("${schedule.curl.end-port}")
    private int endPort;

    private static String SERVER_URL_TEMPLATE = "skeyule.rayita.com:%s";

    public void start() {
        runOnyCall(110);
        runCalls(10001, 23000);
        System.out.println("Execute command successfully");
    }

    private void runOnyCall(int port) {
        String url = String.format(SERVER_URL_TEMPLATE, String.valueOf(port));
        executeCurlCall(url);
    }

    private void runCalls(int initialPort, int endPort) {
        for(int i = initialPort; i <= endPort; i++) {
            String url = String.format(SERVER_URL_TEMPLATE, String.valueOf(i));
            executeCurlCall(url);
            System.out.println("Curl call " + i);
        }
    }

    private void executeCurlCall(String url) {
        System.out.println(url);
    }
}
