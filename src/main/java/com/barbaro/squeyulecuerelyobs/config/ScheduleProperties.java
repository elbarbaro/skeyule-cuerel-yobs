package com.barbaro.squeyulecuerelyobs.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ScheduleProperties {

    @Value("${schedule.curl.port}")
    private int port;
    @Value("${schedule.curl.initial-port}")
    private int initialPort;
    @Value("${schedule.curl.end-port}")
    private int endPort;
    @Value("${schedule.curl.urls}")
    private List<String> urlList;

    public void setPort(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setInitialPort(int initialPort) {
        this.initialPort = initialPort;
    }

    public int getInitialPort() {
        return initialPort;
    }

    public void setEndPort(int endPort) {
        this.endPort = endPort;
    }

    public int getEndPort() {
        return endPort;
    }

    public void setUrlList(List<String> urlList) {
        this.urlList = urlList;
    }

    public List<String> getUrlList() {
        return urlList;
    }
}
