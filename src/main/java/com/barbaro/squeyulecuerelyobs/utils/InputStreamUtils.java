package com.barbaro.squeyulecuerelyobs.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamUtils {
    public static void printInputStream(InputStream inputStream) {
        InputStreamReader inReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line = null;
        try {
            while((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
            }
            bufferedReader.close();
            inReader.close();
            inputStream.close();
            System.out.println(stringBuffer.toString());
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
