package org.test.entity;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by tuyuantao on 2017/1/11.
 */
public class Chrome implements Browser {

    private WebDriver driver;
    private String version;
    private String browserName;

    public Chrome() {
        this("default");
    }

    public void start(String url) {
        driver.navigate().to(url);
    }

    public Chrome(String version) {
        this.version = version;
        this.browserName = BrowserEnum.CHROME.name();
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getVersion() {
        return version;
    }

    public String getBrowserName() {
        return browserName;
    }
}
