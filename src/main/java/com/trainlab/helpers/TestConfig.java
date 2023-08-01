package com.trainlab.helpers;

import java.io.IOException;

public class TestConfig {

    public static String browser = "chrome";
    public static String headless = "0";

    public static void initConfig() {

        try {
            System.getProperties().load(ClassLoader.getSystemResourceAsStream("browser.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
        headless = System.getProperty("headless") == null ? "0" : System.getProperty("headless");
    }

    public static boolean isHeadless() {
        return headless.contains("1");
    }
}