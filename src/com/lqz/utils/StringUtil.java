package com.lqz.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringUtil {

    public static String getReader(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
