package com.barbaro.squeyulecuerelyobs.tasks;

import com.barbaro.squeyulecuerelyobs.utils.InputStreamUtils;

public class CurlCommandTask {

    public void start() {
        // El comando que se quiere ejucutar
        String url = "https://api.chucknorris.io/jokes/random";
        String command = String.format("curl -X GET %s", url);
        String[] commandList = command.split(" ");
        ProcessBuilder processBuilder = new ProcessBuilder(commandList);
        try {
            for(int i = 0; i < 10; i++) {
                Process process = processBuilder.start();
                InputStreamUtils.printInputStream(process.getInputStream());
                process.destroy();
                System.out.println("Execute command successfully " + (i + 1));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
