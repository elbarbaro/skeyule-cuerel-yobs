package com.barbaro.squeyulecuerelyobs.tasks;

import java.util.List;

import com.barbaro.squeyulecuerelyobs.config.ScheduleProperties;

import org.springframework.stereotype.Component;

@Component
public class CurlCommandRaisaTask {

    private ScheduleProperties scheduleProperties;

    public CurlCommandRaisaTask(ScheduleProperties scheduleProperties) {
        this.scheduleProperties = scheduleProperties;
    }

    private static String SERVER_URL_TEMPLATE = "skeyule.rayita.com:%s";

    public void start() {
        int port = scheduleProperties.getPort();
        int initialPort = scheduleProperties.getInitialPort();
        int endPort = scheduleProperties.getEndPort();
        runOnyCall(port);
        runCalls(initialPort, endPort);
        System.out.println("Execute command successfully");
    }

    private void runOnyCall(int port) {
        List<String> urlList = scheduleProperties.getUrlList();
        for(String url: urlList) {
            executeCurlCall(String.format(url + ":%d", port));
        }
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
