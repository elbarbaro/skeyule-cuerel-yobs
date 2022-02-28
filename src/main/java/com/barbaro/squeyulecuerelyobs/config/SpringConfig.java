package com.barbaro.squeyulecuerelyobs.config;

import com.barbaro.squeyulecuerelyobs.tasks.CurlCommandRaisaTask;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SpringConfig {

    private CurlCommandRaisaTask curlCommandTask;

    public SpringConfig(CurlCommandRaisaTask commandRaisaTask) {
        this.curlCommandTask = commandRaisaTask;
    }

    @Scheduled(cron = "0 * * * * ?")
    public void scheduleCurlCommandTask() {
        curlCommandTask.start();
    }
}
