package com.juaracoding.ujianappium.drivers;

import com.juaracoding.ujianappium.drivers.strategies.DriverStrategyImplementer;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class DriverSingleton {

    private static AndroidDriver driver;

    public static AndroidDriver getDriver(String environment) throws MalformedURLException {
        if (driver == null) {
            driver = new DriverStrategyImplementer().setStrategy(environment);
        }
        return driver;
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}


