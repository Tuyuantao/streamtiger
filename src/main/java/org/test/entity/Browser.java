package org.test.entity;

import org.openqa.selenium.WebDriver;

/**
 * Created by tuyuantao on 2017/1/11.
 */
public interface Browser {

    WebDriver getDriver();
    String getVersion();
    String getBrowserName();
    void start(String url);
}
